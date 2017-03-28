<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript">
document.getElementById(enter).onclick=function(){
	var a = document.getElementById(p1).value ;
	var b = document.getElementById(p2);
	if(a!=b){
	document.getElementById(p3).style.diplay="block";
	e.preventDefault();
	}
};
</script>
</head>

<body>
<div class="container">
    <div
		style="float:left">
		<img src="${pageContext.request.contextPath }/tiles/images/login-ad_03.png" style="border-width: 0; margin-left: 0;" />
	</div>
<form class="one" action="${pageContext.request.contextPath}/tiles/register" >
<table width=300px height=200px style="text-align:right;margin-top:90px">
<tr align="char"  ><td align="center">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户<input type="text"  name="rname" />
</td></tr>
<tr align="center" ><td>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码<input id="p1" type="password" name="rpass"/>
</td></tr>
<tr align="center" ><td>
	确认密码<input id="p2" type="password" name="rpass2"/>
</td></tr>
<tr align="center" ><td>
	<input id="p3" type="text" name="p3" style="display:none" value="两次密码不一致" />
</td></tr>
<tr align="left"><td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="enter" type="submit"  value="注册"   >
</td></tr>

</table>
</form>
</div>
</body>

</html>