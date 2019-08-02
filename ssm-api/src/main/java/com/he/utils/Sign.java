package com.he.utils;

import lombok.extern.slf4j.Slf4j;
import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Slf4j
public class Sign {


    static Sign instance = null;

    /**
     * 获取单例
     * @return
     */
    public static Sign getInstance() {
        if (instance == null) {
            instance = new Sign();
        }
        return instance;
    }

    /**
     * 生成签名
     * @param request
     * @param version
     * @param appid
     * @return
     */
    public String generateSign(HttpServletRequest request, String version, Integer appid) {
        Enumeration<String> requestName =  request.getParameterNames();
        String values = "";
        while (requestName.hasMoreElements()) {
            String name = requestName.nextElement();
            if (name.equals("sign")) {
                continue;
            }
//            values
            values = values.concat(request.getParameter(name));
//            values += request.getParameter(name);
        }
        values = values.concat(Sign.getSecretKey(version, appid));
        log.info("values: {}", values);
        return MD5Utils.encryotion(values);
    }

    /**
     * 校验签名
     * @param request
     * @param version
     * @param appid
     * @return
     */
    public Boolean checkSign(HttpServletRequest request, String version, Integer appid) {
        String sign = request.getParameter("sign");
        return generateSign(request, version, appid).equals(sign);
    }

    public static String getSecretKey(String version, Integer appid) {
        return "123456789";
    }

}
