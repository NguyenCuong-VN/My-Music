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

//class này sử dụng khi ấn button Add
public class AddPlaylist {
    public static boolean add(String nameSong, String nameList, User user) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "select IDsong from tbl_song where name_of_song= "+"\""+nameSong+"\"";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);   
        if(rs.next()){
            int idSong= rs.getInt("IDsong");
            sql="select IDlist from tbl_mylist where name_of_list= "+"\""+nameList+"\""+" and usr= "+"\""+user.getUsr()+"\"";
            rs= statement.executeQuery(sql); 
            if(rs.next()){
                int idList= rs.getInt("IDlist");
                 sql="insert into tbl_mylist_this_song(IDlist, IDsong) values("+idList+","+idSong+")";
                 int check= statement.executeUpdate(sql);
                 if(check != 0) return true;
            }  
        }
        return false;
    }
}
