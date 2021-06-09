<%-- 
    Document   : Registration_Form_Staff
    Created on : 27 Apr, 2020, 8:28:25 PM
    Author     : HP
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <title>Registration Form</title>
        <style>
               body {
  background-image: url('high-angle-photography-of-seashore-1705254.jpg');
}   
form {
    width: 1200px;
    margin: 0 auto;
}

h1,h2,h3,h4,h5,h6
{
     text-shadow: 2px 2px 5px royalblue;
	color:white;
	padding:0 0 9px 0;
	font-weight:bold;
	margin:0;
	padding:0;
	font-family:'passion one';
}label
{
    text-shadow: 2px 2px 5px royalblue;
	color:white;
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
h6{font-size:15px;line-height:24px;}
 input[type=text] {
  width: 18%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
   border: 2px solid red;
  border-radius: 4px;
}
input[type=password] {
  width: 18%;
  padding: 12px 20px;
  margin: 6px 0;
  box-sizing: border-box;
   border: 2px solid red;
  border-radius: 4px;
}

input[type=radio] {
  width: 1%;
  padding: 12px 20px;
  margin: 4px 0;
  box-sizing: border-box;
   border: 2px solid red;
  border-radius: 4px;}
input[type=submit]{
    background-color: A52A2A; 
  border: none;
  color: red;
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


</style>

    



            
        
        
    
    </head>
    <body>
        <%
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
        
        %>
        
        <h1>&nbsp&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Registration Form</h1>
        <br>
        
        <div align="center">
         
        
    
            <form class='form1'  action='./updatestaffinf' method="get">  
               <%
 
    
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/staffinf","root","1234");
    String u=request.getParameter("u");
    int a=Integer.parseInt(u);
    String data="Select *  from staffinf  where staff_id='"+a+"'";
    st=con.createStatement();
    
    rs =st.executeQuery(data);
    while(rs.next()){
        %>
        <INPUT TYPE='hidden' name='staff_id' value='<%= rs.getString("staff_id")%>'/>
                
    <h4>First Name</h4>:<input type='text' name='first_Name' value='<%= rs.getString("First_name")%>'  placeholder="First Name" required>
            <br>
            <h4>Last Name</h4>:<input type='text' name='last_Name' value='<%= rs.getString("Last_Name")%>' placeholder="Last Name" required>
            <br> <h4>Email Address</h4>:<input type='text' name='email_Address'  value='<%= rs.getString("Email_Address")%>' placeholder="Email Address" required>
            <br><h4>Password</h4>:<input type='text' name='password' value='<%= rs.getString("Password")%>' placeholder="Password" required>
            <br><h4>Mobile Number</h4>:<input type='text' name='mobile_no' value='<%= rs.getString("Mobile_no")%>' placeholder='Mobile no' required>
            <br><h4>Course</h4>:<input type='text' name='course' value='<%= rs.getString("Course")%>'  required>
            <br><h4>Gender</h4>:<input type='text' name='gender' value='<%= rs.getString("Gender")%>'  required>
            <br><h4>Job Description</h4>:<input type='text' name='job_description' value='<%= rs.getString("Job_Description")%>' required>
 
   <br>
   <br>
   <%
    }     
   %>
   <input type='submit' value="update">
     
     
            
        </form>
            
        </div>
    </body>
</html>
<%
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
    
    %>