<%@page import="microservice.online.entity.TbRole"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<TbRole> roles = (List<TbRole>)request.getAttribute("roles");
%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">登录名</label>
			<div class="layui-input-inline">
				<input type="text" name="username" placeholder="请输入登录名" required lay-verify="required" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">登陆密码</label>
			<div class="layui-input-inline">
				<input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
			</div>
			<div class="layui-form-mid layui-word-aux">辅助文字</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">手机号</label>
			<div class="layui-input-inline">
				<input type="text" name="phone" required lay-verify="phone" placeholder="请输入手机号" autocomplete="off" class="layui-input">
			</div>
			<div class="layui-form-mid layui-word-aux">辅助文字</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">邮箱</label>
			<div class="layui-input-inline">
				<input type="text" name="email" required lay-verify="email" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
			</div>
			<div class="layui-form-mid layui-word-aux">辅助文字</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">选择角色</label>
			<div class="layui-input-block">
				<select name="role" lay-verify="required">
					<option value=""></option>
					<%for(TbRole role : roles) { %>
						<option value="<%=role.getId()%>"><%=role.getName()%></option>
					<%} %>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否开启</label>
			<div class="layui-input-block">
				<input type="checkbox" name="switch" lay-skin="switch" lay-verify="required">
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">文本域</label>
			<div class="layui-input-block">
				<textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
</div>