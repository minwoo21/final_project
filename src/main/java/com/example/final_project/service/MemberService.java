package com.example.final_project.service;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.dao.MemberDao;
import com.example.final_project.repository.MemberRepository;
import com.example.final_project.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;

    @Autowired
    private MemberDao dao;

    @Autowired
    private CommonUtil commonUtil;

    public Object doLogin(String username, String password) {
        String sqlMapId = "member.login";
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("USERNAME", username);
        dataMap.put("PASSWORD", password);
        return dao.getObject(sqlMapId, dataMap);
    }

    public Object doSignup(Map<String, Object> dataMap) {
        String sqlMapId = "member.signup";
        return dao.saveObject(sqlMapId, dataMap);
    }

    public Boolean checkUsername(String username) {
        String sqlMapId = "member.checkusername";
        Integer usernameExist = (Integer) dao.getObject(sqlMapId, username);
        Boolean result = (usernameExist == null) ? true : false;
        return result;
    }

    public ModelAndView checkLogin(Map<String, Object> paramMap, String viewName) {
        ModelAndView modelAndView = new ModelAndView();
        String loginID = (String) paramMap.get("loginid");
        if (loginID != null) {
            Map<String, Object> dataMap = new HashMap<String, Object>();
            String sqlMapId = "member.info";
            dataMap = (Map<String, Object>) dao.getObject(sqlMapId, loginID);
            modelAndView.addObject("username", dataMap.get("USERNAME"));
            modelAndView.addObject("name", dataMap.get("NAME"));
            modelAndView.addObject("membertype", dataMap.get("MEMBERTYPE"));
            modelAndView.addObject("loginid", loginID);
            modelAndView.setViewName(viewName);
        } else {
            modelAndView.setView(new RedirectView("/"));
        }
        return modelAndView;
    }

    public Map<String, Object> getMemberInfo(Map<String, Object> paramMap) {
        String loginID = (String) paramMap.get("loginid");
        String sqlMapId = "member.info";
        return (Map<String, Object>) dao.getObject(sqlMapId, loginID);
    }
}