/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teacher;

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

/**
 *
 * @author HP
 */
@WebServlet(name = "attendance", urlPatterns = {"/attendance"})
public class attendance extends HttpServlet {

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
        String b=request.getParameter("karan");
        String a=request.getParameter("Gender");
        String u=request.getParameter("Gendera");
        String i=request.getParameter("Genderb");
        String o=request.getParameter("Genderc");
        String p=request.getParameter("Genderd");
        
        String e=request.getParameter("simran");
          String g=request.getParameter("birthday");
        PrintWriter out=response.getWriter();

 Connection con=null;
            PreparedStatement pst;
                
   try{
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
        pst=con.prepareStatement("insert into attendance values(?, ?, ?, ?)");
        
         pst.setString(1,b);
         pst.setString(2,e);
         pst.setString(3,g);
         pst.setString(4,a);
         
        
        
        
        
        
          int x=pst.executeUpdate();
        if(x>0)
        {
            
            out.print("Attendnce marked");
            response.sendRedirect(request.getContextPath() + "/viewattendance.jsp");
        }
        else{
            out.print("Attendnce already marked");
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
    catch(Exception q){}
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
