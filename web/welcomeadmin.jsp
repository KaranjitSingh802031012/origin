
<HTML>
    <HEAD>
        <TITLE>Staff Information</TITLE>
    
    <STYLE> 
   body {
  background-image: url('aerial-view-of-people-on-beach-4253835.jpg');
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
  font-size: 36px;
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
.button1 {
  background-color: A52A2A; 
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 20px;
  border-radius: 12px;
  transition-duration: 0.4s;
   box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
  
    }
  .button1:hover {
  background-color: #4CAF50; /* Green */
  color: white;
  
} 
.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
 
}
    
    </Style>
    </HEAD>
     <%
        String username=null,sessionID=null;
        if(request.getSession().getAttribute("username")== null){
        response.sendRedirect("Login.jsp");
        }
        else{
        username=request.getSession().getAttribute("username").toString();
        sessionID =request.getSession().getId();
        }
        
       
           
        
        %>
       
        
        <form action="<%= request.getContextPath()%>/logoutcontroller" method="post">
            <INPUT type="hidden" name="action"  value="destroy">
            <INPUT type="submit" value="Logout">  
        </form>
 <h2 align="center"><font><strong><h1>Welcome Admin</h1></strong></font></h2>
<br>
 <br>
 <div>
 <img src="l60Hf.jpg" alt="Smiley face" width="300" height="200" class="center">
 </div>
 
 
<BR>
<BR>
<BR>

<button class="button" onclick="window.location.href='../onlineproj/viewStaffinf.jsp'" type="button">Staff Record</button>
<BR>
<button class="button" onclick="window.location.href='../onlineproj/ViewStudentinf.jsp'" type="button">Student Record</button>
<BR>

    </BODY>
</HTML>