package com.example.final_project.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
            // 로그인 상태 시
            viewName = "home";
            modelandView = memberservice.checkLogin(paramMap, viewName);
        } else if (login == null) {
            // 초기접속 시
            viewName = "login";
        } else if (login.equals("try")) {
            // 로그인 시도 시
            String username = (String) paramMap.get("username");
            String password = (String) paramMap.get("password");
            loginID = (String) memberservice.doLogin(username, password);
            if (loginID == null) {
                // 로그인 실패
                modelandView.addObject("login", "error");
                viewName = "login";
            } else {
                // 로그인 성공
                viewName = "home";
                paramMap.put("loginid", loginID);
                modelandView = memberservice.checkLogin(paramMap, viewName);
            }
        } else if (login.equals("signup")) {
            // 회원가입 완료 시
            Object demo = memberservice.doSignup(paramMap);
            if (demo.equals(1)) {
                // 가입 성공
                modelandView.addObject("login", "signupsuccess");
            } else {
                // 가입 실패
                modelandView.addObject("login", "signupfail");
            }
            viewName = "login";
        } else if (login.equals("logout")) {
            modelandView.addObject("login", "logout");
            viewName = "login";
        } else {
            viewName = "login";
        }
        modelandView.setViewName(viewName);

        return modelandView;
    }

    @RequestMapping(value = "/signup", method = { RequestMethod.GET, RequestMethod.POST })
    public void byPass() {

    }

    @RequestMapping(value = "/signup/idcheck", method = RequestMethod.POST)
    @ResponseBody
    public String idcheck(@RequestBody Map<String, Object> paramMap) {
        String resultString = new String();
        resultString = (memberservice.checkUsername((String) paramMap.get("username")) == true) ? "success" : "";
        return resultString;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public ModelAndView logout() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView(new RedirectView("/?login=logout"));
        return modelAndView;
    }
}