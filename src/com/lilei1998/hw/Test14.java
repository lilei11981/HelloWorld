package com.lilei1998.hw;

import com.lilei1998.util.MD5RestService;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-09-18
 * Time: 下午5:56
 * Description:
 */

public class Test14 {

    public static void main(String[] args) {
        String string = UUID.randomUUID().toString();
        String password = null;
        System.out.println(string);
        try {
             password = MD5RestService.md5Encrypt(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(password);
    }
}
