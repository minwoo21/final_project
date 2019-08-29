package com.example.final_project.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.example.final_project.dao.HwLDao;
import com.example.final_project.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HwService {


	@Autowired
	private HwLDao dao;

	@Autowired
	private CommonUtil commonUtil;

	public Object getList(Object dataMap) {
		String sqlMapId = "homework.list";

		Object resultObject = new HashMap<>();
		((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,dataMap));

		return resultObject;
	}

	public Object getObject(Object dataMap) {
		String sqlMapId = "homework.read";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}
	public Object getmember(Object dataMap) {
		String sqlMapId = "homework.check";

		Object resultObject = new HashMap<>();
		((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,dataMap));

		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		
		String sqlMapId = "homework.insert";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getList(dataMap);

		return resultObject;
	}

	public Object submitObject(Map<String, Object> dataMap) {
		SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy-MM-dd", Locale.KOREA );
		Date currentTime = new Date ();
		String mTime = mSimpleDateFormat.format ( currentTime );

		String sqlMapId = "homework.submit";
		
		dataMap.put("DATE", mTime);
		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getList(dataMap);

		return resultObject;
	}
	public Object updateObject(Map<String, Object> dataMap) {
		Object resultObject = this.getObject(dataMap);

		return resultObject;

	}

	public Object deleteObject(Object dataMap) {
		Object resultObject = this.getObject(dataMap);

		return resultObject;
	}
}
