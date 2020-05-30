/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mymusic2.Model.User;

/**
 *
 * @author Cuong
 */
public class UserController {
    public static boolean changePassword(User user, String oldPass, String newPass) throws SQLException, ClassNotFoundException{
        if(checkPassword(user, oldPass)){
            Connection conn= Connector.getMySQLConnector();
            String sql= "update tbl_user set pwd= "+"\""+newPass+"\""+" where usr= "+"\""+user.getUsr()+"\""+" and pwd= "+"\""+oldPass+"\"";
            Statement statement= conn.createStatement();

            int check= statement.executeUpdate(sql);
            if(check != 0) return true;
        }
        return false;
    }
    
    public static boolean checkPassword(User user, String pass) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "select * from tbl_user where usr= "+"\""+user.getUsr()+"\""+" and pwd= "+"\""+pass+"\"";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql); 
        if(rs.next()) return true;
        else return false;
    }
}
