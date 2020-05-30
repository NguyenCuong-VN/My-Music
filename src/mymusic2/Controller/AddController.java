/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Controller;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cuong
 */
public class AddController {
    
    public static boolean addAuthor(String name, String company, String country, String DoB) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        
        String sql= "select * from tbl_author\n"+"where name_of_author=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            if(rs.getString("country").equals(country) 
               && rs.getString("Date_of_Birth").equals(DoB)
               && rs.getString("company").equals(company)){
                    return false;
            }
        }
        else{
            sql="insert into tbl_author(name_of_author, country, Date_of_Birth, company)"+"values(?,?,?,?)";
            ps= conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, country);
            ps.setString(3, DoB);
            ps.setString(4, company);
            
            int tmp= ps.executeUpdate();
            if(tmp != 0){
                return true;
            }
        }
        return false;
    }
    
    public static boolean addSinger(String name, String company, String country, String DoB) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        
        String sql= "select * from tbl_singer\n"+"where name_of_singer=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            if(rs.getString("country").equals(country) 
               && rs.getString("Date_of_Birth").equals(DoB)
               && rs.getString("company").equals(company)){
                    return false;
            }
        }
        else{
            sql="insert into tbl_singer(name_of_singer, country, Date_of_Birth, company)"+"values(?,?,?,?)";
            ps= conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, country);
            ps.setString(3, DoB);
            ps.setString(4, company);
            
            int tmp= ps.executeUpdate();
            if(tmp != 0){
                return true;
            }
        }
        return false;
    }

    public static boolean addCategory(String theLoai) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        
        String sql= "select * from tbl_category\n"+"where name_of_category=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, theLoai);
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            return false;
        }
        else{
            sql="insert into tbl_category(name_of_category)"+"values(?)";
            ps= conn.prepareStatement(sql);
            ps.setString(1, theLoai);
            
            int tmp= ps.executeUpdate();
            if(tmp != 0){
                return true;
            }
        }
        return false;
    }
        
    public static boolean addSong(String name, int IDsinger, int IDauthor, String dayRelease, int IDcategory, String url) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        
        String sql= "select * from tbl_song\n"+"where name_of_song=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){         
            return false;
        }
        else{
            sql="insert into tbl_song(name_of_song, date_release, url)"+"values(?,?,?)";
            ps= conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, dayRelease);
            ps.setString(3, url);
            
            int tmp= ps.executeUpdate();
            if(tmp != 0){ 
                sql= "select * from tbl_song\n"+"where name_of_song=?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, name);
        
                rs=ps.executeQuery();
                if(rs.next()){
                    sql="insert into tbl_sing_this_song(IDsinger, IDsong)"+"values(?,?)";
                    ps= conn.prepareStatement(sql);
                    ps.setInt(1, IDsinger);
                    ps.setInt(2, rs.getInt("IDsong"));

                    int tmp2= ps.executeUpdate();

                    if(tmp2 != 0){

                        sql="insert into tbl_create_this_song(IDauthor, IDsong)"+"values(?,?)";
                        ps= conn.prepareStatement(sql);
                        ps.setInt(1, IDauthor);
                        ps.setInt(2, rs.getInt("IDsong"));

                        int tmp3= ps.executeUpdate();
                        if(tmp3 != 0){

                            sql="insert into tbl_kind_this_song(IDcategory, IDsong)"+"values(?,?)";
                            ps= conn.prepareStatement(sql);
                            ps.setInt(1, IDcategory);
                            ps.setInt(2, rs.getInt("IDsong"));

                            int tmp4= ps.executeUpdate();
                            if(tmp4 != 0) return true;
                        }
                    }
                }
                
            }
        }
        return false;
    }
    
    //class này chứa các method khi ấn button new 
    public static boolean addMylist(String namelist, String usr) throws SQLException, ClassNotFoundException{
        Connection conn= Connector.getMySQLConnector();
        
        String sql="select * from tbl_mylist\n"+"where usr=? AND name_of_list=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, usr);
        ps.setString(2, namelist);
        
        ResultSet rs= ps.executeQuery();
        if(rs.next()){
            return false;
        }
        else{
            sql="insert into tbl_mylist(usr, name_of_list)"+"values(?,?)";
            ps= conn.prepareStatement(sql);
            ps.setString(1, usr);
            ps.setString(2, namelist);
            
            int tmp= ps.executeUpdate();
            if(tmp != 0){
                return true;
            }
        }
        return false;
    }
}
