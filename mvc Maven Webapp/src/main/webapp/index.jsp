<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index.jsp</title>
</head>	
<body>
<h2>Hello World!</h2>
	<form	action="${pageContext.request.contextPath}/post/post/name.do"  method="get">
	姓名<input type= "text" name="stu_name">
	<input type ="submit" value="submit">
	</form>
	
	<form	action="${pageContext.request.contextPath}/post/post.do" method="post">
	<table width="70%" border="0" cellspacing="2" align="center">
	<tr>
	<td> 姓名</td>
	<td> <input type="text" name ="post.stu_name " > </td>	
	</tr>
	<tr>
	<td>qq号</td>
	 <td> <input type="text" name ="post.stu_qq"  > </td>	
	</tr>
	<tr>
	<td>类型</td>
	<td>	<input type="text" name ="post.stu_type"  >	</td>	
	</tr>
	<tr>
	<td>入学时间</td>
	<td>	<input type="text" name ="post.stu_entertime"></td>		
	</tr>
	<tr> 
	<td>毕业学校</td>
	<td>   <input type="text" name ="post.stu_school" >	</td>	
	</tr>
	<tr>
	<td>学号</td>
	<td>	<input type="text" name ="post.stu_code" >	</td>	
	</tr>
	<tr>
	<td>日报链接</td>
	<td>	<input type="text" name ="post.stu_link" >	</td>	
	</tr>
	<tr>
	<td>口号</td>
	<td>	<input type="text" name ="post.stu_wish "  >	</td>	
	</tr>
	<tr>
	<td>推荐人</td>
	<td>	<input type="text" name ="post.recommend" >	</td>	
	</tr>
	<tr>
	<td>	<input type ="submit" value="提交">	 </td>	
	</tr>
	</table>
	</form>
	
	<form	action="${pageContext.request.contextPath}/post/post/delete.do" >
	id<input type= "text" name="stu_id">
	<input type ="submit" value="submit">
	</form>
	<form	action="${pageContext.request.contextPath}/post/post/update.do" >
	姓名<input type= "text" name="stu_id">
	状态<input type= "text" name="stu_statue">
	<input type ="submit" value="submit">
	
	</form>

</body>
</html>
