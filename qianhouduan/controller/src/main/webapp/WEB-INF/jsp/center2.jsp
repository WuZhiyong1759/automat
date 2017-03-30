<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="t11.css" rel="stylesheet" type="text/css">
<link href="base.css" rel="stylesheet" type="text/css">
</head>
<body>
 <div class="container">

        <div class="nav-title">首页&gt;职业</div>
        <div class="nav-bar">
            <span class="">方向：</span>
            <a class="nav-bar-a a-selected" href="${pageContext.request.contextPath}/u/list">全部</a>
            <a class="nav-bar-a" href="${pageContext.request.contextPath}/u/list/1">前端开发</a>
            <a class="nav-bar-a" href="${pageContext.request.contextPath}/u/list/2">后端开发</a>
            <a class="nav-bar-a" href="${pageContext.request.contextPath}/u/list/3">移动开发</a>
            <a class="nav-bar-a" href="${pageContext.request.contextPath}/u/list/4">整站开发</a>
            <a class="nav-bar-a" href="${pageContext.request.contextPath}/u/list/5">运营维护</a>
        </div>
 		<div class="caption">
            <h4>前端开发方向</h4>
        </div>
        <div class="row">
		<c:forEach items="${list}" var="career">
		<c:if test="${career.cType==1}">
        
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">

                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="${pageContext.request.contextPath}/tiles/images/687.png"></div>
                        <div class="text">
                            <h4 class="">${career.cName}</h4>
                            <p class="text-present">${career.cDescri}</p>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 
                             <c:forEach begin="1" end="${career.cDegree}" step="1">
                            <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度
                            <c:forEach begin="1" end="${career.cLevel}" step="1">
                             <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                             </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${career.cTime}</span>年</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${career.cRare}</span>家公司需要</div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                          	  薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages">${career.cSalary1}k/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">1-3年</div>
                                <div class="rightWarp-wages">${career.cSalary2}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">3-5年</div>
                                <div class="rightWarp-wages">${career.cSalary3}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有${career.cStu}人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${career.cTips}</p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">${career.cName}工程师</p>
                        <p class="flip-text">${career.cIntroduce}</p>
                    </div>
                </div>
            </div>
        
        </c:if>
		</c:forEach>	
		</div>
		
		
		<div class="caption">
            <h4>后端开发方向</h4>
        </div>
         <div class="row">
        <c:forEach items="${list}" var="career">
		<c:if test="${career.cType==2}">
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">

                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="${pageContext.request.contextPath}/tiles/images/687.png"></div>
                        <div class="text">
                            <h4 class="">${career.cName}</h4>
                            <p class="text-present">${career.cDescri}</p>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 
                             <c:forEach begin="1" end="${career.cDegree}" step="1">
                            <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度
                            <c:forEach begin="1" end="${career.cLevel}" step="1">
                             <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                             </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${career.cTime}</span>年</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${career.cRare}</span>家公司需要</div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                          	  薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages">${career.cSalary1}k/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">1-3年</div>
                                <div class="rightWarp-wages">${career.cSalary2}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">3-5年</div>
                                <div class="rightWarp-wages">${career.cSalary3}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有${career.cStu}人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${career.cTips}</p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">${career.cName}工程师</p>
                        <p class="flip-text">${career.cIntroduce}</p>
                    </div>
                </div>
            </div>
        
        </c:if>
		</c:forEach>
		</div>
        
        
        
        <div class="caption">
            <h4>移动开发方向</h4>
        </div>
         <div class="row">
        <c:forEach items="${list}" var="career">
		<c:if test="${career.cType==3}">
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">

                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="${pageContext.request.contextPath}/tiles/images/687.png"></div>
                        <div class="text">
                            <h4 class="">${career.cName}</h4>
                            <p class="text-present">${career.cDescri}</p>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 
                             <c:forEach begin="1" end="${career.cDegree}" step="1">
                            <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度
                            <c:forEach begin="1" end="${career.cLevel}" step="1">
                             <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                             </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${career.cTime}</span>年</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${career.cRare}</span>家公司需要</div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                          	  薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages">${career.cSalary1}k/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">1-3年</div>
                                <div class="rightWarp-wages">${career.cSalary2}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">3-5年</div>
                                <div class="rightWarp-wages">${career.cSalary3}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有${career.cStu}人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${career.cTips}</p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">${career.cName}工程师</p>
                        <p class="flip-text">${career.cIntroduce}</p>
                    </div>
                </div>
            </div>
        </c:if>
		</c:forEach>
		 </div>
		 
		 
        <div class="caption">
            <h4>整站开发方向</h4>
        </div>
          <div class="row">
        <c:forEach items="${list}" var="career">
		<c:if test="${career.cType==4}">
		
		 <div class="col-md-4 col-sm-6 col-xs-12 top-margin">

                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="${pageContext.request.contextPath}/tiles/images/687.png"></div>
                        <div class="text">
                            <h4 class="">${career.cName}</h4>
                            <p class="text-present">${career.cDescri}</p>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 
                             <c:forEach begin="1" end="${career.cDegree}" step="1">
                            <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度
                            <c:forEach begin="1" end="${career.cLevel}" step="1">
                             <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                             </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${career.cTime}</span>年</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${career.cRare}</span>家公司需要</div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                          	  薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages">${career.cSalary1}k/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">1-3年</div>
                                <div class="rightWarp-wages">${career.cSalary2}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">3-5年</div>
                                <div class="rightWarp-wages">${career.cSalary3}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有${career.cStu}人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${career.cTips}</p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">${career.cName}工程师</p>
                        <p class="flip-text">${career.cIntroduce}</p>
                    </div>
                </div>
            </div>
		
        <div class="row">
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">

                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="${pageContext.request.contextPath}/tiles/images/687.png"></div>
                        <div class="text">
                            <h4 class="">${career.cName}</h4>
                            <p class="text-present">${career.cDescri}</p>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 
                             <c:forEach begin="1" end="${career.cDegree}" step="1">
                            <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度
                            <c:forEach begin="1" end="${career.cLevel}" step="1">
                             <img src="${pageContext.request.contextPath}/tiles/images/xx.png"><img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                             </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${career.cTime}</span>年</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${career.cRare}</span>家公司需要</div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                          	  薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages">${career.cSalary1}k/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">1-3年</div>
                                <div class="rightWarp-wages">${career.cSalary2}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">3-5年</div>
                                <div class="rightWarp-wages">${career.cSalary3}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有${career.cStu}人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${career.cTips}</p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">${career.cName}工程师</p>
                        <p class="flip-text">${career.cIntroduce}</p>
                    </div>
                </div>
            </div>
        </div>
        </c:if>
		</c:forEach>
		 </div>
		 
		 
		 
        <div class="caption">
            <h4>运营维护方向</h4>
        </div>
          <div class="row">
		<c:forEach items="${list}" var="career">
		<c:if test="${career.cType==5}">
      
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">

                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="${pageContext.request.contextPath}/tiles/images/687.png"></div>
                        <div class="text">
                            <h4 class="">${career.cName}</h4>
                            <p class="text-present">${career.cDescri}</p>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 
                             <c:forEach begin="1" end="${career.cDegree}" step="1">
                            <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度
                            <c:forEach begin="1" end="${career.cLevel}" step="1">
                             <img src="${pageContext.request.contextPath}/tiles/images/xx.png">
                             </c:forEach>
                             </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${career.cTime}</span>年</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${career.cRare}</span>家公司需要</div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                          	  薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages">${career.cSalary1}k/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">1-3年</div>
                                <div class="rightWarp-wages">${career.cSalary2}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">3-5年</div>
                                <div class="rightWarp-wages">${career.cSalary3}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有${career.cStu}人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${career.cTips}</p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">${career.cName}工程师</p>
                        <p class="flip-text">${career.cIntroduce}</p>
                    </div>
                </div>
            </div>
        
        </c:if>
		</c:forEach>
		</div>



</div>
</body>
</html>