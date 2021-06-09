package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class infAi_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE>Student Information</TITLE>\n");
      out.write("    \n");
      out.write("    <STYLE> \n");
      out.write("   body {\n");
      out.write("  background-image: url('marble-surface-wall-white-1323712.jpg');\n");
      out.write("}     \n");
      out.write("h1,h2,h3,h4,h5,h6\n");
      out.write("{\n");
      out.write("     text-shadow: 2px 2px 5px red;\n");
      out.write("\tcolor:black;\n");
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
      out.write("h6{font-size:20px;line-height:24px;}        \n");
      out.write("        \n");
      out.write("    .button {\n");
      out.write("  background-color: A52A2A; \n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 15px 32px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  border-radius: 12px;\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("   box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);\n");
      out.write("  display: block;\n");
      out.write("       margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("    }\n");
      out.write("  .button:hover {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  color: white;\n");
      out.write("}  \n");
      out.write("    \n");
      out.write("    </Style>\n");
      out.write("    </HEAD>\n");
      out.write("    <BODY>\n");


String driverName = "com.mysql.jdbc.Driver";


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
out.print(e);
}

Connection con = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<h2 align=\"center\"><font><strong><h2>Student Record</h2></strong></font></h2>\n");
      out.write("<div  style=\"overflow-y:auto;\">\n");
      out.write("<table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#A52A2A\">\n");
      out.write("<td><b>Student id</b></td>\n");
      out.write("<td><b>Course</b></td>\n");
      out.write("<td><b>First Name</b></td>\n");
      out.write("<td><b>Last Name</b></td>\n");
      out.write("<td><b>Fathers Name</b></td>\n");
      out.write("<td><b>Mothers Name</b></td>\n");
      out.write("<td><b>Mobile No</b></td>\n");
      out.write("<td><b>Email Address</b></td>\n");
      out.write("<td><b>Address</b></td>\n");
      out.write("<td><b>City</b></td>\n");
      out.write("<td><b>State</b></td>\n");
      out.write("<td><b>Pin</b></td>\n");
      out.write("<td><b>DOB</b></td>\n");
      out.write("<td><b>Gender</b></td>\n");
      out.write("<td><b>College</b></td>\n");
      out.write("<td><b>Qualification</b></td>\n");
      out.write("<td><b>Rollno</b></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");

int y=30;
int k=0;
try{ 
    
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123");
statement=con.createStatement();
String sql ="SELECT * FROM studentinf where Course='Artificial Intelligence'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
      k=y-1;
    y--;

      out.write("\n");
      out.write("<tr bgcolor=\"#DEB887\">\n");
      out.write("\n");
      out.write("<td>");
      out.print(resultSet.getInt("studen_id") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Course") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Fname") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Lname") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Fathname") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Mname") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Mno") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("email") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("address") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("City") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("State") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Pin") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Dob") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("gend") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("clg") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("qual") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Rollno") );
      out.write("</td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
 
}

} catch (Exception e) {
out.print(e);
}

      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</DIV>\n");
      out.write("<br>\n");
      out.write("<h6>Total Seats=30</h6>      <h6>Remaining Seats=");
      out.print(k );
      out.write("</h6>\n");
      out.write("<button class=\"button\"  type=\"button\">Back</button>\n");
      out.write("<BR>\n");
      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>");
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
