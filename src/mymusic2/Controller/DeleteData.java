/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import mymusic2.Model.User;
/**
 *
 * @author Cuong
 */
public class DeleteData {
    public static boolean deleteSongInMyList(String tenBaiHat) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "select IDsong from tbl_song\n"+"where name_of_song="+"\""+tenBaiHat+"\"";
        
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs= statement.executeQuery(sql);
        
        int id;
        if(rs.next()){
            id= rs.getInt("IDsong");
            sql="delete from tbl_mylist_this_song\n"+"where IDsong="+id;
            
            int tmp= statement.executeUpdate(sql);
            if(tmp != 0) return true;
        }
        
        return false;
    }
    
    public static boolean deleteSong(String tenBaiHat) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "select IDsong from tbl_song\n"+"where name_of_song="+"\""+tenBaiHat+"\"";
        
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs= statement.executeQuery(sql);
        
        int id;
        if(rs.next()){
            id= rs.getInt("IDsong");
            sql="delete from tbl_song\n"+"where IDsong="+id;
            
            int tmp= statement.executeUpdate(sql);
            if(tmp != 0) return true;
        }
        
        return false;
    }
    
    public static boolean deleteCategory(String category) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "delete from tbl_category\n"+"where name_of_category= "+"\""+category+"\"";
        
        Statement statement= conn.createStatement();
        int tmp= statement.executeUpdate(sql);
        if(tmp != 0) return true;
        
        return false;
    }
    
    public static boolean deleteMyPlaylist(String namePlaylist, User user) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "delete from tbl_mylist\n"+"where name_of_list= "+"\""+namePlaylist+"\""+" and usr= "+"\""+user.getUsr()+"\"";
        
        Statement statement= conn.createStatement();
        int tmp= statement.executeUpdate(sql);
        if(tmp != 0) return true;
        
        return false;
    }
    
    public static boolean deleteSinger(String nameSinger, String DoB) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "delete from tbl_singer\n"+"where name_of_singer= "+"\""+nameSinger+"\""+" and Date_of_Birth= "+"\""+DoB+"\"";
        
        Statement statement= conn.createStatement();
        int tmp= statement.executeUpdate(sql);
        if(tmp != 0) return true;
        
        return false;
    }
    
    public static boolean deleteAuthor(String nameAuthor, String DoB) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "delete from tbl_author\n"+"where name_of_author= "+"\""+nameAuthor+"\""+" and Date_of_Birth= "+"\""+DoB+"\"";
        
        Statement statement= conn.createStatement();
        int tmp= statement.executeUpdate(sql);
        if(tmp != 0) return true;
        
        return false;
    }
    
    public static boolean deleteUser(String nameUser) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        String sql= "delete from tbl_user\n"+"where usr= "+"\""+nameUser+"\"";
        
        Statement statement= conn.createStatement();
        int tmp= statement.executeUpdate(sql);
        if(tmp != 0) return true;
        
        return false;
    }
    
}
