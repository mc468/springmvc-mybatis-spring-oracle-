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
<title>账户列表</title>
</head>
<body>
<h6>账户列表</h6>
<table border="1">
		<tbody>
			<tr>
				<th>账单记录编码</th>
				<th>用户id</th>
				<th>账期</th>
				<th>套餐基本费</th>
				<th>本地通话费</th>
				<th>漫游通话费</th>
				<th>国际长话费</th>
				<th>国际漫游费</th>
				<th>合计</th>
				<th>交费标志</th>
				<th>缴费时间</th>
				<th>交费</th>
			</tr>
			<c:if test="${!empty accountList }">
				<c:forEach items="${accountList }" var="account">
					<tr>
						<td>${account.userAcctCode }</td>
						<td>${account.userId }</td>
						<td>${account.yyyyMM}</td>
						<td>${account.suitFee }</td>
						<td>${account.talkFee }</td>
						<td>${account.roamingFee }</td>
						<td>${account.iLongFee }</td>
						<td>${account.iRoamingFee }</td>
						<td>${account.total }</td>
						<td>
						<c:if test="${account.payedFlag ==1 }"><img src="<%=path%>/js/img/smile.jpg" /></c:if>
						<c:if test="${account.payedFlag ==0 }"><img src="<%=path%>/js/img/sad.jpg" /></c:if>
						</td>
						<td>${account.payTime }</td>
						<td>
						<c:if test="${account.payedFlag == 1 }">已缴费</c:if>
	   					<c:if test="${account.payedFlag == 0 }">
						<a href="<%=basePath%>account/payAccount?userAcctCode=${account.userAcctCode}">交费</a>
						</c:if>
						</td>
					</tr>
					</c:forEach>
					</c:if>
		</tbody>
	</table>

</body>
</html>