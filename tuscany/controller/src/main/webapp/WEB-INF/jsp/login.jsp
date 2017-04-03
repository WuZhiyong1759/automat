<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

</head>
<body>
<p>
<div class="container">
    <div style="float:left">
		<img src="${pageContext.request.contextPath }/tiles/images/login-ad_03.png" style="border-width: 0; margin-left: 0;" />
	</div>
<form action="${pageContext.request.contextPath}/tiles/login/do" >
<table	width=300px height=200px style="text-align:right;margin-top:90px" >
<tr align="char"  ><td align="center">
	用户<input type="text"  name="rname" />
</td></tr>
<tr align="center" ><td>
	密码<input type="password" name="rpass"/>
</td></tr>
<tr align="left"><td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  value="登录"   >
</td></tr>

</table>
</form>
</div>
<p>
</body>

</html>