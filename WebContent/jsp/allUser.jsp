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
<base href="<%=basePath %>">
<script type="text/javascript" src="js/jquery.min.js"></script>
<title>用户列表</title>

<script type="text/javascript">
function deleteUser(userId) {
	$.get("<%=basePath%>user/deleteUser?userId=" + userId, function(data) {
		if("success" == data.result) {
			alert("删除成功");
			window.location.reload();
		} else {
			alert("删除失败");
		}
	});
}
</script>
</head>
<body>
	<h6><a href="<%=basePath%>user/toAddUser">添加用户</a></h6>
	<table border="1">
		<tbody>
			<tr>
				<th>用户id</th>
				<th>手机号码</th>
				<th>性别</th>
				<th>年龄</th>
				<th>身份证号码</th>
				<th>照片url</th>
				<th>职业</th>
				<th>入网时间</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
			<c:if test="${!empty userList }">
				<c:forEach items="${userList }" var="user">
					<tr>
						<td>${user.userId }</td>
						<td>${user.phoneNum }</td>
						<td>${user.gender == 1?"男":"女" }</td>
						<td>${user.age }</td>
						<td>${user.identityCard }</td>
						<td><img src="<%=path%>/js/img/${user.photoUrl }" /></td>
						<td>${user.duty }</td>
						<td>${user.regTime }</td>
						<td>${user.note }</td>
						<td>
							<a href="<%=basePath%>user/findById?userId=${user.userId}">修改</a>
							<a href="<%=basePath%>user/deleteUser?userId=${user.userId}">删除</a>
							<a href="<%=basePath%>account/findAccountById?userId=${user.userId}">查看用户帐单</a>
						</td>
					</tr>
					</c:forEach>
					</c:if>
		</tbody>
	</table>

</body>
</html>