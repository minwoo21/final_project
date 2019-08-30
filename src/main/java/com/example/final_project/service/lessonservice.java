package com.example.final_project.service;

import java.util.HashMap;
import java.util.Map;

import com.example.final_project.dao.lessondao;
import com.example.final_project.repository.lessonrepository;
import com.example.final_project.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class lessonservice {

	@Autowired
	private lessonrepository repository;

	@Autowired
	private lessondao dao;

	@Autowired
	private CommonUtil commonUtil;

	public Object getList(Object dataMap) {
		String sqlMapId = "LESSON.list";

		Object resultObject = new HashMap<>();
		 ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,dataMap));
		

		return resultObject;
	}

	public Object getObject(Object dataMap) {
		String sqlMapId = "LESSON.read";
		
		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object getlesson(Object dataMap){
		String sqlMapId="LESSON.mylesson";
		
		Object resultObject = new HashMap<>();
		 ((Map<String, Object>) resultObject).put("resultList", dao.getmylesson(sqlMapId, dataMap));

		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		String uniqueSequence = (String) dataMap.get("LESSON_NUM");

		if ("".equals(uniqueSequence)) {
			uniqueSequence = commonUtil.getUniqueSequence();
		}
		dataMap.put("LESSON_NUM", uniqueSequence);

		String sqlMapId = "LESSON.insert";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;
	}

	public Object updateObject(Map<String, Object> dataMap) {
		String sqlMapId = "LESSON.update";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;

	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "LESSON.delete";

		Integer resultKey = (Integer) dao.deleteObject(sqlMapId, dataMap);

		Object resultObject = this.getList(dataMap);

		return resultObject;
	}

	public Object inputlesson(Object dataMap) {
		String sqlMapId = "LESSON.insert";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;

	}

	public Object inputlesson01(Object dataMap) {
		String sqlMapId = "LESSON.insert01";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;

	}
	
}