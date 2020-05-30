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
public class User {
    
    private String usr;
    private String pwd;
    private String uname;
    private boolean isVip;

    public User(String usr, String pwd, String uname, boolean isVip) {
        this.usr = usr;
        this.pwd = pwd;
        this.uname = uname;
        this.isVip = isVip;
    }

    
    
    public String getUsr() {
        return usr;
    }

    public String getPwd() {
        return pwd;
    }

    public String getUname() {
        return uname;
    }
    
    public boolean getIsVip(){
        return isVip;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    
    
    
}
