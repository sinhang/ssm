package com.he.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @ResponseBody
    @RequestMapping(value = "/rest")
    public String index(HttpServletRequest request) {
        return "rest controller index";
    }
}
