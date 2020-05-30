/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mymusic2.Model.*;

/**
 *
 * @author Cuong
 */
public class LoginController {
    
    public static User checkLogin(String usr, String password) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "select * from tbl_user\n"+"where usr=? and pwd=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usr);
        ps.setString(2, password);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            String user= rs.getString("usr");
            String pass= rs.getString("pwd");
            String uname= rs.getString("uname");
            boolean isVip= rs.getBoolean("isVip");
            
            User tmp= new User(user, pass, uname, isVip);
            return tmp;
        }
        else return null;
    }
    
    public static boolean checkRegister(String uname, String usr, String pwd) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        
        String sql= "select * from tbl_user\n"+"where usr=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usr);
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            return false;      
        }
        else{
            sql="insert into tbl_user(usr, pwd, uname)"+"values(?,?,?)";
            ps= conn.prepareStatement(sql);
            ps.setString(1, usr);
            ps.setString(2, pwd);
            ps.setString(3, uname);
            int tmp= ps.executeUpdate();
            return true;
        }
    }
    
   
}
