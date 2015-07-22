<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <h1>用户列表</h1>
    <table>
    	<tr>
    		<th>ID</th>
    		<th>用户名</th>
    		<th>邮箱</th>
    		<th>注册Ip</th>
    		<th>注册时间</th>
    	</tr>
    	<c:choose>
    		<c:when test="${empty users}">
    			<tr><td colspan="5"><li>暂无先关数据</li></td></tr>
    		</c:when>
    		<c:otherwise>
    			<c:forEach items="${users}" var="user">
    				<tr>
    					<td>${user.uid}</td>
    					<td>${user.username}</td>
    					<td>${user.email}</td>
    					<td>${user.regIp}</td>
 						<td>${user.regDate}</td>
    				</tr>
    			</c:forEach>
    		</c:otherwise>
    	</c:choose>
    </table>
    <s:debug/>
  </body>
</html>
