/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-07-05 07:05:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.arrival_005fplan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/pages/inc/header.jsp", Long.valueOf(1467344552942L));
    _jspx_dependants.put("/WEB-INF/pages/inc/nav.jsp", Long.valueOf(1467344552940L));
    _jspx_dependants.put("/WEB-INF/pages/inc/common.jspf", Long.valueOf(1467344552947L));
    _jspx_dependants.put("/WEB-INF/pages/inc/footer.jsp", Long.valueOf(1467344552949L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	String basePath = request.getContextPath();
	request.setAttribute("basePath", basePath);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\"no-js\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"\">\r\n");
      out.write("\t<!--<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">-->\r\n");
      out.write("\t<title>仓储管理系统</title>\r\n");
      out.write("\t<!-- Set render engine for 360 browser -->\r\n");
      out.write("\t<meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("\t<!-- No Baidu Siteapp-->\r\n");
      out.write("\t<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\"/>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/amaze/css/amazeui.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/amaze/css/app.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- datatables-master -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/datatables-master/amazeui.datatables.min.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/common.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery/jquery-1.10.0.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!--[if (gte IE 9)|!(IE)]><!-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/amaze/js/jquery.min.js\"></script>\r\n");
      out.write("\t<!--<![endif]-->\r\n");
      out.write("\t<!--[if lte IE 8 ]>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/amaze/js/amazeui.ie8polyfill.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/amaze/js/amazeui.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- My97DatePicker -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- datatables-master -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/datatables-master/amazeui.datatables.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- jquery form -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/jquery/jquery.form.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Validform -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/Validform/Validform_v5.3.2.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/lib/Validform/Validform_Datatype.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$.ajaxSetup ({ \r\n");
      out.write("\t\tcache: false //close AJAX cache \r\n");
      out.write("\t});\r\n");
      out.write("\tvar basePath = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t</script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"am-container wm-container\">\r\n");
      out.write("\t<!-- header start -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header id=\"hearderAnchor\" class=\"am-topbar am-topbar-inverse\">\r\n");
      out.write("\t<h1 class=\"am-topbar-brand\" style=\"color: #fff;\">\r\n");
      out.write("\t\t<strong style=\"cursor: pointer;font-size: 28px;text-shadow: 1px 1px 1px #000;\">仓储管理系统</strong>\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t<div class=\"am-fr\" style=\"margin-right: 10px;\">\r\n");
      out.write("\t\t<div class=\"am-btn-group\">\r\n");
      out.write("\t\t\t<div class=\"am-dropdown\" data-am-dropdown>\r\n");
      out.write("\t\t\t\t<button class=\"am-btn am-btn-primary am-topbar-btn am-btn-sm am-dropdown-toggle\" data-am-dropdown-toggle>\r\n");
      out.write("\t\t\t\t\t<span class=\"am-icon-user\"></span> 天津XX经贸公司\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<ul class=\"am-dropdown-content\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:showEditPasswordModal();\">修改密码</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"am-divider\"></li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login/view\" >\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"am-icon-power-off\"></span> 退出\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!-- edit password modal start -->\r\n");
      out.write("<div class=\"am-modal am-modal-prompt\" tabindex=\"-1\" id=\"headerEditPasswordModal\">\r\n");
      out.write("\t<div class=\"am-modal-dialog\">\r\n");
      out.write("\t\t<div class=\"am-modal-hd\">修改密码</div>\r\n");
      out.write("\t\t<div class=\"am-modal-bd wm-modal-bd\">\r\n");
      out.write("\t\t\t<form id=\"headerEditPasswordForm\" class=\"am-form am-form-horizontal\">\r\n");
      out.write("\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t旧密码<span class=\"am-text-danger\">&nbsp;*</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"请输入旧密码\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t新密码<span class=\"am-text-danger\">&nbsp;*</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"请输入新密码\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t密码确认<span class=\"am-text-danger\">&nbsp;*</span>\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"请再次输入新密码\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"am-modal-footer\">\r\n");
      out.write("\t\t\t<span class=\"am-modal-btn wm-modal-cancel-btn\" data-am-modal-cancel>取消</span>\r\n");
      out.write("\t\t\t<span class=\"wm-modal-btn\" onclick=\"javascript:void(0);\">确定</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- edit password modal end -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/app/inc/header.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- header end -->\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"am-g\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- nav start -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"am-u-sm-3\">\r\n");
      out.write("\t<ul class=\"am-list admin-sidebar-list\" id=\"wm-nav\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<li id=\"nav-1\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" onclick=\"javascript:jumpTo('arrival_plan/list');\">\r\n");
      out.write("\t\t\t\t<span class=\"am-margin-left-sm\">到货计划管理</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li id=\"nav-2\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" onclick=\"javascript:jumpTo('deliver_order/list');\">\r\n");
      out.write("\t\t\t\t<span class=\"am-margin-left-sm\">发货订单管理</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li id=\"nav-3\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" onclick=\"javascript:jumpTo('return_goods/list');\">\r\n");
      out.write("\t\t\t\t<span class=\"am-margin-left-sm\">退货管理</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li id=\"nav-4\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" onclick=\"javascript:jumpTo('damage/list');\">\r\n");
      out.write("\t\t\t\t<span class=\"am-margin-left-sm\">报损管理</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li id=\"nav-5\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" onclick=\"javascript:jumpTo('destroy/list');\">\r\n");
      out.write("\t\t\t\t<span class=\"am-margin-left-sm\">销毁管理</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li id=\"nav-6\">\r\n");
      out.write("\t\t\t<a href=\"javascript:void(0);\" onclick=\"javascript:jumpTo('recipient/list');\">\r\n");
      out.write("\t\t\t\t<span class=\"am-margin-left-sm\">收货人管理</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/app/inc/nav.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- nav end -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t<ol class=\"am-breadcrumb wm-breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/index/view\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/arrival_plan/list/view\">到货计划管理</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"am-active\">编辑到货计划</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t<hr class=\"wm-hr\">\r\n");
      out.write("\t\t\t<!-- context start -->\r\n");
      out.write("\t\t\t<div class=\"am-u-sm-10 am-u-sm-centered\">\r\n");
      out.write("\t\t\t\t<!-- 编辑面板开始 -->\r\n");
      out.write("\t\t\t\t<div class=\"am-panel am-panel-primary wm-panel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"am-panel-hd\">编辑到货计划</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"am-panel-bd\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"am-form wm-form am-form-horizontal\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t到货计划编号\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tDH20160101001001\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t发货时间<span class=\"am-text-danger\">&nbsp;*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"请输入发货时间\" class=\"wm-Wdate\" onFocus=\"WdatePicker({skin:'whyGreen'})\" readonly=\"readonly\" value=\"2016-01-01\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t预计到货时间<span class=\"am-text-danger\">&nbsp;*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"请输入预计到货时间\" class=\"wm-Wdate\" onFocus=\"WdatePicker({skin:'whyGreen'})\" readonly=\"readonly\" value=\"2016-01-31\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t送货联系人<span class=\"am-text-danger\">&nbsp;*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"请输入送货联系人\" value=\"赵五\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t送货联系人电话<span class=\"am-text-danger\">&nbsp;*</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"请输入送货联系人电话\" value=\"13800138000\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t直送\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"am-checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" onclick=\"switchDirectDelivery(this);\" checked=\"checked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\" id=\"directDeliveryExplainContainer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t直送说明\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea placeholder=\"请输入直送说明\">收货后直接发货到XX处</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t备注\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<textarea placeholder=\"请输入备注\">轻拿轻放,禁止堆放</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t填单时间\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t2016-01-01\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t到货状态\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t未提交\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-g\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-u-sm-12\" style=\"text-align: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"wm-inner-table-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"wm-inner-table-title-label\">到货计划商品详情信息</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button title=\"新增到货计划商品\" type=\"button\" class=\"am-btn am-btn-default\" onclick=\"openCommodityChoosingModal();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"am-icon-plus\"></span> 新增\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<table class=\"am-table am-table-striped am-table-hover table-main\">\r\n");
      out.write("\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>自定义编码</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>商品名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>规格型号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>计划到货数量</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>包装单位</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th style=\"text-align: center;\">操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>JLYDDY</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>金龙鱼大豆油</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>10L/桶</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>箱</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"am-u-sm-12\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"am-btn-group am-btn-group-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button title=\"编辑到货计划商品\" class=\"am-btn am-btn-default am-btn-xs am-text-secondary\" onclick=\"openCommodityEditingModal();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"am-icon-pencil-square-o\"></span> 编辑\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button title=\"删除到货计划商品\" class=\"am-btn am-btn-default am-btn-xs am-text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"am-icon-trash-o\"></span> 删除\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>金龙鱼大豆油</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>10L/桶</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>箱</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"am-u-sm-12\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"am-btn-group am-btn-group-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button title=\"编辑到货计划商品\" class=\"am-btn am-btn-default am-btn-xs am-text-secondary\" onclick=\"openCommodityEditingModal();\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"am-icon-pencil-square-o\"></span> 编辑\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button title=\"删除到货计划商品\" class=\"am-btn am-btn-default am-btn-xs am-text-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"am-icon-trash-o\"></span> 删除\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<footer class=\"am-panel-footer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-text-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"am-btn am-btn-primary\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"am-btn am-btn-primary\">保存</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"am-btn am-btn-default\" onclick=\"history.back();\">返回</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</footer>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 编辑面板结束 -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- 商品选择窗口开始 -->\r\n");
      out.write("\t\t\t\t<div id=\"commodityChoosingModal\" class=\"am-modal am-modal-prompt\" tabindex=\"-1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"am-modal-dialog\" style=\"width: 750px;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-modal-hd\">选择商品</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-modal-bd am-text-left wm-modal-bd\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-panel am-panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-panel-bd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form class=\"am-form-inline\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label>自定义编码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"am-form-field\" placeholder=\"请输入自定义编码\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label>商品名称</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"am-form-field\" placeholder=\"请输入商品名称\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button title=\"搜索商品\" type=\"button\" class=\"am-btn am-btn-default\">搜索</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr class=\"wm-hr\" style=\"margin-top: 15px!important;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table id=\"commodityChoosingTable\" class=\"am-table am-table-striped am-table-hover table-main\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>选择</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>自定义编码</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>商品名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>规格型号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th>包装单位</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"am-radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>JLYDDY</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>金龙鱼大豆油</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>10L/桶</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>箱</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<label class=\"am-radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"radio\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>金龙鱼大豆油</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>10L/桶</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>箱</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"am-panel am-panel-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-panel-bd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form class=\"am-form-inline\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<label>计划到货数量</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"am-form-field\" placeholder=\"请输入计划到货数量\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"am-modal-btn wm-modal-cancel-btn\" data-am-modal-cancel>取消</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"wm-modal-btn\">确定</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 商品选择窗口结束 -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- 商品编辑窗口开始 -->\r\n");
      out.write("\t\t\t\t<div id=\"commodityEditingModal\" class=\"am-modal am-modal-prompt\" tabindex=\"-1\">\r\n");
      out.write("\t\t\t\t\t<div class=\"am-modal-dialog\" style=\"width: 600px;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-modal-hd\">编辑商品</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-modal-bd am-text-left wm-modal-bd\">\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"am-form wm-form am-form-horizontal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"am-u-sm-3 am-form-label\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t计划到货数量\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"am-u-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"am-form-field\" placeholder=\"请输入计划到货数量\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"am-modal-footer\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"am-modal-btn wm-modal-cancel-btn\" data-am-modal-cancel>取消</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"wm-modal-btn\">确定</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 商品编辑窗口结束 -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- context end -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- footer start -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\" style=\"height: 100px;margin-top: 50px;\">\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<div class=\"am-g\">\r\n");
      out.write("\t\t<div class=\"am-u-sm-6 am-u-sm-centered\" style=\"text-align:center;\">\r\n");
      out.write("\t\t\t<p>© 版权信息</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t<!-- footer end -->\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${basePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/app/arrival_plan/edit.js\"></script>\r\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
