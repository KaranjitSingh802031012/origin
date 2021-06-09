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
@WebServlet(name = "AddStudentrec", urlPatterns = {"/AddStudentrec"})
public class AddStudentrec extends HttpServlet {
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
        String a=request.getParameter("course");
        String b=request.getParameter("fname");
        String c=request.getParameter("lname");
        String d=request.getParameter("fathername");
        String e=request.getParameter("mothername");
        String f=request.getParameter("mobile");
        String g=request.getParameter("email");
        String h=request.getParameter("address");
        String j=request.getParameter("city");
        String k=request.getParameter("state");
         
        String l=request.getParameter("pin");
        String m=request.getParameter("dob");
        String i=request.getParameter("hostel");
        String n=request.getParameter("gender");
        String t=request.getParameter("cname");
        
        
        String o=request.getParameter("qual");
        String p=request.getParameter("installment");
        String y=request.getParameter("rollno");
        
        PrintWriter out =response.getWriter();
        out.print(a);
        out.print(b);
        out.print(c);
        out.print(d);
        out.print(e);
        out.print(f);
        out.print(g);
        out.print(h);
        out.print(j);
        out.print(k);
        out.print(l);
        out.print(m);
        out.print(i);
        out.print(n);
        out.print(t);
        out.print(o);
        out.print(p);
        out.print(y);
        
        
   try{
         Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
        pst=con.prepareStatement("insert into studentinf values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
         pst.setString(1,a);
         pst.setString(2,b);
         pst.setString(3,c);
         pst.setString(4,d);
         pst.setString(5,e);
          pst.setString(6,f);
           pst.setString(7,g);
          pst.setString(8,h);
           pst.setString(9,j);
            pst.setString(10,k);
             pst.setString(11,l);
              pst.setString(12,m);
               pst.setString(13,i);
                pst.setString(14,n);
                pst.setString(15,t);
                pst.setString(16,o);
                pst.setString(17,p);
                pst.setString(18,null);
                pst.setString(19,y);
          int x=pst.executeUpdate();
        if(x>0)
        {
            
            out.print("Data inserted");
            response.sendRedirect(request.getContextPath() + "/StudentRecrecep.jsp");
            
            
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
