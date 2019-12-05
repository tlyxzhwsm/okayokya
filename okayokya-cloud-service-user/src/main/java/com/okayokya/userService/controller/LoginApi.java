package com.okayokya.userService.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.okayokya.userService.dto.UserDto;
import com.okayokya.userService.model.User;
import com.okayokya.userService.service.LoginService;
import com.okayokya.userService.utils.SuccessOrFailure;
import com.okayokya.userService.utils.TempSession;
import com.okayokya.userService.utils.TokenFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApi {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    LoginService loginService;
    UserDto userDto;

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String register(@RequestParam String account, @RequestParam String pwd) {
        userDto = new UserDto();
        userDto.setAccount(account);
        userDto.setPassword(pwd);
        int res = loginService.register(userDto);
        if (res == 1) {
            return String.format("{\"msg\":\"%s，注册成功！\"}", account);
        } else {
            return "{\"msg\":\"注册失败\"}";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String account, @RequestParam String pwd) {
        userDto = new UserDto();
        userDto.setAccount(account);
        userDto.setPassword(pwd);
        System.out.println("userdto" + userDto);
        User user = loginService.login(userDto);
        user.setPassword("***");
        if (null != user) {
            String json = JSON.toJSONString(user);
            TempSession tempSession=new TempSession(user.getAccount(), TokenFactory.createToken()
                    ,System.currentTimeMillis()+12*60*60*1000,1);
            JSONObject jsonObject = new JSONObject();
            jsonObject.putAll(JSON.parseObject(json));
            jsonObject.putAll(JSON.parseObject(SuccessOrFailure.SUCCESS.value));
            jsonObject.putAll(JSON.parseObject(JSON.toJSONString(tempSession)));
            String res=jsonObject.toJSONString();

            redisTemplate.opsForValue().set(user.getAccount(),tempSession);

            return res;
        } else {
            return SuccessOrFailure.FAILURE.value;
        }
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(@RequestParam String account){
        System.out.println(redisTemplate.opsForValue().get(account));
        return "sss";
    }

    @RequestMapping(value = "/identify",method = RequestMethod.POST)
    public String tokenIdentify(@RequestParam String account, @RequestParam String token){
       TempSession tempSession= (TempSession) redisTemplate.opsForValue().get(account);
       if(tempSession.getExpire()<=System.currentTimeMillis()&&tempSession.getStatus()==1
       &&token.equals(tempSession.getToken())){
           return "Valid";
       }else{
           return "Expired.";
       }
    }

}
