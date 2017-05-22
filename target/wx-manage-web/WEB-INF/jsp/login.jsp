<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>微信公众号管理系统</title>
<link rel="shortcut icon" href="images/12333.ico" />
<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/login.css" />
</head>

<body class="beg-login-bg">
	<div class="beg-login-box">
		<header>
		<h1>后台登录</h1>
		</header>
		<div class="beg-login-main">
			<div class="layui-form">
				<div class="layui-form-item">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe612;</i>
					</label> <input type="text" id="userName" name="userName"
						lay-verify="userName" autocomplete="off" placeholder="这里输入登录名"
						class="layui-input">
				</div>
				<div class="layui-form-item">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
					</label> <input type="password" id="password" name="password"
						lay-verify="password" autocomplete="off" placeholder="这里输入密码"
						class="layui-input">
				</div>
				<div class="layui-form-item">
					<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
					</label> <input type="text" id="vcode" name="vcode" autocomplete="off"
						placeholder="这里输入验证码" class="layui-input" maxlength="4"
						style="width: 55%; float: left;"> <img id="imc"
						onclick="randomCode()" src="randCode"
						style="float: left; width: 35%; height: 38px; padding-left: 10%;">
				</div>
				<div class="layui-form-item">
					<div class="beg-pull-left beg-login-remember">
						<label>记住帐号？</label> <input type="checkbox" name="rememberMe"
							value="true" lay-skin="switch" checked title="记住帐号">
					</div>
					<div class="beg-pull-right">
						<button id="loginBt" class="layui-btn layui-btn-primary">
							<i class="layui-icon">&#xe650;</i> 登录
						</button>
					</div>
					<div class="beg-clear"></div>
				</div>
			</div>
		</div>
		</br>
		<footer>
		<p>四十五度工作室 © programafter.com</p>
		</footer>
	</div>
	<script type="text/javascript" src="plugins/layui/layui.js"></script>
	<script>
			layui.use(['layer', 'form'], function() {
				var layer = layui.layer,
					$ = layui.jquery,
					form = layui.form();
					
				/* form.on('submit(login)',function(data){
					
					location.href='index.html';
					return false;
				}); */
				
				$("#loginBt").on("click", function(){
					var username = $("#userName").val();
					var password = $("#password").val();
					var vcode = $("#vcode").val();
					if(username=='') {
						layer.msg("请输入用户名", {icon: 5});
						return;
					}
					if(password=='') {
						layer.msg("请输入密码", {icon: 5});
						return;
					}
					if(vcode=='') {
						layer.msg("请输入验证码", {icon: 5});
						return;
					}
					$.ajax({
						type : "POST",
						url : "login",
						data : {"username":username,"password":password,"vcode":vcode},
						dataType : "json",
						success : function(data){
							if(data.succ) {
								window.location.href = 'index';
							} else {
								layer.msg(data.mesg, {icon: 5});
								randomCode();
							}
						},
						error : function(data){
							layer.msg(data.mesg, {icon: 5});
						}
				});
			});
			});
			function randomCode() { 
		   		 document.getElementById("imc").src="randCode?r="+Math.random(); 
			} 
		</script>
</body>

</html>