/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-22 08:15:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\r\n");
      out.write("<title>明日程序管理系统</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/12333.ico\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"plugins/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/login.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"beg-login-bg\">\r\n");
      out.write("\t<div class=\"beg-login-box\">\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t<h1>后台登录</h1>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<div class=\"beg-login-main\">\r\n");
      out.write("\t\t\t<div class=\"layui-form\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t<label class=\"beg-login-icon\"> <i class=\"layui-icon\">&#xe612;</i>\r\n");
      out.write("\t\t\t\t\t</label> <input type=\"text\" id=\"userName\" name=\"userName\"\r\n");
      out.write("\t\t\t\t\t\tlay-verify=\"userName\" autocomplete=\"off\" placeholder=\"这里输入登录名\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t<label class=\"beg-login-icon\"> <i class=\"layui-icon\">&#xe642;</i>\r\n");
      out.write("\t\t\t\t\t</label> <input type=\"password\" id=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\tlay-verify=\"password\" autocomplete=\"off\" placeholder=\"这里输入密码\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"layui-input\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t<label class=\"beg-login-icon\"> <i class=\"layui-icon\">&#xe642;</i>\r\n");
      out.write("\t\t\t\t\t</label> <input type=\"text\" id=\"vcode\" name=\"vcode\" autocomplete=\"off\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"这里输入验证码\" class=\"layui-input\" maxlength=\"4\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 55%; float: left;\"> <img id=\"imc\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"randomCode()\" src=\"randCode\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"float: left; width: 35%; height: 38px; padding-left: 10%;\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-form-item\">\r\n");
      out.write("\t\t\t\t\t<div class=\"beg-pull-left beg-login-remember\">\r\n");
      out.write("\t\t\t\t\t\t<label>记住帐号？</label> <input type=\"checkbox\" name=\"rememberMe\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"true\" lay-skin=\"switch\" checked title=\"记住帐号\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"beg-pull-right\">\r\n");
      out.write("\t\t\t\t\t\t<button id=\"loginBt\" class=\"layui-btn layui-btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"layui-icon\">&#xe650;</i> 登录\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"beg-clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</br>\r\n");
      out.write("\t\t<footer>\r\n");
      out.write("\t\t<p>四十五度工作室 © programafter.com</p>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"plugins/layui/layui.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\tlayui.use(['layer', 'form'], function() {\r\n");
      out.write("\t\t\t\tvar layer = layui.layer,\r\n");
      out.write("\t\t\t\t\t$ = layui.jquery,\r\n");
      out.write("\t\t\t\t\tform = layui.form();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t/* form.on('submit(login)',function(data){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tlocation.href='index.html';\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}); */\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#loginBt\").on(\"click\", function(){\r\n");
      out.write("\t\t\t\t\tvar username = $(\"#userName\").val();\r\n");
      out.write("\t\t\t\t\tvar password = $(\"#password\").val();\r\n");
      out.write("\t\t\t\t\tvar vcode = $(\"#vcode\").val();\r\n");
      out.write("\t\t\t\t\tif(username=='') {\r\n");
      out.write("\t\t\t\t\t\tlayer.msg(\"请输入用户名\", {icon: 5});\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(password=='') {\r\n");
      out.write("\t\t\t\t\t\tlayer.msg(\"请输入密码\", {icon: 5});\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(vcode=='') {\r\n");
      out.write("\t\t\t\t\t\tlayer.msg(\"请输入验证码\", {icon: 5});\r\n");
      out.write("\t\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t\t\turl : \"login\",\r\n");
      out.write("\t\t\t\t\t\tdata : {\"username\":username,\"password\":password,\"vcode\":vcode},\r\n");
      out.write("\t\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\t\t\tif(data.succ) {\r\n");
      out.write("\t\t\t\t\t\t\t\twindow.location.href = 'index';\r\n");
      out.write("\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\tlayer.msg(data.mesg, {icon: 5});\r\n");
      out.write("\t\t\t\t\t\t\t\trandomCode();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\terror : function(data){\r\n");
      out.write("\t\t\t\t\t\t\tlayer.msg(data.mesg, {icon: 5});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tfunction randomCode() { \r\n");
      out.write("\t\t   \t\t document.getElementById(\"imc\").src=\"randCode?r=\"+Math.random(); \r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
