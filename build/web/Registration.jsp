<%-- 
    Document   : Registration
    Created on : Apr 27, 2020, 7:44:18 PM
    Author     : yadwinder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <link rel="stylesheet" type="text/css" href="style1.css">
   
    </head>
    <body>
         <div class="regbox"> 
           <h1>Registration Form(Student)</h1>
               
           <form class="form1" action="./AddStudentrec" method="post">
                <div class="c"> 
                <p>Course Name</p>
                <select class="course" name="course">
                        <option >Select course</option>
                        <option>Java </option>
                         <option>Artificial Intelligence</option>
                          <option>Cyber Security</option>
                           <option>Python</option>
                           
                        
                    </select> 
                </div>
                <div class="fname">
                <p>First Name</p>
                <input type="text" class="first" name="fname"placeholder="Enter first name here"  >
                </div>
                <div class="lname">
                 <p>Last Name</p>
                 <input type="text" class="last" name="lname" placeholder="Enter last name here" ><br><br>
                 </div>
                     <div class="faname">
                <p>Father's Name</p>
                <input type="text" class="father" name="fathername"placeholder="Enter father's name here" >
                     </div>
                     <div class="moname">
                 <p>Mother's Name</p>
                 <input type="text" class="mother" name="mothername"placeholder="Enter mother's name here" ><br><br>
                     </div>
                     <div class="mobile">
                  <p>Mobile</p>
                  <input type="text" class="mob" name="mobile" placeholder="Enter mobille number here" >
                     </div>
                     <div class="email">
                 <p>Email</p>
                 <input type="text"  class="mail" name="email"placeholder="Enter email here" ><br><br>
                     </div>
                   <div class="address">
                  <p>Correspondence Address</p>
                  <input type="text" style="height:100px;width: 600px"    name="address">
                   </div>
                     <div class="city">
                 <p>City</p>
                 <input type="text" name="city"  class="ci" placeholder="Enter city name here" >
                     </div>
                     <div class="state">
                 <p>State</p>
                 <input type="text" name="state" class="st" placeholder="Enter State name here" >                 
                     </div>
                     <div class="pin">
                 <p>Pin</p>
                 <input type="text" name="pin" class="p" placeholder="Enter pincode here" >
                     </div>
                     <div class="dob">
                  <p>Date of Birth</p>
                  <input type="text" name="dob" class="d" placeholder="DD/MM/YYYY" >
                     </div>
                     <div class="hostel">
                    <p>Hostel Alloted</p>
                    <select class="hr" name="hostel">
                        <option >click here to select</option>
                        <option>YES</option>
                         <option>NO</option>
                        
                    </select>  
                     </div>
                     <div class="gender">
                    
                     <p>Gender</p>
                    <select class="g" name="gender">
                        <option >click here to select</option>
                        <option>Male</option>
                         <option>Female</option>
                        
                    </select> 
                     </div>
                     <div class="clg">
                       <p>College Name</p>
                  <input type="text" class="college" name="cname" placeholder="Enter college name here" >
                     </div>
                     <div class="qual">
                                      
                     <p>Qualification</p>
                     <select class="qualification" name="qual">
                        <option >click here to select</option>
                        <option>B.Tech</option>
                         <option>M.C.A</option>
                          <option>B.C.A</option>
                           <option>Diploma</option>
                            <option>Other</option>
                        
                    </select> 
                         <div class="gender">
                    
                     <p>Second Installment Paid</p>
                    <select class="g" name="installment">
                        <option >click here to select</option>
                        <option>Yes</option>
                         <option>No</option>
                        
                    </select> 
                              
                     </div>
                      <div class="clg">
                       <p>Roll No</p>
                  <input type="text" class="college" name="rollno" placeholder="Enter Roll no" >
                     </div>
                     <div class="submit">
                      <input type="submit" value="Submit">
                     </div>
            </form>
</div>
    </body>
</html>
