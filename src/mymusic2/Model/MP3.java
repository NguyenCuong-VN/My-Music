/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Model;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
/**
 *
 * @author ----LaiNhuTung----
 */
public class MP3 {
    private Player player;
    private String filename;
   
    public MP3(String filename) {
        this.filename = filename;
    }

    public MP3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
   
    public void stop() {
        if (player != null)
            player.close();
    }
   
    public void play() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));
            player = new Player(bis);
        } catch (Exception ex) {
            System.out.println(ex);
        }
       
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    player.play();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }).start();
    }
}
