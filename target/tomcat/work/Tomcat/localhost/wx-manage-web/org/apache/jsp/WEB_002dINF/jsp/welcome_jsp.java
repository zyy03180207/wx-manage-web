/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-20 03:20:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>欢迎页面</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page-container\">\r\n");
      out.write("\t<p class=\"f-20 text-success\">欢迎使用H-ui.admin <span class=\"f-14\">v3.0</span>后台模版！</p>\r\n");
      out.write("\t<p>登录次数：18 </p>\r\n");
      out.write("\t<p>上次登录IP：222.35.131.79.1  上次登录时间：2014-6-14 11:19:55</p>\r\n");
      out.write("\t<table class=\"table table-border table-bordered table-bg\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"7\" scope=\"col\">信息统计</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<th>统计</th>\r\n");
      out.write("\t\t\t\t<th>资讯库</th>\r\n");
      out.write("\t\t\t\t<th>图片库</th>\r\n");
      out.write("\t\t\t\t<th>产品库</th>\r\n");
      out.write("\t\t\t\t<th>用户</th>\r\n");
      out.write("\t\t\t\t<th>管理员</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td>总数</td>\r\n");
      out.write("\t\t\t\t<td>92</td>\r\n");
      out.write("\t\t\t\t<td>9</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>8</td>\r\n");
      out.write("\t\t\t\t<td>20</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td>今日</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td>昨日</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td>本周</td>\r\n");
      out.write("\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t<td>本月</td>\r\n");
      out.write("\t\t\t\t<td>2</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t\t<td>0</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table class=\"table table-border table-bordered table-bg mt-20\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"2\" scope=\"col\">服务器信息</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th width=\"30%\">服务器计算机名</th>\r\n");
      out.write("\t\t\t\t<td><span id=\"lbServerName\">http://127.0.0.1/</span></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器IP地址</td>\r\n");
      out.write("\t\t\t\t<td>192.168.1.1</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器域名</td>\r\n");
      out.write("\t\t\t\t<td>www.h-ui.net</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器端口 </td>\r\n");
      out.write("\t\t\t\t<td>80</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器IIS版本 </td>\r\n");
      out.write("\t\t\t\t<td>Microsoft-IIS/6.0</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>本文件所在文件夹 </td>\r\n");
      out.write("\t\t\t\t<td>D:\\WebSite\\HanXiPuTai.com\\XinYiCMS.Web\\</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器操作系统 </td>\r\n");
      out.write("\t\t\t\t<td>Microsoft Windows NT 5.2.3790 Service Pack 2</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>系统所在文件夹 </td>\r\n");
      out.write("\t\t\t\t<td>C:\\WINDOWS\\system32</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器脚本超时时间 </td>\r\n");
      out.write("\t\t\t\t<td>30000秒</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器的语言种类 </td>\r\n");
      out.write("\t\t\t\t<td>Chinese (People's Republic of China)</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>.NET Framework 版本 </td>\r\n");
      out.write("\t\t\t\t<td>2.050727.3655</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器当前时间 </td>\r\n");
      out.write("\t\t\t\t<td>2014-6-14 12:06:23</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器IE版本 </td>\r\n");
      out.write("\t\t\t\t<td>6.0000</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>服务器上次启动到现在已运行 </td>\r\n");
      out.write("\t\t\t\t<td>7210分钟</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>逻辑驱动器 </td>\r\n");
      out.write("\t\t\t\t<td>C:\\D:\\</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CPU 总数 </td>\r\n");
      out.write("\t\t\t\t<td>4</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>CPU 类型 </td>\r\n");
      out.write("\t\t\t\t<td>x86 Family 6 Model 42 Stepping 1, GenuineIntel</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>虚拟内存 </td>\r\n");
      out.write("\t\t\t\t<td>52480M</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>当前程序占用内存 </td>\r\n");
      out.write("\t\t\t\t<td>3.29M</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Asp.net所占内存 </td>\r\n");
      out.write("\t\t\t\t<td>51.46M</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>当前Session数量 </td>\r\n");
      out.write("\t\t\t\t<td>8</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>当前SessionID </td>\r\n");
      out.write("\t\t\t\t<td>gznhpwmp34004345jz2q3l45</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>当前系统用户名 </td>\r\n");
      out.write("\t\t\t\t<td>NETWORK SERVICE</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("<footer class=\"footer mt-20\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<p>感谢jQuery、layer、laypage、Validform、UEditor、My97DatePicker、iconfont、Datatables、WebUploaded、icheck、highcharts、bootstrap-Switch<br>\r\n");
      out.write("\t\t\tCopyright &copy;2015-2017 微信后台 v3.0 All Rights Reserved.<br>\r\n");
      out.write("\t\t\t本后台系统由<a href=\"http://www.h-ui.net/\" target=\"_blank\" title=\"H-ui前端框架\">十五度工作室</a>提供</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</footer>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/static/h-ui/js/H-ui.min.js\"></script> \r\n");
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
