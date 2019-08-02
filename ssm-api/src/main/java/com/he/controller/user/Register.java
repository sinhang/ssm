package com.he.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户注册
 */
@RestController
public class Register {

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String post(HttpServletRequest request) {
        return "post register";
    }

}
