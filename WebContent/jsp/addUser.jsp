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
<script type="text/javascript" src="js/jquery-1.7.1.js"></script>
<title>添加用户</title>

<script type="text/javascript">
function addUser() {
	var form = document.forms[0];
	form.action="<%=basePath%>user/addUser";
	form.method="post";
	form.submit();
}

function check() {
   var form = document.getElementById('userForm'),
      username = document.getElementById('phoneNum');
   form.onsubmit = function () {
      if (username && username.value) {
         return true;
      }
      alert('请填写用户名');
      return false;
   }
}
</script>

</head>
<body>
	<h1>添加用户</h1>
	<form action="<%=basePath%>user/addUser" name="userForm" method="post">
		手机号：<input type="text" name="phoneNum" onkeyup="this.value=this.value.replace(/[^0-9]/g,'')" 
												  onafterpaste="this.value=this.value.replace(/[^0-9]/g,'')"
												  required="true" />
		性别：<input type="radio" name="gender" value="1" checked="checked" />男
			  <input type="radio" name="gender" value="2" />女
		年龄：<input type="text" name="age" />
		身份证号码：<input type="text" name="identityCard" />
		图片：<input type="file" name="photoUrl" />
		职业：<input type="text" name="duty" />
		入网时间：<input type="date" name="regTime" />
		备注：<input type="text" name="note" />
		<input type="submit" value="添加" onclick="check()" />
		</form>
</body>
</html>
<%-- <form id="addUserForm" method="post"
			action="${pageContext.request.contextPath}/user/addUser">
		<table>
			<tr>
				<td>
					手机号码 : 
				</td>
				<td>
					<input name="phoneNum" type="text" 
						onblur="if(this.value.replace(/^ +| +$/g,'')=='')
							alert('不能为空!')"
						onKeyUp="value=value.replace(/\D/g,'')">
				</td>
			</tr>
			<tr>
				<td>
					年龄 : 
				</td>
				<td>
					<input type="text" name="age" value="" />
				</td>
			</tr>
			<tr>
				<td>
					性别 : 
				</td>
				<td>
					<input type="radio" name="gender" value="1" checked="checked" />男
					<input type="radio" name="gender" value="2" />女
				</td>
			</tr>
			<tr>
				<td>
					身份证号 : 
				</td>
				<td>
					<input type="text" name="identityCard" value="" />
				</td>
			</tr>
			<tr>
	            <td>上传图片:</td>
	            <td>
	            	 <input type="file" name="photoUrl"/>
	            </td>
	        </tr>
			<tr>
				<td>
					职业 : 
				</td>
				<td>
					<select id="cc" class="easyui-combobox" name="duty" style="width:140px;">   
					    <option value="学生">学生</option>   
					    <option value="老师">老师</option>   
					    <option value="经理">经理</option>   
					    <option value="职员">职员</option>   
					    <option value="CEO">CEO</option>      
					</select>  
				</td>
			</tr>
			<tr style="height:50px">
				<td>
					备注 : 
				</td>
				<td>
					<textarea rows="3" cols="15" name="note"></textarea>
				</td> 
			</tr>
			<tr>
				<td>
					入网日期 : 
				</td>
				<td>
					<input name="regTime" type="text" class="easyui-datetimebox" required="required"/>
				</td>
			</tr>
			<tr style="text-align: center;">
				<td colspan="2">
					<a href="#" class="easyui-linkbutton" 
						data-options="iconCls:'icon-save',plain:true"
						onclick="addUser();">
						保存
					</a>
				</td>
			</tr>
		</table>
		</form> --%>