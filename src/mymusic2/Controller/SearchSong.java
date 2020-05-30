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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Cuong
 */
public class SearchSong {
    public static void searchSong(DefaultTableModel model ,String nameSong) throws SQLException, ClassNotFoundException{
        model.setColumnIdentifiers(new Object[]{
            "Tên bài hát", "Ca sĩ"
        });
        
        Connection conn= Connector.getMySQLConnector();
        String sql= "select * from (select tbl_song.name_of_song, tbl_singer.name_of_singer from tbl_song, tbl_singer, tbl_sing_this_song \n"+
                    "where tbl_sing_this_song.IDsinger=tbl_singer.IDsinger and tbl_sing_this_song.IDsong=tbl_song.IDsong \n"+
                    "group by tbl_song.name_of_song) as all_song \n"+
                    "where all_song.name_of_song like '"+nameSong+"%'";
        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        
        ResultSet rs= statement.executeQuery(sql);        
        while(rs.next()){
            model.addRow(new Object[]{
            rs.getString("name_of_song"), rs.getString("name_of_singer")
            });
        }  
    }
}
