package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ai_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"aistyle.css\">\n");
      out.write("      <div class=\"img\">\n");
      out.write("          <img src=\"logo_cdac.png\" class=\"l\">\n");
      out.write("     </div>\n");
      out.write("     <div class=\"img1\">\n");
      out.write("         <img src=\"sub img/AI.jpg\" class=\"ai\">\n");
      out.write("     </div>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"about\">\n");
      out.write("        <h1>About AI</h1>\n");
      out.write("            <p>\n");
      out.write("                Artificial intelligence (AI) is the ability of a computer program or a machine to think and learn.\n");
      out.write("                It is also a field of study which tries to make computers \"smart\".\n");
      out.write("                They work on their own without being encoded with commands.\n");
      out.write("                John McCarthy came up with the name \"artificial intelligence\" in 1955.\n");
      out.write("                According to the father of Artificial Intelligence, \n");
      out.write("                John McCarthy, it is “The science and engineering of making intelligent machines,\n");
      out.write("                especially intelligent computer programs”.\n");
      out.write("\n");
      out.write("               Artificial Intelligence is a way of making a computer, a computer-controlled robot, \n");
      out.write("               or a software think intelligently, in the similar manner the intelligent humans think.\n");
      out.write("\n");
      out.write("               AI is accomplished by studying how human brain thinks, and how humans learn, decide, \n");
      out.write("               and work while trying to solve a problem, and then using the outcomes of this study as a basis of\n");
      out.write("               developing intelligent software and systems.\n");
      out.write("            </p><br>\n");
      out.write("           \n");
      out.write("            <h3>Course Details</h3>\n");
      out.write("            <h4>Duration :</h4> <h5>6 months</h5>\n");
      out.write("            <h4>Start Date :</h4><h5> 6 Jan,2020</h5> <h4>End Date :</h4> <h5>3 Jul,2020</h5>\n");
      out.write("                     \n");
      out.write("            \n");
      out.write("            <h3>Fee Details</h3>\n");
      out.write("            <h4>Total Fees :</h4> <h5>18000 + tax(13% inclusive GST)</h5>\n");
      out.write("            \n");
      out.write("                      </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
