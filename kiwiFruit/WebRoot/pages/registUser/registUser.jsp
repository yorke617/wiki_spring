<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
	String ctxpath = request.getContextPath();
%>
<html>
  <head>
    <title>注册</title>
	
	<link rel="stylesheet" type="text/css" href="<%=ctxpath%>/style/registUser.css">
	<script type="text/javascript" src="<%=ctxpath%>/javaScript/jquery-3.2.0.js"></script>
	<script type="text/javascript" src="<%=ctxpath%>/javaScript/baseScript.js"></script>
	<script type="text/javascript" src="<%=ctxpath%>/javaScript/registUser.js"></script>
	
  </head>
  
  <body>
    <div>
    	<fieldset title="查询信息" >
    		<legend>查询信息</legend> 
	    	<div class="registButton" onclick="query()">查询</div>
	    	<table border="1" cellspacing="0">
	    		<tr>
	    			<th width="80">登录名</th>
	    			<th width="80">密码</th>
	    			<th width="80">用户类型</th>
	    		</tr>
	    		<tr>
	    			<td id="loginname"></th>
	    			<td id="password"></th>
	    			<td id="usertype"></th>
	    		</tr>
	    	</table>
    	</fieldset>
    	<div id="form">
    		<fieldset title="注册信息" >
    			<legend>注册信息</legend> 
	    		<div class="header">
		    		<span>用户名：</span>
		    		<input id="name" name="name" type="text"/>
	    		</div>
	    		<div class="header">
		    		<span>密码：</span>
		    		<input id="pass" name="password" type="password"/>
	    		</div>
    			<button type="button" onclick="regist()">登录</button>
    		</fieldset>
    	</div>
    </div>
  </body>
</html>
