/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymusic2.Model;

/**
 *
 * @author Cuong
 */
public class Song {
    private int IDsong;
    private String name;
    private String dateRelease;

    public Song(int IDsong, String name, String dateRelease) {
        this.IDsong = IDsong;
        this.name = name;
        this.dateRelease = dateRelease;
    }

    public int getIDsong() {
        return IDsong;
    }

    public String getName() {
        return name;
    }

    public String getDateRelease() {
        return dateRelease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateRelease(String dateRelease) {
        this.dateRelease = dateRelease;
    }
}
