<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!doctype html>
<html>
<head>
<meta charset="utf-8">
</head>

<body>
<c:forEach items="${firstList}" var="first" varStatus="status">
 <div class="list-group">
 	<a href="javascript:void(0);"  class="list-group-item active" type="button"
 	 data-toggle="collapse" data-target="#navi${status.count}" aria-expanded="false" aria-controls="navi${status.count}">
 		${first.authName}
   </a>
   <div class="list-group collapse" id="navi${status.count}" >
    <c:forEach items="${first.childList}" var="second">
    	<a href="${pageContext.request.contextPath}${second.authUrl}" class="list-group-item">${second.authName}</a>
    </c:forEach>
   </div>
 </div>
</c:forEach>

<div class="list-group">
 	<a href="javascript:void(0);"  class="list-group-item active" type="button"
 	 data-toggle="collapse" data-target="#navi123" aria-expanded="false" aria-controls="navi123">
 		客户管理
   </a>
   <div class="list-group collapse" id="navi123" >
    <a href="${pageContext.request.contextPath}/" class="list-group-item">客户列表</a>
    </div>
 </div>
 <div class="list-group">
 	<a href="javascript:void(0);"  class="list-group-item active" type="button"
 	 data-toggle="collapse" data-target="#navi1234" aria-expanded="false" aria-controls="navi1234">
 		站内信管理
   </a>
   <div class="list-group collapse" id="navi1234" >
    <a href="${pageContext.request.contextPath}/" class="list-group-item">我的站内信</a>
    </div>
 </div>

</body>
</html>