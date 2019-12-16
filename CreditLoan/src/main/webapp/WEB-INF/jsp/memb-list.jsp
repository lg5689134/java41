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
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/layout.css" rel="stylesheet">
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
          <h1 class="page-header">客户列表</h1>
          <div class="row placeholders">
          <div>
          <form method="post" action="" onsubmit="">
             <input type="text" name="userName"  placeholder="客户名称" value="${param.userName }" maxlength="20" style="width:100px;">
             <input type="number" name="userName"  placeholder="起始年龄" value="${param.userName }" maxlength="2" style="width:100px;">
              <input type="number" name="userName"  placeholder="截止年龄" value="${param.userName }" maxlength="2" style="width:100px;">
             <input type="date" name="userName"  placeholder="开始时间" value="${param.userName }" style="width:100px;">
              <input type="date" name="userName"  placeholder="截止时间" value="${param.userName }" style="width:100px;">
            <input type="submit" value="查询" >
            </form>  
          </div><br/>
         	<div>
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
                	<td>ID</td>
                    <td>客户名</td>
                    <td>性别</td>
                    <td>年龄</td>
                    <td>身份证</td>
                    <td>民族</td>
                    <td>时间</td>
                    <td>操作</td>
                </tr>
                 <c:forEach items="${page.resultList}" var="memb">
                	<tr>
                		<td class="userid">${memb.membId}</td>
                		<td class="username">${memb.membName}</td>
                		<td class="sex">${memb.sex=='1'?"男":"女"}</td>
                		<td class="age">${memb.age}</td>
                		<td class="cardNum">${memb.cardNum}</td>
                		<td class="nation">${memb.nation}</td>
                		<td class="createTime">${fn:substring(memb.createTime,0,19)}</td>
                		 <td>
	                    	<a class="glyphicon glyphicon-wrench show-userrole-form" aria-hidden="true" title="修改所有角色" href="javascript:void(0);" data-toggle="modal" data-target="#update-userrole-dialog"></a>
	                    	<a class="glyphicon glyphicon-remove delete-this-user" aria-hidden="true" title="查看详情" href="javascript:void(0);"></a>
	                    </td>
                	</tr>
                </c:forEach>
            </table>
              <jsp:include page="standard.jsp"/>
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
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script>
    	function getAllRoles(obj){
        	obj.html("");
    		$.ajax({
				url:"listRoles.html",
				type:"POST",
				dataType:"json",
				success:function(data){
					for(var i in data){
						obj.append("<input type='checkbox' name='roleIds' value='"+
								data[i].roleId+"'/>"+data[i].roleName+":"+data[i].roleDesc);
						obj.append("<br/>");
					}
				}
			});
       	}
      
       	function showTips(content){
       		$("#op-tips-content").html(content);
			$("#op-tips-dialog").modal("show");
       	}
    	$(".select-all-btn").change(function(){
			if($(this).is(":checked")){//$(this).prop("checked")
				$(".user-list input[type='checkbox']:gt(0)").prop("checked",true);
			}else{
				$(".user-list input[type='checkbox']:gt(0)").prop("checked",false);
			}
		});
		

		$(".add-user-submit").click(function(){
			//请求添加新用户
			$.ajax({
				url:"add.html",
				data:{
				userName:"",
				},
				type:"POST",
				dataType:"json",
				success:function(data){
					$("#add-user-form").modal("hide");
					showTips("添加成功！");

					
				}
			});
			
		});
		
		
		
		
	  $(".user-list").on("click",".show-userrole-form",function(){
			var userid=$.trim($(this).parents("tr").find(".userid").text());
			var username=$(this).parents("tr").find(".username").html();
			$(".update-userrole-form input[name='userId']").val(userid);
			/* //获取当前用户当前角色
			getAllRoles($(".update-userrole-form .roles-div"));
			getRolesByUserName(username,function(data){
				for(var i in data){
					$('.update-userrole-form input[name="roleIds"][value="'+data[i].roleId+'"]').prop("checked",true);
				}
			}); */
		});
		
		
		//确认修改用户角色
		$(".update-userrole-submit").click(function(){
			$.ajax({
				url:"corelationRole.html",
				data:{},
				type:"POST",
				success:function(){
					$("#update-userrole-dialog").modal("hide");
					showTips("更新成功！");
				}
			});
		});
		
    </script>
  </body>
</html>
