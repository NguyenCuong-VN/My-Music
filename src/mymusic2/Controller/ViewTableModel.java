/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Controller;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import mymusic2.Model.User;


/**
 *
 * @author Cuong
 */
public class ViewTableModel {

    public static void allSongTableModel(DefaultTableModel model) throws SQLException, ClassNotFoundException{
        
        model.setColumnIdentifiers(new Object[]{
            "Tên bài hát", "Ca sĩ"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select tbl_song.name_of_song, tbl_singer.name_of_singer from tbl_song, tbl_singer, tbl_sing_this_song\n" +
                    "where tbl_sing_this_song.IDsinger=tbl_singer.IDsinger and tbl_sing_this_song.IDsong=tbl_song.IDsong\n"+
                    "group by tbl_song.name_of_song";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("name_of_song"), rs.getString("name_of_singer")
            });
        }        
    }
    
    public static void categoryTableModel(DefaultTableModel model) throws SQLException, ClassNotFoundException{
        model.setColumnIdentifiers(new Object[]{
            "Tên thể loại"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select distinct * from tbl_category\n" +"order by IDcategory asc;";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("name_of_category")
            });
        }
    }
    
    public static void myPlaylistTableModel(DefaultTableModel model, User user) throws SQLException, ClassNotFoundException{
        model.setColumnIdentifiers(new Object[]{
            "Tên list"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select distinct tbl_mylist.name_of_list from tbl_mylist, tbl_user\n" +"where tbl_mylist.usr= "+"\""+user.getUsr()+"\""+"\norder by tbl_mylist.name_of_list asc";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("name_of_list")
            });
        }
    }
    
    public static void singerTableModel(DefaultTableModel model) throws SQLException, ClassNotFoundException{
        model.setColumnIdentifiers(new Object[]{
            "Tên ca sĩ", "company", "country", "Date of Birth"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select distinct * from tbl_singer\n" +"order by tbl_singer.name_of_singer asc";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("name_of_singer"), rs.getString("company"), rs.getString("country"), rs.getString("Date_of_Birth")
            });
        }
    }
    
    public static void authorTableModel(DefaultTableModel model) throws SQLException, ClassNotFoundException{
        model.setColumnIdentifiers(new Object[]{
            "Tên nhạc sĩ", "company", "country", "Date of Birth"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "SELECT * FROM mymusic.tbl_author\n"+"order by name_of_author asc";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("name_of_author"), rs.getString("company"), rs.getString("country"), rs.getString("Date_of_Birth")
            });
        }
    }
    
    public static void userTableModel(DefaultTableModel model) throws SQLException, ClassNotFoundException{
        model.setColumnIdentifiers(new Object[]{
            "Tên user", "Tên đăng nhập", "is Vip"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "SELECT uname, usr, isVip FROM tbl_user\n"+"order by uname asc";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("uname"), rs.getString("usr"), rs.getBoolean("isVip")
            });
        }
    }   

    public static void songCategoryTableModel(DefaultTableModel model, String category) throws SQLException, ClassNotFoundException{
        
        model.setColumnIdentifiers(new Object[]{
            "Tên bài hát", "Ca sĩ"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select IDcategory from tbl_category where name_of_category= \n"+"\""+category+"\"";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        if(rs.next()){
            int id= rs.getInt("IDcategory");
            
            sql="select distinct test.name_of_song , test.name_of_singer from (select distinct tbl_song.IDsong, tbl_song.name_of_song, tbl_singer.name_of_singer from tbl_song, tbl_singer, tbl_sing_this_song where tbl_sing_this_song.IDsinger=tbl_singer.IDsinger and tbl_sing_this_song.IDsong=tbl_song.IDsong group by tbl_song.name_of_song) as test, tbl_kind_this_song\n"
                +"where tbl_kind_this_song.IDcategory= "+id+" and test.IDsong= tbl_kind_this_song.IDsong";
            
            rs= statement.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                rs.getString("name_of_song"), rs.getString("name_of_singer")
                });
            }
        }       
    }
    
    public static void songSingerTableModel(DefaultTableModel model, String singer) throws SQLException, ClassNotFoundException{
        
        model.setColumnIdentifiers(new Object[]{
            "Tên bài hát", "Ca sĩ"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select tbl_song.name_of_song, tbl_singer.name_of_singer from tbl_song, tbl_singer, tbl_sing_this_song\n" +
                    "where tbl_sing_this_song.IDsinger=tbl_singer.IDsinger and tbl_sing_this_song.IDsong=tbl_song.IDsong and tbl_singer.name_of_singer= "+"\""+singer+"\"\n"+
                    "group by tbl_song.name_of_song";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("name_of_song"), rs.getString("name_of_singer")
            });
        }       
    }
    
    public static void songAuthorTableModel(DefaultTableModel model, String author) throws SQLException, ClassNotFoundException{
        
        model.setColumnIdentifiers(new Object[]{
            "Tên bài hát", "Ca sĩ"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select IDauthor from tbl_auhtor where name_of_author= "+"\""+author+"\"";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        if(rs.next()){
            int id= rs.getInt("IDauthor");
            
            sql="select distinct test.name_of_song , test.name_of_singer from (select distinct tbl_song.IDsong, tbl_song.name_of_song, tbl_singer.name_of_singer from tbl_song, tbl_singer, tbl_sing_this_song where tbl_sing_this_song.IDsinger=tbl_singer.IDsinger and tbl_sing_this_song.IDsong=tbl_song.IDsong group by tbl_song.name_of_song) as test, tbl_create_this_song\n"
                +"where tbl_create_this_song.IDauthor= "+id+" and test.IDsong= tbl_create_this_song.IDsong";
            
            rs= statement.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                rs.getString("name_of_song"), rs.getString("name_of_singer")
                });
            }
        }       
    }
    
    public static void songPlaylistTableModel(DefaultTableModel model, String playlist, User user) throws SQLException, ClassNotFoundException{
        
        model.setColumnIdentifiers(new Object[]{
            "Tên bài hát", "Ca sĩ"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select IDlist from tbl_mylist where name_of_list= "+"\""+playlist+"\""+" and usr= "+"\""+user.getUsr()+"\"";
        Statement statement= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        if(rs.next()){
            int id= rs.getInt("IDlist");
            
            sql="select distinct test.name_of_song , test.name_of_singer from (select distinct tbl_song.IDsong, tbl_song.name_of_song, tbl_singer.name_of_singer from tbl_song, tbl_singer, tbl_sing_this_song where tbl_sing_this_song.IDsinger=tbl_singer.IDsinger and tbl_sing_this_song.IDsong=tbl_song.IDsong group by tbl_song.name_of_song) as test, tbl_mylist_this_song\n"
                +"where tbl_mylist_this_song.IDlist= "+id+" and test.IDsong= tbl_mylist_this_song.IDsong";
            
            rs= statement.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                rs.getString("name_of_song"), rs.getString("name_of_singer")
                });
            }
        }       
    }
    
}
