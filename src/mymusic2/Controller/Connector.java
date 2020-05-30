/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Cuong
 */
public class Connector {
    
    public static Connection getMySQLConnector()throws SQLException, ClassNotFoundException{
        String hostName= "localhost";
        String dbName="mymusic";
        String userName="";  //username database server
        String password="";  //password database server
        
        return getMySQLConection(hostName, dbName, userName, password);
    }
    
    public static Connection getMySQLConection(String hostName, String dbName, String userName, String password) throws SQLException, ClassNotFoundException{
        
        
        String connectionURL= "jdbc:mysql://"+hostName+":3306/"+dbName;
        Connection conn=(Connection) DriverManager.getConnection(connectionURL, userName, password);
        
        return conn;
    }
}

