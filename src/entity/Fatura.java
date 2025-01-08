/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author muham
 */
public class Fatura {
    private int fatura_id;
    private int musteri_id;
    private int user_id;
    private double toplam_tutar;

    public Fatura() {
    }

    public Fatura(int fatura_id, int musteri_id, int user_id, double toplam_tutar) {
        this.fatura_id = fatura_id;
        this.musteri_id = musteri_id;
        this.user_id = user_id;
        this.toplam_tutar = toplam_tutar;
    }

    public int getFatura_id() {
        return fatura_id;
    }

    public void setFatura_id(int fatura_id) {
        this.fatura_id = fatura_id;
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getToplam_tutar() {
        return toplam_tutar;
    }

    public void setToplam_tutar(double toplam_tutar) {
        this.toplam_tutar = toplam_tutar;
    }

    @Override
    public String toString() {
        return "Fatura{" + "fatura_id=" + fatura_id + ", musteri_id=" + musteri_id + ", user_id=" + user_id + ", toplam_tutar=" + toplam_tutar + '}';
    }
   
    
}
