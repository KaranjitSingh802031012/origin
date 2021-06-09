/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "Searchstuddata", urlPatterns = {"/Searchstuddata"})
public class Searchstuddata extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Connection con=null;
                Statement st=null;
                ResultSet rs=null;
                 PrintWriter out=response.getWriter();
         
         
         String First_name=request.getParameter("First_name");
         
            String Gender=request.getParameter("Gender");
            String Job_Description=request.getParameter("Job_Description");
        
         
         
                 try{
                     String str="";
             Class.forName("com.mysql.jdbc.Driver").newInstance();
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
               if((!First_name.equals(""))&(Gender.equals(""))&(Job_Description.equals(""))){
               
                 str="Select * from studentinf  where Fname='"+First_name+"'" ;
                 
               }
               else if((First_name.isEmpty())&(!Gender.isEmpty())&(Job_Description.isEmpty())){
                   
                   
                str="Select * from studentinf  where gend='"+Gender+"'" ;
                   
                 }
               else if((First_name.equals(""))&(Gender.equals(""))&(!Job_Description.equals(""))){
                     str="Select * from studentinf  where Course='"+Job_Description+"'" ;
                    
               }
               else if((!First_name.equals(""))&(!Gender.equals(""))&(Job_Description.equals(""))){
                     str="Select * from studentinf  where Fname='"+First_name+"' and gend='"+Gender+"'" ;
               }
               else if((First_name.isEmpty())&(!Gender.equals(""))&(!Job_Description.equals(""))){
                    str="Select * from studentinf  where gend='"+Gender+"' and Course='"+Job_Description+"'";
               
               }
               else if((!First_name.equals(""))&(Gender.equals(""))&(!Job_Description.equals(""))){
                    str="Select * from studentinf  where Fname='"+First_name+"' and Course='"+Job_Description+"'" ;
               
               }
               else if((!First_name.equals(""))&(!Gender.equals(""))&(!Job_Description.equals(""))){
                   str="Select * from studentinf  where Fname='"+First_name+"' and Course='"+Job_Description+"' and gend='"+Gender+"'";
               }else
               {
              response.sendRedirect(request.getContextPath() + "/SearchStudentData.jsp");
               }
         
                 st=con.createStatement();
                 rs=st.executeQuery(str);
                 while(rs.next())
                 {      
                     out.print("Course: "+rs.getString(1)+"<br>");
                 out.print("Fist name: "+rs.getString(2)+"<br>");   
                  out.print("Last Name: "+rs.getString(3)+"<br>");
                   out.print("Father's Name: "+rs.getString(4)+"<br>");
                    out.print("Mother's Name "+rs.getString(5)+"<br>");
                     out.print("Mobile Name: "+rs.getString(6)+"<br>");
                      out.print("Email: "+rs.getString(7)+"<br>");
                      out.print("Address: "+rs.getString(8)+"<br>");
                      out.print("City: "+rs.getString(9)+"<br>");
                      out.print("State: "+rs.getString(10)+"<br>");
                      out.print("Pincode: "+rs.getString(11)+"<br>");
                      out.print("DOB:"+rs.getString(12)+"<br>");
                     
                      out.print("Gender: "+rs.getString(14)+"<br>");
                      out.print("College: "+rs.getString(15)+"<br>");
                      out.print("Degree: "+rs.getString(16)+"<br>");
                      out.print("<br>");
                      
                 
                 
                 }
                 
                 
                 }
                  catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
                  out.print(e);
                  }
                
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
