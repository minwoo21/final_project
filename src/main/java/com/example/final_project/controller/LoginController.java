package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        Boolean loginBoolean = (paramMap.get("login") == "login") ? true : false;
        if (loginBoolean == true) {
            modelandView.setViewName(viewName);
        } else {

        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        return modelandView;
    }
}