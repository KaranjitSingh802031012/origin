/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(name = "View_data", urlPatterns = {"/View_data"})
public class View_data extends HttpServlet {
                Connection con=null;
                Statement st=null;
                ResultSet rs=null;

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
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
         PrintWriter out=response.getWriter();
         
         
         String First_name=request.getParameter("First_name");
         
            String Gender=request.getParameter("Gender");
            String Job_Description=request.getParameter("Job_Description");
        
         
         
                 try{
                     String str="";
             Class.forName("com.mysql.jdbc.Driver").newInstance();
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/staffinf","root","1234");
               if((!First_name.equals(""))&(Gender.equals(""))&(Job_Description.equals(""))){
               
                 str="Select * from staffinf  where First_name='"+First_name+"'" ;
                 
               }
               else if((First_name.isEmpty())&(!Gender.isEmpty())&(Job_Description.isEmpty())){
                   
                   
                str="Select * from staffinf  where Gender='"+Gender+"'" ;
                   
                 }
               else if((First_name.equals(""))&(Gender.equals(""))&(!Job_Description.equals(""))){
                     str="Select * from staffinf  where Job_Description='"+Job_Description+"'" ;
                    
               }
               else if((!First_name.equals(""))&(!Gender.equals(""))&(Job_Description.equals(""))){
                     str="Select * from staffinf  where First_name='"+First_name+"' and Gender='"+Gender+"'" ;
               }
               else if((First_name.isEmpty())&(!Gender.equals(""))&(!Job_Description.equals(""))){
                    str="Select * from staffinf  where Gender='"+Gender+"' and Job_Description='"+Job_Description+"'";
               
               }
               else if((!First_name.equals(""))&(Gender.equals(""))&(!Job_Description.equals(""))){
                    str="Select * from staffinf  where First_name='"+First_name+"' and Job_Description='"+Job_Description+"'" ;
               
               }
               else if((!First_name.equals(""))&(!Gender.equals(""))&(!Job_Description.equals(""))){
                   str="Select * from staffinf  where First_name='"+First_name+"' and Job_Description='"+Job_Description+"' and Gender='"+Gender+"'";
               }else
               {
              response.sendRedirect(request.getContextPath() + "/SearchData.jsp");
               }
               
                 st=con.createStatement();
                 rs=st.executeQuery(str);
                 while(rs.next())
                 {      
                     
                     
                 out.print("Name:"+rs.getString(2)+"<br>");   
                    out.print("Last Name: "+rs.getString(3)+"<br>");
                   out.print("Email: "+rs.getString(4)+"<br>");
                    out.print("Password: "+rs.getString(5)+"<br>");
                     out.print("Mobile no: "+rs.getString(6)+"<br>");
                      out.print("Course: "+rs.getString(7)+"<br>");
                      out.print("Gender: "+rs.getString(8)+"<br>");
                      out.print("Profession: "+rs.getString(9)+"<br>");
                      out.print("<br>");
                 
                 
                 }
                 
                 
                 }
                  catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
                  out.print(e);
                  }
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
