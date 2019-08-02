package com.he.controller.user;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录
 */
@RestController
public class Login {

    @Validated
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String post(HttpServletRequest request) {
        return "post login";
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.PUT)
    public String put(HttpServletRequest request) {
        return "put login";
    }

}
