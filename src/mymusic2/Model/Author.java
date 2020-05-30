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
public class Author {
    private int ID;
    private String name;
    private String country;
    private String DoB;
    private String company;

   

    public Author(int ID, String name, String country, String DoB, String company) {
        this.ID = ID;
        this.name = name;
        this.country = country;
        this.DoB = DoB;
        this.company = company;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getDoB() {
        return DoB;
    }

    public String getCompany() {
        return company;
    }

   

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
