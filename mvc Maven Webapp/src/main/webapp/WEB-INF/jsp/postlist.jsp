<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form >
<table width="100%" border=1>
<tr>
	<td>ID</td>
	<td>姓名</td>
	<td>qq号码</td>
	<td>类型</td>
	<td>预计入学时间</td>
	<td>毕业大学</td>
	<td>线上学号</td>
	<td>链接</td>
	<td>口号</td>
	<td>推荐人</td>
	<td>提交时间</td>
	<td>更新时间</td>
	<td>批准状态</td>
</tr>
<c:forEach items="${postlist}" var="post">
<tr>
	<td>${post.stu_id}</td>
	<td>${post.stu_name}</td>
	<td>${post.stu_qq}</td>
	<td>${post.stu_type}</td>
	<td>${post.stu_entertime}</td>
	<td>${post.stu_school}</td>
	<td>${post.stu_code}</td>
	<td>${post.stu_link}</td>
	<td>${post.stu_wish}</td>
	<td>${post.recommend}</td>
	<td>${post.posttime}</td>
	<td>${post.updatetime}</td>
	<td>${post.stu_statue}</td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>