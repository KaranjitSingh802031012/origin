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
         
        
    
            <form class='form1'  action='./updatestud' method="get">  
               <%
 
    
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
    String u=request.getParameter("u");
    int a=Integer.parseInt(u);
    String data="Select *  from studentinf  where studen_id='"+a+"'";
    st=con.createStatement();
    
    rs =st.executeQuery(data);
    while(rs.next()){
        %>
        <
        
        <INPUT TYPE='hidden' name='stude_id' value='<%= rs.getString("studen_id")%>' >
         <br><h4>Course</h4>:<input type='text' name='course' value='<%= rs.getString("Course")%>'  required>        
         <h4>First Name</h4>:<input type='text' name='first_Name' value='<%= rs.getString("Fname")%>'  placeholder="First Name" required><br>
            
            <h4>Last Name</h4>:<input type='text' name='last_Name' value='<%= rs.getString("Lname")%>' placeholder="Last Name" required>
              <h4>Fathers's Name</h4>:<input type='text' name='fath_Name' value='<%= rs.getString("Fathname")%>' placeholder="Fathers name" required>
                <h4>Mother's Name</h4>:<input type='text' name='mname' value='<%= rs.getString("Mname")%>' placeholder="Mother's Name" required>
            <br><h4>Mobile Number</h4>:<input type='text' name='mobile_no' value='<%= rs.getString("Mno")%>' placeholder='Mobile no' required>
                <br> <h4>Email Address</h4>:<input type='text' name='email_Address'  value='<%= rs.getString("email")%>' placeholder="Email Address" required>
            <br><h4>Address</h4>:<input type='text' name='password' value='<%= rs.getString("Address")%>' placeholder="Password" required>
            <br><h4>City</h4>:<input type='text' name='city' value='<%= rs.getString("City")%>' placeholder='Mobile no' required>
           <br><h4>State</h4>:<input type='text' name='state' value='<%= rs.getString("State")%>' placeholder='Mobile no' required>
           <br><h4>Pin</h4>:<input type='text' name='pin' value='<%= rs.getString("Pin")%>' placeholder='Mobile no' required> 
           <br><h4>Dob</h4>:<input type='text' name='dob' value='<%= rs.getString("Dob")%>' placeholder='Mobile no' required>
           <br><h4>Hostel</h4>:<input type='text' name='hostel' value='<%= rs.getString("Hos")%>' placeholder='Mobile no' required>
           <br><h4>Gender</h4>:<input type='text' name='gender' value='<%= rs.getString("gend")%>'  required>
            <br><h4>College</h4>:<input type='text' name='college' value='<%= rs.getString("clg")%>' required>
            <br><h4>Qualification</h4>:<input type='text' name='qualification' value='<%= rs.getString("qual")%>' required>
            <br><h4>Fees Paid</h4>:<input type='text' name='fee' value='<%= rs.getString("Install")%>' required>
            <br><h4>Rollno</h4>:<input type='text' name='rollno' value='<%= rs.getString("Rollno")%>' required>
            
            
 
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
