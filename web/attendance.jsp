<%-- 
    Document   : attendance
    Created on : 7 May, 2020, 1:39:30 AM
    Author     : HP
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
  display: block
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
<h2 align="center"><font><strong>Attendance Maintainance System</strong></font></h2>
<div  style="overflow-y:auto;">









<%
try{ 
    
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
statement=con.createStatement();
String sql ="SELECT * FROM studentinf where Course='Java'";

resultSet = statement.executeQuery(sql);
%>

  <br>
  <br>
<%
while(resultSet.next()){%>

<form action="./attendance">
   <label for="birthday">Date:</label>
  <input type="date" id="birthday" name="birthday">
    <input type="text" name="karan"   value="<%=resultSet.getString("Fname") %>" >
  <input type="text" name="simran"   value="<%=resultSet.getString("Rollno") %>" >
 <label for="ef">Present</label><input type="radio" id="ef" name="Gender" value="Present">
    
   &nbsp&nbsp&nbsp <label for="ef">Absent</label><input type="radio" id="ef" name="Gender" value="Absent">
  

 <input type="submit" value="submit">
  <br>
</form>    
   
   

<%
}%>


  
 
  
 
  

  
  
<%
} catch (Exception e) {
out.print(e);
}
%>

</DIV>
<BR>
<button class="button" onclick="window.location.href='../onlineproj/attendanceinf.jsp'" type="button">View Detailed Information</button>
<BR>
    </BODY>
</HTML>