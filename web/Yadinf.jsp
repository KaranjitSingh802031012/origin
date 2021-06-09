<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<HTML>
    <HEAD>
        <TITLE>Student Information</TITLE>
    
    <STYLE> 
   body {
  background-image: url('marble-surface-wall-white-1323712.jpg');
}     
h1,h2,h3,h4,h5,h6
{
     text-shadow: 2px 2px 5px red;
	color:black;
	padding:0 0 9px 0;
	font-weight:bold;
	margin:0;
	padding:0;
	font-family:'passion one';
}

h1{font-size:60px;line-height:60px;}
h2{font-size:40px;line-height:50px;}
h3{font-size:32px;line-height:40px;}
h4{font-size:28px;line-height:34px;}
h5{font-size:24px;line-height:30px;}
h6{font-size:20px;line-height:24px;}        
        
    .button {
  background-color: A52A2A; 
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  border-radius: 12px;
  transition-duration: 0.4s;
   box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
  display: block;
       margin-left: auto;
  margin-right: auto;
    }
  .button:hover {
  background-color: #4CAF50; /* Green */
  color: white;
}  
    
    </Style>
    </HEAD>
    <BODY>
<%

String driverName = "com.mysql.jdbc.Driver";


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
out.print(e);
}

Connection con = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong><h2>Student Information</h2></strong></font></h2>
<div  style="overflow-y:auto;">
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>Student id</b></td>
<td><b>Course</b></td>
<td><b>First Name</b></td>
<td><b>Last Name</b></td>
<td><b>Fathers Name</b></td>
<td><b>Mothers Name</b></td>
<td><b>Mobile No</b></td>
<td><b>Email Address</b></td>
<td><b>Address</b></td>
<td><b>City</b></td>
<td><b>State</b></td>
<td><b>Pin</b></td>
<td><b>DOB</b></td>
<td><b>Gender</b></td>
<td><b>College</b></td>
<td><b>Qualification</b></td>
<td><b>Rollno</b></td>




</tr>
<%
try{ 
    
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
statement=con.createStatement();
String sql ="SELECT * FROM studentinf where fname='Yadwinder'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#DEB887">

<td><%=resultSet.getInt("studen_id") %></td>
<td><%=resultSet.getString("Course") %></td>
<td><%=resultSet.getString("Fname") %></td>
<td><%=resultSet.getString("Lname") %></td>
<td><%=resultSet.getString("Fathname") %></td>
<td><%=resultSet.getString("Mname") %></td>
<td><%=resultSet.getString("Mno") %></td>
<td><%=resultSet.getString("email") %></td>
<td><%=resultSet.getString("address") %></td>
<td><%=resultSet.getString("City") %></td>
<td><%=resultSet.getString("State") %></td>
<td><%=resultSet.getString("Pin") %></td>
<td><%=resultSet.getString("Dob") %></td>
<td><%=resultSet.getString("gend") %></td>
<td><%=resultSet.getString("clg") %></td>
<td><%=resultSet.getString("qual") %></td>
<td><%=resultSet.getString("Rollno") %></td>

</tr>

<% 
}

} catch (Exception e) {
out.print(e);
}
%>

</table>
</DIV>
<br>


    </BODY>
</HTML>