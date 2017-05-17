<%@page import="com.program.wxmanage.util.Menu"%>
<%@page import="java.util.LinkedList"%>
<%@page import="microservice.online.entity.TbRole"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	LinkedList<Menu> menus = (LinkedList<Menu>)request.getAttribute("menus");
%>
<div style="margin: 15px;">
	<form class="layui-form">
		<div class="layui-form-item">
			<label class="layui-form-label">上级菜单</label>
			<div class="layui-input-block">
				<select name="author" lay-verify="required">
					<option value="-1">作为功能权限</option>
					<option value="0">作为一级菜单</option>
					<%for(Menu menu : menus) { %>
						<option value="<%=menu.getId()%>"><%for(int i = 0; i < menu.getLevel(); i++){ %>&nbsp;&nbsp;<% if(menu.getLevel()!=0){%>└─<%}} %><%=menu.getTitle() %></option>
					<%} %>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">名称</label>
			<div class="layui-input-inline">
				<input type="text" name="name" placeholder="请输入菜单或权限名称" required lay-verify="required" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">描述</label>
			<div class="layui-input-inline">
				<input type="text" name="des" placeholder="请输入菜单或权限描述" required lay-verify="required" autocomplete="off" class="layui-input">
			</div>
			<div class="layui-form-mid layui-word-aux">菜单或权限的描述</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">链接</label>
			<div class="layui-input-inline">
				<input type="text" name="uri" placeholder="请输入链接地址" required lay-verify="required" autocomplete="off" class="layui-input">
			</div>
			<div class="layui-form-mid layui-word-aux">只需要输入controller的路径</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">图标</label>
			<div class="layui-input-inline">
				<input type="text" name="icon" placeholder="请输入菜单图标" autocomplete="off" class="layui-input">
			</div>
			<div class="layui-form-mid layui-word-aux">font-awesome图标名（无图标则不输入）</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">是否菜单</label>
			<div class="layui-input-block">
				<input type="checkbox" name="switch" lay-skin="switch" lay-verify="required">
			</div>
			<div class="layui-form-mid layui-word-aux">若不是菜单则上级选项无效</div>
		</div>
		<button lay-filter="edit" lay-submit style="display: none;"></button>
	</form>
</div>