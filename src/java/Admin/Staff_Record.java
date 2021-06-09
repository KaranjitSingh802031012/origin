/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author HP
 */
public class Staff_Record {
    private String first_Name="";
    private String last_Name="";
    private String email_Address="";
    private String password="";
    private String mobile_no="";
    
   
    

    public String getFirst_Name() {
        return first_Name;
    } 

    public void setFirst_Name(String First_Name) {
        this.first_Name = First_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.last_Name = Last_Name;
    }

    public String getEmail_Address() {
        return email_Address;
    }

    public void setEmail_Address(String Email_Address) {
        this.email_Address = Email_Address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String Mobile_no) {
        this.mobile_no = Mobile_no;
    }
    
    
    
}
