/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
@WebServlet(name = "Addrecordstaff", urlPatterns = {"/Addrecordstaff"})
public class Addrecordstaff extends HttpServlet {
      Connection con=null;
            PreparedStatement pst;

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
             PrintWriter out=response.getWriter();
             String First_name=request.getParameter("first_Name");
             String Last_name=request.getParameter("last_Name");
             String Email_Address=request.getParameter("email_Address");
             String Password=request.getParameter("password");
             String Mobile_No=request.getParameter("mobile_no");
             String Gender=request.getParameter("Gender");
             String Job_Description=request.getParameter("Job_Description");
             String[] Course=request.getParameterValues("Course");
            
                
             
         try{
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/staffinf","root","1234");
        pst=con.prepareStatement("insert into staffinf values (?, ?, ?, ?, ?, ?, ?,?,?)");
         pst.setString(1,null);
         pst.setString(2,First_name);
         pst.setString(3,Last_name);
         pst.setString(4,Email_Address);
         pst.setString(5,Password);
         pst.setString(6,Mobile_No);
         if(Course!=null){
                 for(int i=0;i<Course.length;i++){
                  pst.setString(7,Course[i]);
             }}
             else{
                 pst.setString(7,"None");
             }
      
          pst.setString(8,Gender);
          pst.setString(9,Job_Description);
          int x=pst.executeUpdate();
        if(x>0)
        {
            
            out.print("Data inserted");
            response.sendRedirect(request.getContextPath() + "/viewStaffinf.jsp");
            
            
        }
        else
        {
            out.println("not inserted");
        }

    }
    catch(ClassNotFoundException cn)
    {
        System.out.println("class not found"+cn);
        
    }
    catch(SQLException sq)
    {
        System.out.println("sql exception:"+sq);
    }
    finally
    {
    try{    con.close();
       
    }
    catch(Exception e){}
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
