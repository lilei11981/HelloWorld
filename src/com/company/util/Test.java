package com.company.util;

/**
 * @author lilei
 * @time 2019-10-14 12:43
 * @description
 */

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Pattern;

class X {
    public String v() {
        String str1 = decode("MjE2YWY5YTZiZDljNDI0Yjk3NzMyOTg0NzY5NjJhNDk=");

        String str_1 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (Pattern.matches("[A-Ya-y]", String.valueOf(str1.charAt(i)))) {
                str_1 += (char) (((int) (str1.charAt(i)) + 1));
            } else {
                str_1 += str1.charAt(i);
            }
        }
        return str_1;
    }
    public String encode(String txt) {
        try {
            return Base64.getEncoder().encodeToString(URLEncoder.encode(txt, "UTF-8").getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String decode(String txt) {
        try {
            txt = URLDecoder.decode(new String(Base64.getDecoder().decode(txt.getBytes())), "UTF-8") ;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return txt;
    }
    public static void main(String[] args) {
        X a = new X();
        System.out.println(a.v());
    }

}






