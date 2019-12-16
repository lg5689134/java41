<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>登录页面</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/static/css/login.css" rel="stylesheet">
  <style type="text/css">
  .red{
  	color:red;
  }
   .red001{
  	color:pink;
  }
  #blue{
    color:blue;
  }
  
  </style>
   <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
   <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery.cookie.js"></script>
   
   <script type="text/javascript">	
    
    $(document).ready(function (){//当前页面加载就绪  
    
    
    
    
    
   // alert($("#checkboxid").text());
	//alert($.trim($("#checkboxid").text()));
        //alert($("#userState").val());
       /*  $("input[name='all']").click(function (){
          //var len= $("input[name='all']:checked").length;
          $("input[name='rememberMe']").each(function (index,obj){
	           if($("input[name='all']").is(":checked")){
	                   $(this).prop("checked",true);
	           }else{
	                  $(this).prop("checked",false);
	           }
	         
          });
         }); */
       
        /* $("input[name='rememberMe']:checked").each(function (index,obj){
        	
       
       }); 
         */

   });
   

    var flag=false;	
	$(document).ready(function(){
		$("#inputCode").blur(function (){	
		var vCode=$("#inputCode").val();
	 	 if(!!vCode){
	 	 	$.ajax({  
	                type:"POST", //请求方式 
	                url:"${pageContext.request.contextPath}/user/validCode.action",
	                dataType:"json", //返回数据类型
	                 data:{//请求参数
	               		vCode:vCode
	                },
	                success:function(data){ //请求成功后 200
	                	if(data.msg=='1'){
	                      	flag=true;
                      	 	//alert("验证码正确！");
                      	 	$("#error_html").removeClass("red").html("");
                       }else{
                        	//alert("验证码不正确！");
                        	$("#error_html").addClass("blue").html("验证码不正确!");
                        	flag=false;
                       }
	                },
	                error:function (){//500 400
	                	alert("系统出现异常！");
	                }    
	         }); 
	         
         }else{
           flag=false;
           alert("验证码不能为空")
         }
         
	} );
	
	});
		
	function login(){
		var userName=$("#inputEmail").val();//获取用户名
		var psw=$("#inputPassword").val();
		var vCode=$("#inputCode").val();
			if(!/^\w{4,16}$/.test(userName)){
				//alert("用户名不合法! 4-16位，字母，数字，下划线");
				$("#userNameError").addClass("red").html("用户名不合法! 4-16位，字母，数字，下划线");
				return false;
			}else if(psw.length>20 || psw.length<6){
			    //alert("密码不合法! 6-20位，字母，数字");
			    $("#pswerror").addClass("red").html("密码不合法! 6-20位，字母，数字");
			    return false;
			}else if(!flag){
				alert("验证码不正确！");
				return false;
			}else{
			   $.ajax({  
	                type:"POST", //请求方式 
	                url:"${pageContext.request.contextPath}/user/login.action",
	                dataType:"json", //返回数据类型
	                 data:{//请求参数
	               		vCode:vCode,
	               		userName:"",
	               		password:""
	                },
	                success:function(data){ //请求成功后 200
	                	if(data.res=='1'){//登录成功
	                	    //跳转到首页
	                	    window.location.href="${pageContext.request.contextPath}/pages/index.jsp";
	                	}else{
	                	
	                	}
	                },
	                error:function (){//500 400
	                	alert("系统出现异常！");
	                }    
	         }); 
	         
         }
	}
</script>
  </head>
  <script type="text/javascript">
  $(function (){
 // $("h3").css("color","orange");
  /*  
   $("button").height(16);
   $("button").width(166); */
   
   //$("h3").addClass("red");
   // $("h3").removeClass("red").addClass("red001");
   
/* alert($(".form-signin-heading").html());
   alert($(".form-signin-heading").text()); */
  // $("#inputEmail").val("admin123");
 // $("h3").attr("title","55555555");
 // alert($("h3").attr("title"));
    // console.log($("h3").attr("title"));
     /*$("h3").hide();
    
    $("#inputEmail").mouseover(function (){
        $("h3").show();
    }).mouseout(function (){
       $("h3").hide();
    }).dblclick(function (){
    	alert($(this).val());
    });
     */
     
     //$("h3").append("<font color='red'>welcome!!!北邮</font>");
     //$("h3").remove(".form-signin-heading");
     
     //alert($("h3").clone().html());
     
     /* var len=$("input[name='sex']:checked").val();
     alert(len); */
     
    // $("input[name='sex']:eq(0)").attr("checked","checked");
    /* $("input[name='hobby']:gt(0)").attr("checked","checked");
     
     $("input[name='hobby']:checked").each(function (index,obj){
         alert(index+":"+$(this).val());
     }); */
     
     $("input[name='rememberMe']").click(function (){
        if($(this).is(":checked")){//复选框被选中
       //全选
         $("input[name='hobby']").each(function (){//获取所有爱好复选框
           // $(this).attr("checked",true);
           $(this).prop("checked",true);
         });
       
       }else{
        //反选
        $("input[name='hobby']").each(function (){//获取所有爱好复选框
           // $(this).attr("checked",false);
            $(this).prop("checked",false);
         });
       }
     
     
     });
     
     
  });
  
  
  
  </script>
  <body>
    	<form class="form-signin" method="post" action="##">
    	<h3 class="form-signin-heading"><font>请登录</font></h3>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="text" id="inputEmail"  class="form-control class123456"  placeholder="用户名"  name="username" maxlength="20" value="admin" >
         <label id="userNameError"></label>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password"  id="inputPassword" class="form-control" placeholder="密码" name="password" maxlength="10">
       <label id="pswerror"></label><br/>
        <label for="inputEmail" class="sr-only" >验证码</label>
        <input type="text" id="inputCode" placeholder="验证码" name="code" tabindex="6" style="width:80px;text-transform:uppercase;ime-mode:disabled" maxlength="4">
        <img id="vdimgck"  src="${pageContext.request.contextPath}/pages/image.jsp?d="+new Date()+"" alt="看不清？点击更换" align="absmiddle" width="75" style="cursor:pointer" onclick="this.src=this.src+'?'" />
      	<label id="error_html" style="font-size:18px;"></label>
         <div  class="checkbox" id="checkboxid">
          <label>
             <input type="checkbox" name="rememberMe" value="jzw"> 全选/反选&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           </label>
        </div>
        <div>
              性别：<input type="radio" name="sex" value="10"/>男&nbsp;<input name="sex" type="radio" value="0"/>女
       <br/>      
             爱好：<input type="checkbox" name="hobby" value="1"/>唱歌&nbsp;
          <input type="checkbox" name="hobby" value="2"/>跳舞&nbsp;
          <input type="checkbox" name="hobby" value="3"/>打篮球&nbsp;
          <input type="checkbox" name="hobby" value="4"/>爬山&nbsp;
       
        </div>
        <p class="bg-warning">${error}</p>
        <button class="btn btn-lg btn-primary btn-block" type="button" onclick="return login()" >登录</button>
     <br/>
	   </form>
	   
	  
     </div> <!-- /container -->
</body>
</html>
