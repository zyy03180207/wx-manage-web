<%@page import="microservice.online.entity.TbRole"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">角色名称</label>
			<div class="layui-input-inline">
				<input type="text" name="name" placeholder="请输入角色名称" required lay-verify="required" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">角色描述</label>
			<div class="layui-input-block">
				<textarea name="introduce" placeholder="请输入角色描述" class="layui-textarea"></textarea>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否开启</label>
			<div class="layui-input-block">
				<input type="checkbox" name="state" lay-skin="switch" lay-verify="required">
			</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
</div>