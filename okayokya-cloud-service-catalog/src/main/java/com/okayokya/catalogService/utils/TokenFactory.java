package com.okayokya.catalogService.utils;

import java.util.UUID;

/***
 * @ClassName: TokenFactory
 * @Description:
 * @Auther: wsm_djy
 * @Date: 2019/11/29 22:52
 * @version : V1.0
 */
public class TokenFactory {

    public static  String createToken(){

        return String.format("okayokya-%s",UUID.randomUUID().toString());
    }
}
