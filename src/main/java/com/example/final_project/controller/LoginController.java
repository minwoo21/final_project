package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private LoginService service;

    @RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {
        Boolean loginBoolean = (paramMap.get("login") == "login") ? true : false;
        String viewName = new String();
        if (loginBoolean == true) {
            viewName = "/home";
            modelandView.addObject("login", "login");
        } else {
            String username = (String) paramMap.get("username");
            String password = (String) paramMap.get("password");
            if (username != null && password != null) {
                viewName = "/home";
                modelandView.addObject("login", "login");
            } else {
                viewName = "/login";
            }
            modelandView.setViewName(viewName);
        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        return modelandView;
    }
}