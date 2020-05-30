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

/**
 *
 * @author Cuong
 */
public class Url {
    public static String getUrl(String nameSong) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        
        String sql= "select url from tbl_song\n"+"where name_of_song=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nameSong);
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            return rs.getString("url");
        }
        else return null;
    }
}
