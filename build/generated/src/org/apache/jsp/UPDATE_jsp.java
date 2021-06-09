package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class UPDATE_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title>Registration Form</title>\n");
      out.write("        <style>\n");
      out.write("               body {\n");
      out.write("  background-image: url('high-angle-photography-of-seashore-1705254.jpg');\n");
      out.write("}   \n");
      out.write("form {\n");
      out.write("    width: 1200px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1,h2,h3,h4,h5,h6\n");
      out.write("{\n");
      out.write("     text-shadow: 2px 2px 5px royalblue;\n");
      out.write("\tcolor:white;\n");
      out.write("\tpadding:0 0 9px 0;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("\tfont-family:'passion one';\n");
      out.write("}label\n");
      out.write("{\n");
      out.write("    text-shadow: 2px 2px 5px royalblue;\n");
      out.write("\tcolor:white;\n");
      out.write("\tpadding:0 0 9px 0;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tmargin:0;\n");
      out.write("\tpadding:0;\n");
      out.write("\tfont-family:'passion one';\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{font-size:60px;line-height:60px;}\n");
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
      out.write("input[type=password] {\n");
      out.write("  width: 18%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 6px 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("   border: 2px solid red;\n");
      out.write("  border-radius: 4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=radio] {\n");
      out.write("  width: 1%;\n");
      out.write("  padding: 12px 20px;\n");
      out.write("  margin: 4px 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("   border: 2px solid red;\n");
      out.write("  border-radius: 4px;}\n");
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
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String driverName = "com.mysql.jdbc.Driver";


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
out.print(e);
}

Connection con = null;
Statement st = null;
ResultSet rs= null; 
PreparedStatement pmt=null;
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>&nbsp&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Registration Form</h1>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div align=\"center\">\n");
      out.write("         \n");
      out.write("        \n");
      out.write("    \n");
      out.write("            <form class='form1'  action='./updatestaffinf' method=\"get\">  \n");
      out.write("               ");

 
    
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/staffinf","root","123");
    String u=request.getParameter("u");
    int a=Integer.parseInt(u);
    String data="Select *  from staffinf  where staff_id='"+a+"'";
    st=con.createStatement();
    
    rs =st.executeQuery(data);
    while(rs.next()){
        
      out.write("\n");
      out.write("        <INPUT TYPE='hidden' name='staff_id' value='");
      out.print( rs.getString("staff_id"));
      out.write("'/>\n");
      out.write("                \n");
      out.write("    <h4>First Name</h4>:<input type='text' name='first_Name' value='");
      out.print( rs.getString("First_name"));
      out.write("'  placeholder=\"First Name\" required>\n");
      out.write("            <br>\n");
      out.write("            <h4>Last Name</h4>:<input type='text' name='last_Name' value='");
      out.print( rs.getString("Last_Name"));
      out.write("' placeholder=\"Last Name\" required>\n");
      out.write("            <br> <h4>Email Address</h4>:<input type='text' name='email_Address'  value='");
      out.print( rs.getString("Email_Address"));
      out.write("' placeholder=\"Email Address\" required>\n");
      out.write("            <br><h4>Password</h4>:<input type='text' name='password' value='");
      out.print( rs.getString("Password"));
      out.write("' placeholder=\"Password\" required>\n");
      out.write("            <br><h4>Mobile Number</h4>:<input type='text' name='mobile_no' value='");
      out.print( rs.getString("Mobile_no"));
      out.write("' placeholder='Mobile no' required>\n");
      out.write("            <br><h4>Course</h4>:<input type='text' name='course' value='");
      out.print( rs.getString("Course"));
      out.write("'  required>\n");
      out.write("            <br><h4>Gender</h4>:<input type='text' name='gender' value='");
      out.print( rs.getString("Gender"));
      out.write("'  required>\n");
      out.write("            <br><h4>Job Description</h4>:<input type='text' name='job_description' value='");
      out.print( rs.getString("Job_Description"));
      out.write("' required>\n");
      out.write(" \n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("   ");

    }     
   
      out.write("\n");
      out.write("   <input type='submit' value=\"update\">\n");
      out.write("     \n");
      out.write("     \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    String b=request.getParameter("staff_id");
    String c=request.getParameter("First_name");
    String d=request.getParameter("Last_Name");
    String e=request.getParameter("Email_Address");
    String f=request.getParameter("Password");
    String g=request.getParameter("Mobile_no");
    if(b!=null && c!=null && d!=null && e!=null && f!=null && g!=null)
    {
        String query="update staffinf set First_name=?,Last_Name=?,Email_Address=?,Password=?,Mobile_no=? where staff_id='"+a+"'";
        pmt=con.prepareStatement(query);
        pmt.setString(1,c);
        pmt.setString(2,d);
        pmt.setString(3,e);
        pmt.setString(4,f);
        pmt.setString(5,g);
        pmt.executeUpdate();
        response.sendRedirect("viewstaffinf.jsp");
    }
    
    
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
