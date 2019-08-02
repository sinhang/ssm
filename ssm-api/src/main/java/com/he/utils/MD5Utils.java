package com.he.utils;

import org.springframework.util.DigestUtils;

public class MD5Utils {

    private static final String salt = "&%5123***&&%%$$#@";

    public static String encryotion(String str) {
        String base = str + "/" + salt;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

}
