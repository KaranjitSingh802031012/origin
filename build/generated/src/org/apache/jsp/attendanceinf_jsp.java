package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class attendanceinf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  display: block\n");
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
      out.write("<h2 align=\"center\"><font><strong><h2> Attendance Analysis </h2></strong></font></h2>\n");
      out.write("<div  style=\"overflow-y:auto;\">\n");

int i=0;
int m=0;
int j=0;
int k=0;
int l=0;
int totallec=0;
int totallec1=0;
int totallec2=0;
int totallec3=0;
int totallec4=0;
int abs1=0;
int abs2=0;
int abs3=0;
int abs4=0;
int abs5=0;


        


      out.write('\n');

try{ 
    
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123");
statement=con.createStatement();
String sql ="SELECT * FROM attendance";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("\n");


 if(resultSet.getString("rollno").equals("1")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec=totallec+1;}
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("2")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec1=totallec1+1;}
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("3")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec2=totallec2+1;}
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("4")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec3=totallec3+1;}
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("5")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec4=totallec4+1;}
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


 if(resultSet.getString("rollno").equals("1")&resultSet.getString("Attendance").equals("Present")){
     i=i+1;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


 if(resultSet.getString("rollno").equals("1")&resultSet.getString("Attendance").equals("Absent")){
     abs1=abs1+1;
 }

      out.write('\n');


 if(resultSet.getString("rollno").equals("2")&resultSet.getString("Attendance").equals("Absent")){
     abs2=abs2+1;
 }

      out.write('\n');


 if(resultSet.getString("rollno").equals("3")&resultSet.getString("Attendance").equals("Absent")){
     abs3=abs3+1;
 }

      out.write('\n');


 if(resultSet.getString("rollno").equals("4")&resultSet.getString("Attendance").equals("Absent")){
     abs4=abs4+1;
 }

      out.write('\n');


 if(resultSet.getString("rollno").equals("5")&resultSet.getString("Attendance").equals("Absent")){
     abs5=abs5+1;
 }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


 if(resultSet.getString("rollno").equals("1")&resultSet.getString("Attendance").equals("Absent")){
     i=i;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("2")&resultSet.getString("Attendance").equals("Present")){
     m=m+1;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');

if(resultSet.getString("rollno").equals("2")&resultSet.getString("Attendance").equals("Absent")){
     m=m;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("3")&resultSet.getString("Attendance").equals("Present")){
     j=j+1;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("3")&resultSet.getString("Attendance").equals("Absent")){
     j=j;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("4")&resultSet.getString("Attendance").equals("Present")){
     k=k+1;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("4")&resultSet.getString("Attendance").equals("Absent")){
     k=k;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("5")&resultSet.getString("Attendance").equals("Present")){
     l=l+1;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write('\n');


 if(resultSet.getString("rollno").equals("5")&resultSet.getString("Attendance").equals("Absent")){
     l=l;
 

      out.write("\n");
      out.write("\n");
      out.write("\n");

 }
 
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
 
}

} catch (Exception e) {
out.print(e);
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"1\">\n");
      out.write("    <tr bgcolor=\"#A52A2A\">\n");
      out.write("        <TD>Name</TD>\n");
      out.write("        \n");
      out.write("        <TD>Lectures attended</TD>\n");
      out.write("        <TD>Absents</TD>\n");
      out.write("        <TD>Attendance Percentage</TD>\n");
      out.write("    </tr><tr bgcolor=\"#DEB887\">\n");
      out.write("        <td>Aaryan</TD> \n");
      out.write("          <td>");
      out.print(i);
      out.write("</TD>\n");
      out.write("           <td>");
      out.print(abs1);
      out.write("</TD>\n");
      out.write("               ");

int q=(i*100)/totallec;



      out.write("<td>");
      out.print(q);
      out.write("%</TD>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#DEB887\">\n");
      out.write("<td>Abhinandan</TD>\n");
      out.write("    <td>");
      out.print(m);
      out.write("</TD>\n");
      out.write("            <td>");
      out.print(abs2);
      out.write("</TD>\n");
      out.write("    ");

int e=(m*100)/totallec1;




      out.write("<td>");
      out.print(e);
      out.write("%</TD>\n");
      out.write("</tr>\n");
      out.write("  <tr bgcolor=\"#DEB887\">          <td>Karanjit</TD>\n");
      out.write("    <td>");
      out.print(j);
      out.write("\n");
      out.write("            <td>");
      out.print(abs3);
      out.write("</TD> ");

int b=(j*100)/totallec2;



      out.write("<td>");
      out.print(b);
      out.write("%</TD>\n");
      out.write("  </tr>\n");
      out.write("  <tr bgcolor=\"#DEB887\">\n");
      out.write("<h6><td>Upinder  </TD>\n");
      out.write("    <td>");
      out.print(k);
      out.write("</TD>\n");
      out.write("            <td>");
      out.print(abs4);
      out.write("</TD>");

int r=(k*100)/totallec3;



      out.write("<td>");
      out.print(r);
      out.write("%</TD>\n");
      out.write("            </tr>\n");
      out.write("            <tr bgcolor=\"#DEB887\">\n");
      out.write("<h6><td>Yadwinder </TD>\n");
      out.write("    <td>");
      out.print(l);
      out.write("</TD>\n");
      out.write("            <td>");
      out.print(abs5);
      out.write("</TD>");

int z=(l*100)/totallec4;



      out.write("<TD>");
      out.print(z);
      out.write("%</TD></h6>\n");
      out.write("</tr>\n");
      out.write("</DIV>\n");
      out.write("\n");
      out.write("\n");
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
