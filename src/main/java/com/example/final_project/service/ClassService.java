package com.example.final_project.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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

		Object resultObject = new HashMap<>();
		((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,dataMap));


		return resultObject;
	}
	public Object getmember(Object dataMap) {
		String sqlMapId = "classnotice.member";

		Object resultObject = new HashMap<>();
		((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,dataMap));


		return resultObject;
	}

	public Object getnoticeObject(Object dataMap) {
		String sqlMapId = "classnotice.read";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}
	public Object saveObject(Map<String, Object> dataMap) {
		SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy-MM-dd", Locale.KOREA );
		Date currentTime = new Date ();
		String mTime = mSimpleDateFormat.format ( currentTime );
		dataMap.put("DATE", mTime);
		
		String sqlMapId = "classnotice.insert";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getnoticeList(dataMap);

		return resultObject;
	}
}
