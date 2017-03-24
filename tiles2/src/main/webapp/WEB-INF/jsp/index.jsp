<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>  
<html>
  <head>
    <title>layout</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
	<meta http-equiv="description" content="This is my page">
	<link href="${pageContext.request.contextPath}/tiles/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link href="../bootstrap-3.3.5-dist/css/bootstrap.css">
	<link href="${pageContext.request.contextPath}/tiles/Untitled-3.css" rel="stylesheet" type="text/css">
	<link href="${pageContext.request.contextPath}/tiles/Untitled-1base.css" rel="stylesheet" type="text/css">
  <body>
  <table border="0" width="100%" cellspacing="5">  
            <tr>  
                <td><tiles:insertAttribute name="header" /></td>  
            </tr>  
            <tr>  
                <td ><tiles:insertAttribute name="center" /></td>  
            </tr>  
            <tr>  
                <td><tiles:insertAttribute name="footer" /></td>  
            </tr>  
 </table>  
  </body>
<script src="jquery.min.js"></script>
<script  src="bootstrap.min.js"></script>
</html>
