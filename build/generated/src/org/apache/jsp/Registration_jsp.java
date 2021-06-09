package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registration Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"regbox\"> \n");
      out.write("           <h1>Registration Form(Student)</h1>\n");
      out.write("               \n");
      out.write("           <form class=\"form1\" action=\"./AddStudentrec\" method=\"post\">\n");
      out.write("                <div class=\"c\"> \n");
      out.write("                <p>Course Name</p>\n");
      out.write("                <select class=\"course\" name=\"course\">\n");
      out.write("                        <option >Select course</option>\n");
      out.write("                        <option>Java </option>\n");
      out.write("                         <option>Artificial Intelligence</option>\n");
      out.write("                          <option>Cyber Security</option>\n");
      out.write("                           <option>Python</option>\n");
      out.write("                           \n");
      out.write("                        \n");
      out.write("                    </select> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"fname\">\n");
      out.write("                <p>First Name</p>\n");
      out.write("                <input type=\"text\" class=\"first\" name=\"fname\"placeholder=\"Enter first name here\"  >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"lname\">\n");
      out.write("                 <p>Last Name</p>\n");
      out.write("                 <input type=\"text\" class=\"last\" name=\"lname\" placeholder=\"Enter last name here\" ><br><br>\n");
      out.write("                 </div>\n");
      out.write("                     <div class=\"faname\">\n");
      out.write("                <p>Father's Name</p>\n");
      out.write("                <input type=\"text\" class=\"father\" name=\"fathername\"placeholder=\"Enter father's name here\" >\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"moname\">\n");
      out.write("                 <p>Mother's Name</p>\n");
      out.write("                 <input type=\"text\" class=\"mother\" name=\"mothername\"placeholder=\"Enter mother's name here\" ><br><br>\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"mobile\">\n");
      out.write("                  <p>Mobile</p>\n");
      out.write("                  <input type=\"text\" class=\"mob\" name=\"mobile\" placeholder=\"Enter mobille number here\" >\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"email\">\n");
      out.write("                 <p>Email</p>\n");
      out.write("                 <input type=\"text\"  class=\"mail\" name=\"email\"placeholder=\"Enter email here\" ><br><br>\n");
      out.write("                     </div>\n");
      out.write("                   <div class=\"address\">\n");
      out.write("                  <p>Correspondence Address</p>\n");
      out.write("                  <input type=\"text\" style=\"height:100px;width: 600px\"    name=\"address\">\n");
      out.write("                   </div>\n");
      out.write("                     <div class=\"city\">\n");
      out.write("                 <p>City</p>\n");
      out.write("                 <input type=\"text\" name=\"city\"  class=\"ci\" placeholder=\"Enter city name here\" >\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"state\">\n");
      out.write("                 <p>State</p>\n");
      out.write("                 <input type=\"text\" name=\"state\" class=\"st\" placeholder=\"Enter State name here\" >                 \n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"pin\">\n");
      out.write("                 <p>Pin</p>\n");
      out.write("                 <input type=\"text\" name=\"pin\" class=\"p\" placeholder=\"Enter pincode here\" >\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"dob\">\n");
      out.write("                  <p>Date of Birth</p>\n");
      out.write("                  <input type=\"text\" name=\"dob\" class=\"d\" placeholder=\"DD/MM/YYYY\" >\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"hostel\">\n");
      out.write("                    <p>Hostel Alloted</p>\n");
      out.write("                    <select class=\"hr\" name=\"hostel\">\n");
      out.write("                        <option >click here to select</option>\n");
      out.write("                        <option>YES</option>\n");
      out.write("                         <option>NO</option>\n");
      out.write("                        \n");
      out.write("                    </select>  \n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"gender\">\n");
      out.write("                    \n");
      out.write("                     <p>Gender</p>\n");
      out.write("                    <select class=\"g\" name=\"gender\">\n");
      out.write("                        <option >click here to select</option>\n");
      out.write("                        <option>Male</option>\n");
      out.write("                         <option>Female</option>\n");
      out.write("                        \n");
      out.write("                    </select> \n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"clg\">\n");
      out.write("                       <p>College Name</p>\n");
      out.write("                  <input type=\"text\" class=\"college\" name=\"cname\" placeholder=\"Enter college name here\" >\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"qual\">\n");
      out.write("                                      \n");
      out.write("                     <p>Qualification</p>\n");
      out.write("                     <select class=\"qualification\" name=\"qual\">\n");
      out.write("                        <option >click here to select</option>\n");
      out.write("                        <option>B.Tech</option>\n");
      out.write("                         <option>M.C.A</option>\n");
      out.write("                          <option>B.C.A</option>\n");
      out.write("                           <option>Diploma</option>\n");
      out.write("                            <option>Other</option>\n");
      out.write("                        \n");
      out.write("                    </select> \n");
      out.write("                         <div class=\"gender\">\n");
      out.write("                    \n");
      out.write("                     <p>Second Installment Paid</p>\n");
      out.write("                    <select class=\"g\" name=\"installment\">\n");
      out.write("                        <option >click here to select</option>\n");
      out.write("                        <option>Yes</option>\n");
      out.write("                         <option>No</option>\n");
      out.write("                        \n");
      out.write("                    </select> \n");
      out.write("                              \n");
      out.write("                     </div>\n");
      out.write("                      <div class=\"clg\">\n");
      out.write("                       <p>Roll No</p>\n");
      out.write("                  <input type=\"text\" class=\"college\" name=\"rollno\" placeholder=\"Enter Roll no\" >\n");
      out.write("                     </div>\n");
      out.write("                     <div class=\"submit\">\n");
      out.write("                      <input type=\"submit\" value=\"Submit\">\n");
      out.write("                     </div>\n");
      out.write("            </form>\n");
      out.write("</div>\n");
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
