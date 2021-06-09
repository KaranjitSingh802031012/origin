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
<h2 align="center"><font><strong><h2> Attendance Analysis </h2></strong></font></h2>
<div  style="overflow-y:auto;">
<%
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


        

%>
<%
try{ 
    
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
statement=con.createStatement();
String sql ="SELECT * FROM attendance";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>


<%

 if(resultSet.getString("rollno").equals("1")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec=totallec+1;}
 
%>
<%

 if(resultSet.getString("rollno").equals("2")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec1=totallec1+1;}
 
%>
<%

 if(resultSet.getString("rollno").equals("3")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec2=totallec2+1;}
 
%>
<%

 if(resultSet.getString("rollno").equals("4")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec3=totallec3+1;}
 
%>
<%

 if(resultSet.getString("rollno").equals("5")&(resultSet.getString("Attendance").equals("Present")|resultSet.getString("Attendance").equals("Absent"))){
     totallec4=totallec4+1;}
 
%>



<%

 if(resultSet.getString("rollno").equals("1")&resultSet.getString("Attendance").equals("Present")){
     i=i+1;
 
%>


<%
 }
 
 
%>




<%

 if(resultSet.getString("rollno").equals("1")&resultSet.getString("Attendance").equals("Absent")){
     abs1=abs1+1;
 }
%>
<%

 if(resultSet.getString("rollno").equals("2")&resultSet.getString("Attendance").equals("Absent")){
     abs2=abs2+1;
 }
%>
<%

 if(resultSet.getString("rollno").equals("3")&resultSet.getString("Attendance").equals("Absent")){
     abs3=abs3+1;
 }
%>
<%

 if(resultSet.getString("rollno").equals("4")&resultSet.getString("Attendance").equals("Absent")){
     abs4=abs4+1;
 }
%>
<%

 if(resultSet.getString("rollno").equals("5")&resultSet.getString("Attendance").equals("Absent")){
     abs5=abs5+1;
 }
%>













<%

 if(resultSet.getString("rollno").equals("1")&resultSet.getString("Attendance").equals("Absent")){
     i=i;
 
%>


<%
 }
 
 
%>
<%

 if(resultSet.getString("rollno").equals("2")&resultSet.getString("Attendance").equals("Present")){
     m=m+1;
 
%>


<%
 }
 
 
%>
<%
if(resultSet.getString("rollno").equals("2")&resultSet.getString("Attendance").equals("Absent")){
     m=m;
 
%>


<%
 }
 
 
%>
<%

 if(resultSet.getString("rollno").equals("3")&resultSet.getString("Attendance").equals("Present")){
     j=j+1;
 
%>


<%
 }
 
 
%>
<%

 if(resultSet.getString("rollno").equals("3")&resultSet.getString("Attendance").equals("Absent")){
     j=j;
 
%>


<%
 }
 
 
%>
<%

 if(resultSet.getString("rollno").equals("4")&resultSet.getString("Attendance").equals("Present")){
     k=k+1;
 
%>


<%
 }
 
 
%>
<%

 if(resultSet.getString("rollno").equals("4")&resultSet.getString("Attendance").equals("Absent")){
     k=k;
 
%>


<%
 }
 
 
%>
<%

 if(resultSet.getString("rollno").equals("5")&resultSet.getString("Attendance").equals("Present")){
     l=l+1;
 
%>


<%
 }
 
 
%>
<%

 if(resultSet.getString("rollno").equals("5")&resultSet.getString("Attendance").equals("Absent")){
     l=l;
 
%>


<%
 }
 
 
%>


</tr>


<% 
}

} catch (Exception e) {
out.print(e);
}
%>





<table align="center" cellpadding="5" cellspacing="5" border="1">
    <tr bgcolor="#A52A2A">
        <TD>Name</TD>
        
        <TD>Lectures attended</TD>
        <TD>Absents</TD>
        <TD>Attendance Percentage</TD>
    </tr><tr bgcolor="#DEB887">
        <td>Aaryan</TD> 
          <td><%=i%></TD>
           <td><%=abs1%></TD>
               <%
int q=(i*100)/totallec;


%><td><%=q%>%</TD>
</tr>
<tr bgcolor="#DEB887">
<td>Abhinandan</TD>
    <td><%=m%></TD>
            <td><%=abs2%></TD>
    <%
int e=(m*100)/totallec1;



%><td><%=e%>%</TD>
</tr>
  <tr bgcolor="#DEB887">          <td>Karanjit</TD>
    <td><%=j%>
            <td><%=abs3%></TD> <%
int b=(j*100)/totallec2;


%><td><%=b%>%</TD>
  </tr>
  <tr bgcolor="#DEB887">
<h6><td>Upinder  </TD>
    <td><%=k%></TD>
            <td><%=abs4%></TD><%
int r=(k*100)/totallec3;


%><td><%=r%>%</TD>
            </tr>
            <tr bgcolor="#DEB887">
<h6><td>Yadwinder </TD>
    <td><%=l%></TD>
            <td><%=abs5%></TD><%
int z=(l*100)/totallec4;


%><TD><%=z%>%</TD></h6>
</tr>
</DIV>
<BR>
<button class="button" onclick="window.location.href='../onlineproj/attendance.jsp'" type="button">Back</button>
<BR>


    </BODY>
</HTML>