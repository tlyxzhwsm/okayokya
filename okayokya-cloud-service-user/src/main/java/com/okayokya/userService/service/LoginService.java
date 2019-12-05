package com.okayokya.userService.service;

import com.okayokya.userService.dao.UserDao;
import com.okayokya.userService.dto.UserDto;
import com.okayokya.userService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class LoginService {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    UserDao userDao;

    public User login(UserDto userDto){
/*        stringRedisTemplate.opsForValue().set("test","123456");
        System.out.println("已放入redis中");
        String str= (String) stringRedisTemplate.opsForValue().get("test");
        System.out.println("--->"+str);*/
     User user = userDao.login(new User(userDto.getId(),null,userDto.getDeleted(),
             userDto.getAccount(),userDto.getPassword(),
             userDto.getMobile(),userDto.getRegDate(),userDto.getRegType(),
             userDto.getEmail(),
             userDto.getNickname(),userDto.getIconPath(),
             userDto.getStatus(),userDto.getActiveKey(),
             userDto.getAge(),userDto.getGender(),userDto.getPoints()
     ));
        System.out.println("user"+ user);
        return user;
    }

    public int register(UserDto userDto){

        int res=userDao.register(new User(userDto.getId(),null,userDto.getDeleted(),
                userDto.getAccount(),userDto.getPassword(),
                userDto.getMobile(),userDto.getRegDate(),userDto.getRegType(),
                userDto.getEmail(),
                userDto.getNickname(),userDto.getIconPath(),
                userDto.getStatus(),userDto.getActiveKey(),
                userDto.getAge(),userDto.getGender(),userDto.getPoints()
                ));
        return  res;
    }
}
