/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author muham
 */
public class Urun {
    private int urun_id;
    private int user_id;
    private String urun_name;
    private double fiyat;

    public Urun() {
    }

    public Urun(int urun_id, int user_id, String urun_name, double fiyat) {
        this.urun_id = urun_id;
        this.user_id = user_id;
        this.urun_name = urun_name;
        this.fiyat = fiyat;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUrun_id() {
        return urun_id;
    }

    public void setUrun_id(int urun_id) {
        this.urun_id = urun_id;
    }

    public String getUrun_name() {
        return urun_name;
    }

    public void setUrun_name(String urun_name) {
        this.urun_name = urun_name;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Urun{" + "urun_id=" + urun_id + ", user_id=" + user_id + ", urun_name=" + urun_name + ", fiyat=" + fiyat + '}';
    }
    
}
