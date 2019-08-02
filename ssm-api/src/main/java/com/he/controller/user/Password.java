package com.he.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 修改密码
 */
@RestController
public class Password {

    @ResponseBody
    @RequestMapping(value = "/password", method = RequestMethod.PUT)
    public String put(HttpServletRequest request) {
        return "password put";
    }

}
