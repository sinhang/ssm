package com.he.utils;

import com.alibaba.fastjson.JSONObject;

public class Response {
    public static String json() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("msg", "success");
        jsonObject.put("data", "");
        return jsonObject.toJSONString();
    }
}
