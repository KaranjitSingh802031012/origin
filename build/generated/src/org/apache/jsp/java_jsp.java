package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class java_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("             <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"aistyle.css\">\n");
      out.write("      <div class=\"img\">\n");
      out.write("          <img src=\"logo_cdac.png\" class=\"l\">\n");
      out.write("     </div>\n");
      out.write("     <div class=\"img1\">\n");
      out.write("         <img src=\"sub img/java.jpg\" class=\"ai\">\n");
      out.write("     </div>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"about\">\n");
      out.write("        <h1>About JAVA</h1>\n");
      out.write("            <p>\n");
      out.write("               Java is a general-purpose programming language that is class-based, object-oriented, and\n");
      out.write("               designed to have as few implementation dependencies as possible. It is intended to let application developers\n");
      out.write("               write once, run anywhere (WORA),[16] meaning that compiled \n");
      out.write("               Java code can run on all platforms that support Java without\n");
      out.write("               the need for recompilation.[17] Java applications are typically\n");
      out.write("               compiled to bytecode that can run on any Java virtual machine (JVM)\n");
      out.write("               regardless of the underlying computer architecture. The syntax of Java\n");
      out.write("               is similar to C and C++, but it has fewer low-level facilities than either\n");
      out.write("               of them. As of 2019, Java was one of the most popular programming languages \n");
      out.write("               in use according to GitHub,[18][19] particularly for client-server web applications,\n");
      out.write("               with a reported 9 million developers.\n");
      out.write("            </p><br>\n");
      out.write("           \n");
      out.write("            <h3>Course Details</h3>\n");
      out.write("            <h4>Duration :</h4> <h5>6 months</h5>\n");
      out.write("            <h4>Start Date :</h4><h5> 6 Jan,2020</h5> <h4>End Date :</h4> <h5>3 Jul,2020</h5>\n");
      out.write("                     \n");
      out.write("            \n");
      out.write("            <h3>Fee Details</h3>\n");
      out.write("            <h4>Total Fees :</h4> <h5>15000 + tax(13% inclusive GST)</h5>\n");
      out.write("            \n");
      out.write("                      </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
