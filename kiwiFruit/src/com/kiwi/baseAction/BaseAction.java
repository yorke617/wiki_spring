package com.kiwi.baseAction;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;


public class BaseAction {
	
	/**
	 * 将从页面获取的json数据转化成javaBean
	 * @param JsonParams
	 * @param clazz
	 * @return
	 */
	public Object getPage(String JsonParams,Class clazz){
		Object page = JSONObject.toBean(JSONObject.fromObject(JsonParams), clazz);
		return page;
	}
	
	
}
