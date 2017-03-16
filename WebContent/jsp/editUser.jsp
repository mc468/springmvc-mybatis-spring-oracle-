<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>编辑用户</title>
<script type="text/javascript">
	function modifyUser() {
		var form = document.forms[0];
		form.action="<%=basePath%>user/modifyUser";
		form.method="post";
		form.submit();
		
	}
</script>
</head>
<body>
	<h1>编辑用户</h1>
	<form action="" name="userForm">
		<input type="hidden" name="userId" value="${user.userId }"/>
		手机号：<input type="text" name="phoneNum" onkeyup="this.value=this.value.replace(/[^0-9]/g,'')" 
												  onafterpaste="this.value=this.value.replace(/[^0-9]/g,'')"
												  required="true" value="${user.phoneNum }" />
		性别：<input type="radio" name="gender" value="1" checked="checked" />男
			  <input type="radio" name="gender" value="2" />女
		年龄：<input type="text" name="age" value="${user.age }" />
		身份证号码：<input type="text" name="identityCard" value="${user.identityCard }" />
		图片：<input type="file" name="photoUrl" value="${user.photoUrl }" />
		职业：<input type="text" name="duty" value="${user.duty }" />
		入网时间：<input type="date" name="regTime" value="${user.regTime }" />
		备注：<input type="text" name="note" value="${user.note }" />
		<input type="button" value="编辑" onclick="modifyUser()" />
		</form>
</body>
</html>