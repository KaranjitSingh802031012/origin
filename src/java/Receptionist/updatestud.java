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
@WebServlet(name = "updatestud", urlPatterns = {"/updatestud"})
public class updatestud extends HttpServlet {

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
       String delete= request.getParameter("stude_id");
         int b=Integer.parseInt(delete);
            ;
    String z=request.getParameter("course");
    String c=request.getParameter("first_Name");
    String d=request.getParameter("last_Name");
     String x=request.getParameter("fath_Name");
      String p=request.getParameter("mname");
       String g=request.getParameter("mobile_no");
    String e=request.getParameter("email_Address");
    String l=request.getParameter("password");
    String f=request.getParameter("city");
    String r=request.getParameter("state");
    String t=request.getParameter("pin");
    String y=request.getParameter("dob");
    String m=request.getParameter("hostel");
    String i=request.getParameter("gender");
    String o=request.getParameter("college");
    String s=request.getParameter("qualification");
    String h=request.getParameter("fee");
    String j=request.getParameter("rollno");

                      
    try{
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
       if(c!=null && d!=null && e!=null && f!=null && g!=null)
    {
        String query="update studentinf set Fname=?,Lname=?,email=?,Course=?,Mno=?,Fathname=?,Mname=?,City=?,State=?,Pin=?,Dob=?,Hos=?,gend=?,clg=?,qual=?,Install=?,Rollno=?,Address=? where studen_id='"+b+"'";
        pmt=con.prepareStatement(query);
        pmt.setString(1,c);
        pmt.setString(2,d);
        pmt.setString(3,e);
        pmt.setString(4,z);
        pmt.setString(5,g);
        pmt.setString(6,x);
        pmt.setString(7,p);
          pmt.setString(8,f);
            pmt.setString(9,r);
              pmt.setString(10,t);
                pmt.setString(11,y);
                  pmt.setString(12,m);
                    pmt.setString(13,i);
                      pmt.setString(14,o);
                        pmt.setString(15,s);
                          pmt.setString(16,h);
                            pmt.setString(17,j);
                              pmt.setString(18,l);
                             
                                  
        pmt.executeUpdate();
        response.sendRedirect("StudentRecrecep.jsp");}}
     catch(ClassNotFoundException cn)
    {
        System.out.println("class not found"+cn);
        
    }
    catch(SQLException sq)
    {
        System.out.println("sql exception:"+sq);
    }
    catch(Exception q){}
        
    
        
        
    
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
