package com.example.final_project.service;

import com.example.final_project.dao.MemberDao;
import com.example.final_project.repository.LoginRepository;
import com.example.final_project.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repository;

    @Autowired
    private MemberDao dao;

    @Autowired
    private CommonUtil commonUtil;

    public Object doLogin(Object dataMap) {
        String sqlMapId = "member.login";
        Object result = dao.getObject(sqlMapId, dataMap);
        return result;
    }
}