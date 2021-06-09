package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t\t<title>Contact</title>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\t\t<link href=\"css/grid.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<main>\n");
      out.write("\n");
      out.write("\t\t<!-------------------- header ------------------->\n");
      out.write("\n");
      out.write("\t\t<header>\n");
      out.write("\t\t\t\t\t\t<div class=\"inner\">\n");
      out.write("\t<h1 class=\"logo\"> <a href=\"#\"></a></h1>\n");
      out.write("\t<nav>\n");
      out.write("\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("\t\t\t\t\t<li class=\"current\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t</header>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-------------------- content ------------------->\n");
      out.write("\t\t\n");
      out.write("\t\t<section class=\"container\">\n");
      out.write("\t\t<div class=\"row content-bg\">\n");
      out.write("\t\t\n");
      out.write("\t\t<section class=\"adjust-3\">\n");
      out.write("\t\t<div class=\"wrap-col\">\n");
      out.write("\t\t<h2>Contact info:</h2>\n");
      out.write("\t\t<p class=\"p1\"><strong class=\"str-2\">Cdac</strong>\n");
      out.write("\t\t\n");
      out.write("\t\t<dl class=\"address\">\n");
      out.write("\t\t\t<dt>8901 Marmora Road, India, D04 89GR</dt>\n");
      out.write("\t\t\t<dd><span>Telephone:</span><b> +1 659 658 002</b></dd>\n");
      out.write("\t\t\t<dd><span>Fax:</span><b> +1 659 658 002</b></dd>\n");
      out.write("\t\t\t<dd><span>Email:</span><a href=\"#\"> mail@mymail.com</a></dd>\n");
      out.write("\t\t</dl>\n");
      out.write("\t\t\n");
      out.write("\t\t<dl class=\"address\">\n");
      out.write("\t\t\t<dt>8901 Marmora Road, India, D04 89GR</dt>\n");
      out.write("\t\t\t<dd><span>Telephone:</span><b> +1 659 658 002</b></dd>\n");
      out.write("\t\t\t<dd><span>Fax:</span><b> +1 659 658 002</b></dd>\n");
      out.write("\t\t\t<dd><span>Email:</span><a href=\"#\"> mail@mymail.com</a></dd>\n");
      out.write("\t\t</dl>\n");
      out.write("\t\t\n");
      out.write("\t\t</p>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\n");
      out.write("\t\t<section class=\"adjust-4\">\n");
      out.write("\t\t<div class=\"wrap-col\">\n");
      out.write("\t\t<h2>Contact Form:</h2>\n");
      out.write("\t\t<form id=\"contact-form\">\n");
      out.write("\t\t<fieldset>\n");
      out.write("\t\t\t<label><span>Name:</span><input type=\"text\"></label>\n");
      out.write("\t\t\t<label><span>Email:</span><input type=\"Email\"></label>\n");
      out.write("\t\t\t<label><span>Message:</span><textarea></textarea></label>\n");
      out.write("\t\t\t<div class=\"btns\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"button\">Reset</a>\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"button\">Send</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</fieldset>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\t\t\n");
      out.write("\t\t<!-------------------- footer ------------------->\n");
      out.write("\t\t\n");
      out.write("\t<footer>\n");
      out.write("\t\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row footer-bg\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"hr-border-2\"></div>\n");
      out.write("\t\t<div class=\"wrapper\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"adjust-3\">\n");
      out.write("\t\t<div class=\"wrap-col\">\n");
      out.write("\t\t<div class=\"copyright\">\n");
      out.write("\t\t&copy;2016<strong class=\"footer-logo\">Cdac</strong>\n");
      out.write("\t\t<div><a href=\"#\">cdac.com</a></div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"adjust-4\">\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"adjust-2\">\n");
      out.write("\t\t<div class=\"wrap-col\">\n");
      out.write("\t\t<h5 class=\"heading-1\">Archives:</h5>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"footer-list\">\n");
      out.write("\t\t<li><a href=\"#\">October 2016</a></li>\n");
      out.write("\t\t<li><a href=\"#\">December 2016</a></li>\n");
      out.write("\t\t<li><a href=\"#\">september 2016</a></li>\n");
      out.write("\t\t<li><a href=\"#\">November 2016</a></li>\n");
      out.write("\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"adjust-2\">\n");
      out.write("\t\t<div class=\"wrap-col\">\n");
      out.write("\t\t<h5 class=\"heading-1\">Links:</h5>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"footer-list\">\n");
      out.write("\t\t<li><a href=\"#\">Documentation</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Plugins</a></li>\n");
      out.write("\t\t<li><a href=\"#\">suggestion ideas</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Support forum</a></li>\n");
      out.write("\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"adjust-2\">\n");
      out.write("\t\t<div class=\"wrap-col\">\n");
      out.write("\t\t<h5 class=\"heading-1\">support:</h5>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"footer-list\">\n");
      out.write("\t\t<li><a href=\"#\">October 2016</a></li>\n");
      out.write("\t\t<li><a href=\"#\">October 2016</a></li>\n");
      out.write("\t\t<li><a href=\"#\">October 2016</a></li>\n");
      out.write("\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"adjust-2\">\n");
      out.write("\t\t<div class=\"wrap-col\">\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"social-list\">\n");
      out.write("\t\t<li><a href=\"#\"><img src=\"images/social-icon-1.png\"></a></li>\n");
      out.write("\t\t<li><a href=\"#\"><img src=\"images/social-icon-2.png\"></a></li>\n");
      out.write("\t\t<li><a href=\"#\"><img src=\"images/social-icon-3.png\"></a></li>\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</main>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
