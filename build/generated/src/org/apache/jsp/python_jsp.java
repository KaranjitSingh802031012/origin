package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class python_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <title>python Page</title>\n");
      out.write("    </head>\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"aistyle.css\">\n");
      out.write("      <div class=\"img\">\n");
      out.write("          <img src=\"logo_cdac.png\" class=\"l\">\n");
      out.write("     </div>\n");
      out.write("     <div class=\"img1\">\n");
      out.write("         <img src=\"sub img/python.jpg\" class=\"ai\">\n");
      out.write("     </div>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"about\">\n");
      out.write("        <h1>About Python</h1>\n");
      out.write("        <p>\n");
      out.write("                Python is an interpreted, high-level, general-purpose programming language.\n");
      out.write("                Created by Guido van Rossum and first released in 1991, Python's design \n");
      out.write("                philosophy emphasizes code readability with its notable use of significant whitespace\n");
      out.write("                . Its language constructs and object-oriented approach aim to help programmers\n");
      out.write("                write clear, logical code for small and large-scale projects.[28]\n");
      out.write("\n");
      out.write("              Python is dynamically typed and garbage-collected.\n");
      out.write("             It supports multiple programming paradigms, including \n");
      out.write("             structured (particularly, procedural), object-oriented, \n");
      out.write("              and functional programming. Python is often described as a \"batteries included\"\n");
      out.write("              language due to its comprehensive standard library.[29]\n");
      out.write("\n");
      out.write("            Python was conceived in the late 1980s \n");
      out.write("            as a successor to the ABC language. Python 2.0,\n");
      out.write("            released in 2000, introduced features like list\n");
      out.write("            comprehensions and a garbage collection system capable of\n");
      out.write("            collecting reference cycles. Python 3.0,\n");
      out.write("            released in 2008, was a major revision of the\n");
      out.write("            language that is not completely backward-compatible,\n");
      out.write("            and much Python 2 code does not run unmodified on Python 3.\n");
      out.write("             \n");
      out.write("            </p><br>\n");
      out.write("            <p>\n");
      out.write("            <h3>Course Details</h3>\n");
      out.write("            <h4>Duration :</h4> <h5>6 months</h5>\n");
      out.write("            <h4>Start Date :</h4><h5> 6 Jan,2020</h5> <h4>End Date :</h4> <h5>3 Jul,2020</h5>\n");
      out.write("                       \n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("            <h3>Fee Details</h3>\n");
      out.write("            <h4>Total Fees :</h4> <h5>18000 + tax(13% inclusive GST)</h5>\n");
      out.write("            \n");
      out.write("            </p>\n");
      out.write("            </div>\n");
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
