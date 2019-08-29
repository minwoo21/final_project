package com.example.final_project.service;

import com.example.final_project.dao.ClassDao;
import com.example.final_project.repository.ClassRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

	@Autowired
	private ClassRepository repository;

	@Autowired
	private ClassDao dao;

	public Object getnoticeList(Object dataMap) {
		String sqlMapId = "classnotice.list";

		Object resultObject = dao.getList(sqlMapId, dataMap);

		return resultObject;
	}

	public Object getnoticeObject(Object dataMap) {
		String sqlMapId = "classnotice.read";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}
}
