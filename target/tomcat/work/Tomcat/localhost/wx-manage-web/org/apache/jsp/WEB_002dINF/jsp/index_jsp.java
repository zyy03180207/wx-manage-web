/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-13 07:46:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<title>微信公众号管理系统 v1.0</title>\r\n");
      out.write("\t\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"plugins/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/global.css\" media=\"all\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"http://www.jq22.com/jquery/font-awesome.4.6.0.css\">\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"layui-layout layui-layout-admin\" style=\"border-bottom: solid 5px #1aa094;\">\r\n");
      out.write("\t\t\t<div class=\"layui-header header header-demo\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-main\">\r\n");
      out.write("\t\t\t\t\t<div class=\"admin-login-box\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"logo\" style=\"left: 0;\" href=\"index\">\r\n");
      out.write("\t\t\t\t\t\t\t<span style=\"font-size: 22px;\">微信公众号</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"admin-side-toggle\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bars\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"admin-side-full\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-life-bouy\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<ul class=\"layui-nav admin-header-item\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\">清除缓存</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\">浏览网站</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\" id=\"video1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\">视频</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:;\" class=\"admin-header-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/0.jpg\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>beginner</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<dl class=\"layui-nav-child\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\"></i> 个人信息</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\"><i class=\"fa fa-gear\" aria-hidden=\"true\"></i> 设置</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd id=\"lock\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\" aria-hidden=\"true\" style=\"padding-right: 3px;padding-left: 1px;\"></i> 锁屏 (Alt+L)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"outLogin\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> 注销</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"layui-nav admin-header-item-mobile\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-nav-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"outLogin\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> 注销</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-side layui-bg-black\" id=\"admin-side\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-side-scroll\" id=\"admin-navbar-side\" lay-filter=\"side\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-body\" style=\"bottom: 0;border-left: solid 2px #1AA094;\" id=\"admin-body\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-tab admin-nav-card layui-tab-brief\" lay-filter=\"admin-tab\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"layui-tab-title\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"layui-this\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-dashboard\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t<cite>控制面板</cite>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<div class=\"layui-tab-content\" style=\"min-height: 150px; padding: 5px 0 0 0;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"layui-tab-item layui-show\">\r\n");
      out.write("\t\t\t\t\t\t\t<iframe src=\"main\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"layui-footer footer footer-demo\" id=\"admin-footer\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-main\">\r\n");
      out.write("\t\t\t\t\t<p>2017 &copy;\r\n");
      out.write("\t\t\t\t\t\t<a href=\"http://m.zhengjinfan.cn/\">programafter.com</a> 十五度工作室\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"site-tree-mobile layui-hide\">\r\n");
      out.write("\t\t\t\t<i class=\"layui-icon\">&#xe602;</i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"site-mobile-shade\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--锁屏模板 start-->\r\n");
      out.write("\t\t\t<script type=\"text/template\" id=\"lock-temp\">\r\n");
      out.write("\t\t\t\t<div class=\"admin-header-lock\" id=\"lock-box\">\r\n");
      out.write("\t\t\t\t\t<div class=\"admin-header-lock-img\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/0.jpg\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"admin-header-lock-name\" id=\"lockUserName\">beginner</div>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"admin-header-lock-input\" value=\"输入密码解锁..\" name=\"lockPwd\" id=\"lockPwd\" />\r\n");
      out.write("\t\t\t\t\t<button class=\"layui-btn layui-btn-small\" id=\"unlock\">解锁</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t\t<!--锁屏模板 end -->\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"plugins/layui/layui.js\"></script>\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"datas/nav.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"js/index.js\"></script>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\tlayui.use('layer', function() {\r\n");
      out.write("\t\t\t\t\tvar $ = layui.jquery,\r\n");
      out.write("\t\t\t\t\t\tlayer = layui.layer;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$('#video1').on('click', function() {\r\n");
      out.write("\t\t\t\t\t\tlayer.open({\r\n");
      out.write("\t\t\t\t\t\t\ttitle: 'YouTube',\r\n");
      out.write("\t\t\t\t\t\t\tmaxmin: true,\r\n");
      out.write("\t\t\t\t\t\t\ttype: 2,\r\n");
      out.write("\t\t\t\t\t\t\tcontent: 'video.html',\r\n");
      out.write("\t\t\t\t\t\t\tarea: ['800px', '500px']\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\tnavs = [{\r\n");
      out.write("\t\t\t\t\t\"title\": \"粉丝管理\",\r\n");
      out.write("\t\t\t\t\t\"icon\": \"fa-users\",\r\n");
      out.write("\t\t\t\t\t\"spread\": false,\r\n");
      out.write("\t\t\t\t\t\"children\": [{\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"粉丝列表\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"fansList\"\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"删除粉丝\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"delFansList\"\r\n");
      out.write("\t\t\t\t\t}]\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\"title\": \"管理员管理\",\r\n");
      out.write("\t\t\t\t\t\"icon\": \"fa-user\",\r\n");
      out.write("\t\t\t\t\t\"spread\": false,\r\n");
      out.write("\t\t\t\t\t\"children\": [{\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"角色管理\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"adminRole\"\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"权限管理\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"adminAuthor\"\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"管理员列表\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"adminList\"\r\n");
      out.write("\t\t\t\t\t}]\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\"title\": \"第三方组件\",\r\n");
      out.write("\t\t\t\t\t\"icon\": \"&#x1002;\",\r\n");
      out.write("\t\t\t\t\t\"spread\": false,\r\n");
      out.write("\t\t\t\t\t\"children\": [{\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"iCheck组件\",\r\n");
      out.write("\t\t\t\t\t\t\"icon\": \"fa-check-square-o\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"icheck.html\"\r\n");
      out.write("\t\t\t\t\t}]\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\"title\": \"地址本\",\r\n");
      out.write("\t\t\t\t\t\"icon\": \"fa-address-book\",\r\n");
      out.write("\t\t\t\t\t\"href\": \"\",\r\n");
      out.write("\t\t\t\t\t\"spread\": false,\r\n");
      out.write("\t\t\t\t\t\"children\": [{\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"Github\",\r\n");
      out.write("\t\t\t\t\t\t\"icon\": \"fa-github\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"https://www.github.com/\"\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"QQ\",\r\n");
      out.write("\t\t\t\t\t\t\"icon\": \"fa-qq\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"http://www.qq.com/\"\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"Fly社区\",\r\n");
      out.write("\t\t\t\t\t\t\"icon\": \"&#xe609;\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"http://fly.layui.com/\"\r\n");
      out.write("\t\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"新浪微博\",\r\n");
      out.write("\t\t\t\t\t\t\"icon\": \"fa-weibo\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"http://weibo.com/\"\r\n");
      out.write("\t\t\t\t\t}]\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\"title\": \"这是一级导航\",\r\n");
      out.write("\t\t\t\t\t\"icon\": \"fa-stop-circle\",\r\n");
      out.write("\t\t\t\t\t\"href\": \"https://www.baidu.com\",\r\n");
      out.write("\t\t\t\t\t\"spread\": false\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\t\"title\": \"其他\",\r\n");
      out.write("\t\t\t\t\t\"icon\": \"fa-stop-circle\",\r\n");
      out.write("\t\t\t\t\t\"href\": \"#\",\r\n");
      out.write("\t\t\t\t\t\"spread\": false,\r\n");
      out.write("\t\t\t\t\t\"children\": [{\r\n");
      out.write("\t\t\t\t\t\t\"title\": \"子窗体中打开选项卡\",\r\n");
      out.write("\t\t\t\t\t\t\"icon\": \"fa-github\",\r\n");
      out.write("\t\t\t\t\t\t\"href\": \"cop.html\"\r\n");
      out.write("\t\t\t\t\t}]\r\n");
      out.write("\t\t\t\t}];\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
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
