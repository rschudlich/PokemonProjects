/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-03-01 20:21:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1676317461282L));
    _jspx_dependants.put("jar:file:/C:/Users/rschu/Temp%20Eclipse%20Workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/PackSimulator/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<style>\r\n");
      out.write(".cardList {\r\n");
      out.write("	display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    flex-wrap: wrap; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card.img {\r\n");
      out.write("	height: 100px;\r\n");
      out.write("	width: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("header {\r\n");
      out.write("    color: blue;\r\n");
      out.write("    font-size: 36px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    grid-area: \"header\";\r\n");
      out.write("    font: arial;\r\n");
      out.write("  }\r\n");
      out.write("l1 {\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    justify-content: right;\r\n");
      out.write("  }\r\n");
      out.write("button {\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 15px 33px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    margin: 4px 2px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    background-color: blue;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write(".center {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("  }\r\n");
      out.write(".box {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    margin-right: 209px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .box select {\r\n");
      out.write("    background-color: blue;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 12px;\r\n");
      out.write("    width: 236px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    outline: none;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .box select option {\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("  }\r\n");
      out.write("  body {\r\n");
      out.write("   background: linear-gradient(-45deg, #52ee98, #3ce7e7, #23a6d5, #c3d523);\r\n");
      out.write("   background-size: 400% 400%;\r\n");
      out.write("   animation: gradient 15s ease infinite;\r\n");
      out.write("   height: 100vh;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .nine h1 {\r\n");
      out.write("    text-align:center; font-size:50px; text-transform:uppercase; color:#222; letter-spacing:1px;\r\n");
      out.write("    font-family:\"Playfair Display\", serif; font-weight:400;\r\n");
      out.write("  }\r\n");
      out.write("  .nine h1 span {\r\n");
      out.write("    margin-top: 5px;\r\n");
      out.write("      font-size:15px; color: blue; word-spacing:1px; font-weight:normal; letter-spacing:2px;\r\n");
      out.write("      text-transform: uppercase; font-family:\"Raleway\", sans-serif; font-weight:500;\r\n");
      out.write("  \r\n");
      out.write("      display: grid;\r\n");
      out.write("      grid-template-columns: 1fr max-content 1fr;\r\n");
      out.write("      grid-template-rows: 27px 0;\r\n");
      out.write("      grid-gap: 20px;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .nine h1 span:after,.nine h1 span:before {\r\n");
      out.write("      content: \" \";\r\n");
      out.write("      display: block;\r\n");
      out.write("      border-bottom: 1px solid #ccc;\r\n");
      out.write("      border-top: 1px solid #ccc;\r\n");
      out.write("      height: 5px;\r\n");
      out.write("    background-color:#f8f8f8;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("   .nine h2 {\r\n");
      out.write("    text-align:center; font-size:50px; text-transform:uppercase; color:#222; letter-spacing:1px;\r\n");
      out.write("    font-family:\"Playfair Display\", serif; font-weight:400;\r\n");
      out.write("  }\r\n");
      out.write("  .nine h2 span {\r\n");
      out.write("    margin-top: 5px;\r\n");
      out.write("      font-size:24px; color: blue; word-spacing:1px; font-weight:normal; letter-spacing:2px;\r\n");
      out.write("      text-transform: uppercase; font-family:\"Raleway\", sans-serif; font-weight:500;\r\n");
      out.write("  \r\n");
      out.write("      display: grid;\r\n");
      out.write("      grid-template-columns: 1fr max-content 1fr;\r\n");
      out.write("      grid-template-rows: 27px 0;\r\n");
      out.write("      grid-gap: 20px;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .nine h2 span:after,.nine h2 span:before {\r\n");
      out.write("      content: \" \";\r\n");
      out.write("      display: block;\r\n");
      out.write("      border-bottom: 1px solid #ccc;\r\n");
      out.write("      border-top: 1px solid #ccc;\r\n");
      out.write("      height: 5px;\r\n");
      out.write("    background-color:#f8f8f8;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  .whitepaper {\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    width: 94%;\r\n");
      out.write("    margin-left:3%;\r\n");
      out.write("    height: 95vh;\r\n");
      out.write("    box-shadow:3px 3px 5px 2px rgba(0,0,0,.8);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("    @keyframes gradient {\r\n");
      out.write("   0% {\r\n");
      out.write("   background-position: 0% 50%;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   50% {\r\n");
      out.write("   background-position: 100% 50%;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   100% {\r\n");
      out.write("    background-position: 0% 50%;\r\n");
      out.write("    }\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write(" <div class=\"d-flex flex-column justify-content-center w-100 h-100\">\r\n");
      out.write("  <div class=\"whitepaper\">\r\n");
      out.write(" \r\n");
      out.write("    \r\n");
      out.write("  <header>\r\n");
      out.write("    <div class=\"nine\">\r\n");
      out.write("      <h1>Pokemon Pack Opening Simulator<span>Below you can choose your pack and then click the button to open!</span></h1>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("  <body> \r\n");
      out.write("  \r\n");
      out.write("  ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <form method = GET action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${formAction}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    <div class=\"box\">\r\n");
      out.write("       <label for=\"packs\"><l1>Packs you can open:&nbsp;&nbsp;</l1></label>\r\n");
      out.write("        <select id=\"packs\" class=\"form-control\" name = \"packs\">\r\n");
      out.write("          <option value=\"Silver Tempest\">Silver Tempest</option>\r\n");
      out.write("          <option value=\"Lost Origin\">Lost Origin</option>\r\n");
      out.write("          <option value=\"Astral Radiance\">Astral Radiance</option>\r\n");
      out.write("        </select>\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class = \"center\">\r\n");
      out.write("    	<label for=\"quantity\">Quantity (Max 36):</label>\r\n");
      out.write("		<input type = \"number\" id=\"quantity\" name=\"quantity\" min=\"1\" max=\"36\">\r\n");
      out.write("	</div>\r\n");
      out.write("     \r\n");
      out.write("	 <div class = \"center\">\r\n");
      out.write("        <button type=\"submit\" class = \"btn btn-primary\">\r\n");
      out.write("            Click here to open pack!\r\n");
      out.write("        </button>\r\n");
      out.write("     </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("      <div class = \"nine\">\r\n");
      out.write("    <h2><span> Opening ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${packName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></h2>\r\n");
      out.write("     </div>\r\n");
      out.write("     \r\n");
      out.write("     <div class = \"cardList\">\r\n");
      out.write("     ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	 </div>\r\n");
      out.write("   \r\n");
      out.write("   </body>\r\n");
      out.write("   </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(176,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("formAction");
      // /WEB-INF/views/home.jsp(176,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/pack");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/home.jsp(207,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home.jsp(207,5) '${cardList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${cardList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/home.jsp(207,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("card");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("     	\r\n");
            out.write("     	<div class = \"card\">	\r\n");
            out.write("	 		<p>&nbsp;&nbsp;");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${card.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&nbsp;&nbsp;</p>\r\n");
            out.write("	 		<p>&nbsp;&nbsp;");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${card.getImage()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("&nbsp;&nbsp;</p>\r\n");
            out.write("	 		");
            if (_jspx_meth_c_005furl_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write(" \r\n");
            out.write("			<img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgSrc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"/>\r\n");
            out.write("	 	</div>		\r\n");
            out.write("	 	\r\n");
            out.write("	 ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/views/home.jsp(212,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setVar("imgSrc");
      // /WEB-INF/views/home.jsp(212,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/images/pokemon.jpg");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }
}
