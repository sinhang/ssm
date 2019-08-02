package com.he.utils;

import javax.servlet.http.HttpServletRequest;

public class F {

    /**
     * 生成签名
     * @param request
     * @return
     */
    public static String generateSign(HttpServletRequest request) {
        return request.getParameter("sign");
    }

    /**
     * 检验签名
     * @param request
     * @return
     */
    public static Boolean checkSign(HttpServletRequest request) {
        return F.generateSign(request).equals(request.getParameter("sign"));
    }

}
