/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-20 03:36:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<link rel=\"Bookmark\" href=\"/favicon.ico\" >\r\n");
      out.write("<link rel=\"Shortcut Icon\" href=\"/favicon.ico\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/static/h-ui.admin/css/style.css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<title>管理员列表</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"breadcrumb\"><i class=\"Hui-iconfont\">&#xe67f;</i> 首页 <span class=\"c-gray en\">&gt;</span> 管理员管理 <span class=\"c-gray en\">&gt;</span> 管理员列表 <a class=\"btn btn-success radius r\" style=\"line-height:1.6em;margin-top:3px\" href=\"javascript:location.replace(location.href);\" title=\"刷新\" ><i class=\"Hui-iconfont\">&#xe68f;</i></a></nav>\r\n");
      out.write("<div class=\"page-container\">\r\n");
      out.write("\t<div class=\"text-c\"> 日期范围：\r\n");
      out.write("\t\t<input type=\"text\" onfocus=\"WdatePicker({ maxDate:'#F{$dp.$D(\\'datemax\\')||\\'%y-%M-%d\\'}' })\" id=\"datemin\" class=\"input-text Wdate\" style=\"width:120px;\">\r\n");
      out.write("\t\t-\r\n");
      out.write("\t\t<input type=\"text\" onfocus=\"WdatePicker({ minDate:'#F{$dp.$D(\\'datemin\\')}',maxDate:'%y-%M-%d' })\" id=\"datemax\" class=\"input-text Wdate\" style=\"width:120px;\">\r\n");
      out.write("\t\t<input type=\"text\" class=\"input-text\" style=\"width:250px\" placeholder=\"输入管理员名称\" id=\"\" name=\"\">\r\n");
      out.write("\t\t<button type=\"submit\" class=\"btn btn-success\" id=\"\" name=\"\"><i class=\"Hui-iconfont\">&#xe665;</i> 搜用户</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"cl pd-5 bg-1 bk-gray mt-20\"> <span class=\"l\"><a href=\"javascript:;\" onclick=\"datadel()\" class=\"btn btn-danger radius\"><i class=\"Hui-iconfont\">&#xe6e2;</i> 批量删除</a> <a href=\"javascript:;\" onclick=\"admin_add('添加管理员','");
      out.print(request.getContextPath());
      out.write("/admin/adminadd','800','500')\" class=\"btn btn-primary radius\"><i class=\"Hui-iconfont\">&#xe600;</i> 添加管理员</a></span> <span class=\"r\">共有数据：<strong>54</strong> 条</span> </div>\r\n");
      out.write("\t<table class=\"table table-border table-bordered table-bg\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th scope=\"col\" colspan=\"9\">员工列表</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<th width=\"25\"><input type=\"checkbox\" name=\"\" value=\"\"></th>\r\n");
      out.write("\t\t\t\t<th width=\"40\">ID</th>\r\n");
      out.write("\t\t\t\t<th width=\"150\">登录名</th>\r\n");
      out.write("\t\t\t\t<th width=\"90\">手机</th>\r\n");
      out.write("\t\t\t\t<th width=\"150\">邮箱</th>\r\n");
      out.write("\t\t\t\t<th>角色</th>\r\n");
      out.write("\t\t\t\t<th width=\"130\">加入时间</th>\r\n");
      out.write("\t\t\t\t<th width=\"100\">是否已启用</th>\r\n");
      out.write("\t\t\t\t<th width=\"100\">操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" value=\"1\" name=\"\"></td>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>admin</td>\r\n");
      out.write("\t\t\t\t<td>13000000000</td>\r\n");
      out.write("\t\t\t\t<td>admin@mail.com</td>\r\n");
      out.write("\t\t\t\t<td>超级管理员</td>\r\n");
      out.write("\t\t\t\t<td>2014-6-11 11:11:42</td>\r\n");
      out.write("\t\t\t\t<td class=\"td-status\"><span class=\"label label-success radius\">已启用</span></td>\r\n");
      out.write("\t\t\t\t<td class=\"td-manage\"><a style=\"text-decoration:none\" onClick=\"admin_stop(this,'10001')\" href=\"javascript:;\" title=\"停用\"><i class=\"Hui-iconfont\">&#xe631;</i></a> <a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_edit('管理员编辑','admin-add.html','1','800','500')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a> <a title=\"删除\" href=\"javascript:;\" onclick=\"admin_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" value=\"2\" name=\"\"></td>\r\n");
      out.write("\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t<td>zhangsan</td>\r\n");
      out.write("\t\t\t\t<td>13000000000</td>\r\n");
      out.write("\t\t\t\t<td>admin@mail.com</td>\r\n");
      out.write("\t\t\t\t<td>栏目编辑</td>\r\n");
      out.write("\t\t\t\t<td>2014-6-11 11:11:42</td>\r\n");
      out.write("\t\t\t\t<td class=\"td-status\"><span class=\"label radius\">已停用</span></td>\r\n");
      out.write("\t\t\t\t<td class=\"td-manage\"><a style=\"text-decoration:none\" onClick=\"admin_start(this,'10001')\" href=\"javascript:;\" title=\"启用\"><i class=\"Hui-iconfont\">&#xe615;</i></a> <a title=\"编辑\" href=\"javascript:;\" onclick=\"admin_edit('管理员编辑','admin-add.html','2','800','500')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6df;</i></a> <a title=\"删除\" href=\"javascript:;\" onclick=\"admin_del(this,'1')\" class=\"ml-5\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/static/h-ui/js/H-ui.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/static/h-ui.admin/js/H-ui.admin.js\"></script>\r\n");
      out.write("<!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/lib/My97DatePicker/4.8/WdatePicker.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/lib/datatables/1.10.0/jquery.dataTables.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/lib/laypage/1.2/laypage.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*\r\n");
      out.write("\t参数解释：\r\n");
      out.write("\ttitle\t标题\r\n");
      out.write("\turl\t\t请求的url\r\n");
      out.write("\tid\t\t需要操作的数据id\r\n");
      out.write("\tw\t\t弹出层宽度（缺省调默认值）\r\n");
      out.write("\th\t\t弹出层高度（缺省调默认值）\r\n");
      out.write("*/\r\n");
      out.write("/*管理员-增加*/\r\n");
      out.write("function admin_add(title,url,w,h){\r\n");
      out.write("\tlayer_show(title,url,w,h);\r\n");
      out.write("}\r\n");
      out.write("/*管理员-删除*/\r\n");
      out.write("function admin_del(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要删除吗？',function(index){\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\turl: '',\r\n");
      out.write("\t\t\tdataType: 'json',\r\n");
      out.write("\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t$(obj).parents(\"tr\").remove();\r\n");
      out.write("\t\t\t\tlayer.msg('已删除!',{icon:1,time:1000});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*管理员-编辑*/\r\n");
      out.write("function admin_edit(title,url,id,w,h){\r\n");
      out.write("\tlayer_show(title,url,w,h);\r\n");
      out.write("}\r\n");
      out.write("/*管理员-停用*/\r\n");
      out.write("function admin_stop(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要停用吗？',function(index){\r\n");
      out.write("\t\t//此处请求后台程序，下方是成功后的前台处理……\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a onClick=\"admin_start(this,id)\" href=\"javascript:;\" title=\"启用\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe615;</i></a>');\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-default radius\">已禁用</span>');\r\n");
      out.write("\t\t$(obj).remove();\r\n");
      out.write("\t\tlayer.msg('已停用!',{icon: 5,time:1000});\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*管理员-启用*/\r\n");
      out.write("function admin_start(obj,id){\r\n");
      out.write("\tlayer.confirm('确认要启用吗？',function(index){\r\n");
      out.write("\t\t//此处请求后台程序，下方是成功后的前台处理……\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-manage\").prepend('<a onClick=\"admin_stop(this,id)\" href=\"javascript:;\" title=\"停用\" style=\"text-decoration:none\"><i class=\"Hui-iconfont\">&#xe631;</i></a>');\r\n");
      out.write("\t\t$(obj).parents(\"tr\").find(\".td-status\").html('<span class=\"label label-success radius\">已启用</span>');\r\n");
      out.write("\t\t$(obj).remove();\r\n");
      out.write("\t\tlayer.msg('已启用!', {icon: 6,time:1000});\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}