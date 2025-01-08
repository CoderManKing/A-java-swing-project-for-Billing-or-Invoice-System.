/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author muham
 */
public class Musteri {
    private int musteri_id;
    private int user_id;
    private String name;
    private String mail;

    public Musteri() {
    }

    public Musteri(int musteri_id, int user_id, String name, String mail) {
        this.musteri_id = musteri_id;
        this.user_id = user_id;
        this.name = name;
        this.mail = mail;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Musteri{" + "musteri_id=" + musteri_id + ", user_id=" + user_id + ", name=" + name + ", mail=" + mail + '}';
    }
    
}
