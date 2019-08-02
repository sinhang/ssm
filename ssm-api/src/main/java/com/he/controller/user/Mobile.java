package com.he.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Mobile {

    @ResponseBody
    @RequestMapping(value = "/mobile", method = RequestMethod.PUT)
    public String put(HttpServletRequest request) {
        return "put mobile";
    }

    @ResponseBody
    @RequestMapping(value = "/mobile", method = RequestMethod.PATCH)
    public String patch(HttpServletRequest request) { return "mobile patch"; }
}
