<%-- 
    Document   : Registration_Form_Staff
    Created on : 27 Apr, 2020, 8:28:25 PM
    Author     : HP
--%>

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
        <h1>&nbsp&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Registration Form</h1>
        <br>
        
        <div align="center">
            <jsp:useBean id='user' class='Admin.Staff_Record' scope="application"></jsp:useBean>
            <form class='form1' action='./Addrecordstaff' method="get">  
    <h4>First Name</h4>:<input type='text' name='first_Name' value='<jsp:getProperty property="first_Name" name="user"/>'  placeholder="First Name" required>
            <br>
            <h4>Last Name</h4>:<input type='text' name='last_Name' value='<jsp:getProperty property="last_Name" name="user"/>' placeholder="Last Name" required>
            <br> <h4>Email Address</h4>:<input type='text' name='email_Address'  value='<jsp:getProperty property="email_Address" name="user"/>' placeholder="Email Address" required>
            <br><h4>Password</h4>:<input type='text' name='password' value='<jsp:getProperty property="password" name="user"/>' placeholder="Password" required>
            <br><h4>Mobile Number</h4>:<input type='text' name='mobile_no' value='<jsp:getProperty property="mobile_no" name="user"/>' placeholder='Mobile no' required>
            <br>
     <h4>Course</h4>
     <ul>
     <li>
         <label for="vehicle1">Python</label><input type="checkbox" id="vehicle1" name="Course" value="Python">
     
   &nbsp&nbsp&nbsp <label for="vehicle2">Java</label><input type="checkbox" id="vehicle2" name="Course" value="Java">
    &nbsp&nbsp&nbsp<label for="vehicle1">AI</label><input type="checkbox" id="vehicle3" name="Course" value="AI">
    &nbsp&nbsp&nbsp<label for="vehicle1">Cyber Security</label><input type="checkbox" id="vehicle4" name="Course" value="Cyber Security">
    &nbsp&nbsp&nbsp<label for="vehicle1">None</label><input type="checkbox" id="vehicle5" name="Course" value="None"><br>
     </li>
     </ul>
    
     <h4>Gender</h4>
     <br>
     
     <label for="ef">Male</label><input type="radio" id="ef" name="Gender" value="Male">
    
   &nbsp&nbsp&nbsp <label for="ef">Female</label><input type="radio" id="ef" name="Gender" value="Female">
    
    <br>
    <br>
   <h4>Choose a Profession</h4>
   <br>

    <select id="job" name="Job_Description">
     <option>Choose the profession</option>
  <option value="Teacher">Teacher</option>
  <option value="Recptionist">Receptionist</option>
  <option value="Accountant">Accountant</option>
  
  
</select>
   <br>
   <br>
    <input type="Submit" value="submit">
     
     
            
        </form>
     
        </div>
    </body>
</html>
