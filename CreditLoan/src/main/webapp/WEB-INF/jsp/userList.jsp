<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title>用户管理 - 用户列表</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/static/css/layout.css" rel="stylesheet">
  </head>
  <body>
    <!-- 头部 -->
    <jsp:include page="header.jsp"/>
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <jsp:include page="navibar.jsp"/>
         </div>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">用户列表</h1>
          <div class="row placeholders">
          <div>
          <form action="${pageContext.request.contextPath}/list.action" method="post">
	          <input type="text" name="userCode"  placeholder="用户名" value="${param.userCode}" maxlength="50">
	          &nbsp;
	          <select  name="userState">
		          <option value="">=状态=</option>
		          <option value="1" ${param.userState=='1'?'selected="selected"':''}>启用</option>
		          <option value="0" ${param.userState=='0'?'selected="selected"':''}>禁用</option>
	          </select>  &nbsp;
	          <input type="date" name="startTime"  placeholder="开始时间" value="${param.startTime}">
	            &nbsp;
	            <input type="date" name="endTime"  placeholder="结束时间" value="${param.endTime}">
	           &nbsp;
	           <input type="submit" value="查询"/>
           </form>
          </div><br/>
         	<div>
         	
                <button type="button" class="btn btn-warning delete-query" data-toggle="modal" data-target="#delete-confirm-dialog">删除所选</button>
                <!--  删除所选对话框 -->
                <div class="modal fade " id="delete-confirm-dialog" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
                  <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" >警告</h4>
                      </div>
                      <div class="modal-body">
                        确认删除所选用户吗
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="button" class="btn btn-primary delete-selected-confirm">确认</button>
                      </div>
                    </div>
                  </div>
                </div>
                 <button type="button" class="btn btn-primary show-user-form" data-toggle="modal" data-target="#add-user-form">添加新用户</button>
               
                <!--添加新用户表单-->
                
                <div class="modal fade " id="add-user-form" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
                  <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" >添加新用户</h4>
                      </div>
                      <div class="modal-body">
                      	<form class="user-form" method="post" action="user/list.action" id="formid">
                      	 <div class="form-group">
                            <label for="userNameInput">用户名</label>
                            <input type="text" name="userName" value="${param.userName}" class="form-control" id="userNameInput" placeholder="用户名">
                          </div>
                          <div class="form-group">
                            <label for="passwordInput">密码</label>
                            <input type="password" name="password" class="form-control" id="passwordInput" placeholder="密码">
                          </div>
                         </form>
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="button" class="btn btn-primary add-user-submit">添加 </button>
                      </div>
                    </div>
                  </div>
                </div>
                
            </div>
            <div class="space-div"></div>
            <table class="table table-hover table-bordered user-list">
            	<tr>
                	<td><input type="checkbox" class="select-all-btn"/></td>
                    <td>ID</td>
                    <td>用户名</td>
                    <td>昵称</td>
                    <td>状态</td>
                    <td>创建时间</td>
                    <td>操作</td>
                </tr>
                
                <c:forEach items="${page.resultList}" var="user">
                	<tr>
                		<td><input type="checkbox" name="userIds" value="${user.userId}"/></td>
                		<td class="userid">${user.userId}</td>
                		<td class="username">${user.userCode}</td>
                		<td>${user.nickName}</td>
                		<td>${user.userState=='1'?'启用':'禁用'}</td>
                		<td>${fn:substring(user.createTime,0,19)}</td>
                		<td>
	                    	<a class="glyphicon glyphicon-wrench show-userrole-form" aria-hidden="true" title="修改所有角色" href="javascript:void(0);" data-toggle="modal" data-target="#update-userrole-dialog"></a>
	                    	<a class="glyphicon glyphicon-remove delete-this-user" aria-hidden="true" title="删除用户" href="javascript:void(0);"></a>
	                    </td>
                	</tr>
                </c:forEach>
            </table>
             <jsp:include page="page.jsp"/>
            <!--修改用户角色表单-->
            <div class="modal fade " id="update-userrole-dialog" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
                  <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" >修改用户角色</h4>
                      </div>
                      <div class="modal-body">
                      	<form class="update-userrole-form">
                        	<input name="userId" type="hidden" />
                        	<div class="roles-div"></div>
                        </form>
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="button" class="btn btn-primary update-userrole-submit">提交 </button>
                      </div>
                    </div>
                  </div>
            </div>
          </div>          
        </div>
    </div>
    <!-- 提示框 -->
	<div class="modal fade" id="op-tips-dialog" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
      <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
        	<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >提示信息</h4>
          </div>
          <div class="modal-body" id="op-tips-content">
          </div>
        </div>
      </div>
    </div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    
  </body>
</html>
