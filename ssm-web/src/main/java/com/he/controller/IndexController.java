package com.he.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@Slf4j
public class IndexController {

    @RequestMapping(value = {"/", "/index"})
    public String index(Map<String, Object> model) {
//        ModelAndView modelAndView = new ModelAndView("a");
//        log.error("request: {}", modelAndView.getViewName());
//        log.error("request view: {}", modelAndView.getView());
//        modelAndView.setViewName("");
        model.put("xxx", "ooo");
        return "a";
    }

}
