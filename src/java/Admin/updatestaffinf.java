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

/**
 *
 * @author HP
 */
@WebServlet(name = "updatestaffinf", urlPatterns = {"/updatestaffinf"})
public class updatestaffinf extends HttpServlet {

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
    PreparedStatement pmt;
     PrintWriter out=response.getWriter();
         String delete= request.getParameter("staff_id");
         int a=Integer.parseInt(delete);
        
        
    
    String c=request.getParameter("first_Name");
    String d=request.getParameter("last_Name");
    String e=request.getParameter("email_Address");
    String f=request.getParameter("password");
    String g=request.getParameter("mobile_no");
    String h=request.getParameter("course");
    String i=request.getParameter("gender");
    String j=request.getParameter("job_description");
    
    
     try{
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/staffinf","root","1234");
         if(c!=null && d!=null && e!=null && f!=null && g!=null && h!=null && i!=null && j!=null)
    {
        String query="update staffinf set First_name=?, Last_Name=?, Email_Address=?,Password=?,Mobile_no=?,Course=?,Gender=?,Job_Description=? where staff_id='"+a+"'";
        pmt=con.prepareStatement(query);
        pmt.setString(1,c);
        pmt.setString(2,d);
        pmt.setString(3,e);
        pmt.setString(4,f);
        pmt.setString(5,g);
        pmt.setString(6,h);
        pmt.setString(7,i);
        pmt.setString(8,j);
        
        pmt.executeUpdate();
        response.sendRedirect("viewStaffinf.jsp");}}
     catch(ClassNotFoundException cn)
    {
        System.out.println("class not found"+cn);
        
    }
    catch(SQLException sq)
    {
        System.out.println("sql exception:"+sq);
    }
    catch(Exception r){}
        
     
        
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
