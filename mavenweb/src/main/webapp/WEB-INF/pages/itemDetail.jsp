<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<form>
		<table width="100%" border=1>
			<c:forEach items="${items}" var="item" varStatus="i">
				<tr>
					<td>姓名</td>
					<td> ${item.name } </td>
				</tr>
				<tr>
					<td>金额</td>
					<td> ${item.money } </td>
					<td>
				</td>
				</tr>
			</c:forEach>
		</table>
	</form>
<a href="/mavenweb/update.jsp">修改</a>
</body>
</html>