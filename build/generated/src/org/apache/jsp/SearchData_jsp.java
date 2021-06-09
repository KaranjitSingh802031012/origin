package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         \n");
      out.write("                 <style>\n");
      out.write("  body {\n");
      out.write("  background-image: url('marble-surface-wall-white-1323712.jpg');\n");
      out.write("} \n");
      out.write("h1,h2,h3,h4,h5,h6 j\n");
      out.write("{\n");
      out.write("     text-shadow: 2px 2px 5px red;\n");
      out.write("\tcolor:black;\n");
      out.write("\tpadding:0 0 9px 0;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("\tfont-family:'passion one';\n");
      out.write("}\n");
      out.write(" h1{font-size:60px;line-height:60px;}\n");
      out.write("h2{font-size:40px;line-height:50px;}\n");
      out.write("h3{font-size:32px;line-height:40px;}\n");
      out.write("h4{font-size:28px;line-height:34px;}\n");
      out.write("h5{font-size:24px;line-height:30px;}\n");
      out.write("h6{font-size:15px;line-height:24px;}\n");
      out.write(" input[type=text] {\n");
      out.write("  width: 18%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("   border: 2px solid red;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write("input[type=submit]{\n");
      out.write("    background-color: A52A2A; \n");
      out.write("  border: none;\n");
      out.write("  color: red;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border-radius: 12px;\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("   box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("  display: block\n");
      out.write("}\n");
      out.write(" </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align='center'>\n");
      out.write("        <form action=\"./Searchstuddata\"> \n");
      out.write("            <h1>&nbsp&nbsp&nbspSearching Data from Staff Information</h1>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("           \n");
      out.write("                    \n");
      out.write("                <h4>Enter the First name </h4>\n");
      out.write("                <br>\n");
      out.write("                    <input type=\"text\" name=\"First_name\"> \n");
      out.write("                <br>    \n");
      out.write("                   <h4>Enter Gender </h4>\n");
      out.write("                <br>    \n");
      out.write("                    <input type=\"text\" name=\"Gender\"> \n");
      out.write("                <br>    <h4>Enter Job Description </h4>\n");
      out.write("                <br>    <input type=\"text\" name=\"Job_Description\"> \n");
      out.write("                <br>   \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Search\">\n");
      out.write("                \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
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
