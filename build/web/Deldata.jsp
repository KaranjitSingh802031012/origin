<%-- 
    Document   : Deldata
    Created on : 28 Apr, 2020, 2:06:24 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         
                 <style>
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
h6{font-size:15px;line-height:24px;}
 input[type=text] {
  width: 18%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
   border: 2px solid red;
  border-radius: 4px;
}
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
        <h1>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspDeleting record from Student Information</h1>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <div align='center'>
         <form action='./delstuddata'>
             <h1> Enter the Id</h1><br><br><input type='text' name='delete'>
             <br>
             <br>
             <br>
              <input type="submit" value='Delete'>
        
    </form>
        </div>
    </body>
</html>
