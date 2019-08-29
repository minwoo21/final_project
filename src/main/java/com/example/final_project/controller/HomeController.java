package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private MemberService memberservice;

    @RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {
        String loginID = (String) paramMap.get("loginid");
        String login = (String) paramMap.get("login");
        String viewName = new String();
        if (loginID != null) {
            viewName = "home";
            modelandView.addObject("loginid", loginID);
        } else if (login == null) {
            viewName = "login";
        } else if (login.equals("try") == true) {
            String username = (String) paramMap.get("username");
            String password = (String) paramMap.get("password");
            loginID = (String) memberservice.doLogin(username, password);
            if (loginID == null) {
                modelandView.addObject("login", "error");
                viewName = "login";
            } else {
                modelandView.addObject("loginid", loginID);
                viewName = "home";
            }
        } else if (login.equals("signup")) {
            Object demo = memberservice.doSignup(paramMap);
            if (demo.equals(1) == true) {
                modelandView.addObject("login", "signupsuccess");
            } else {
                modelandView.addObject("login", "signupfail");
            }
            viewName = "login";
        } else {
            viewName = "login";
        }
        modelandView.setViewName(viewName);

        Map<String, Object> resultMap = new HashMap<String, Object>();
        return modelandView;
    }

    @RequestMapping(value = "/signup", method = { RequestMethod.GET, RequestMethod.POST })
    public void byPass() {

    }
}