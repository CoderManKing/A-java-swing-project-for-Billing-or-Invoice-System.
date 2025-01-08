/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import core.Database;
import entity.Musteri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author muham
 */
public class MusteriDao {
    private Connection connection;

    public MusteriDao() {
        this.connection = Database.getInstance();
    }
    //tamamlandı                                    //
    public static List<Musteri> musteriListele(int user_id) throws SQLException {
        List<Musteri> musteriListesi = new ArrayList<>();
        String query = "SELECT * FROM musteri WHERE user_id = ?";
        try(Connection conn = Database.getInstance();   // ////
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, user_id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("musteri_id");
                String name = rs.getString("name");
                String mail = rs.getString("mail");
                musteriListesi.add(new Musteri(id, user_id, name, mail));
            }
        }
        return musteriListesi;
    }
    
    public static void musteriSil(int musteri_id, int user_id) throws SQLException {
        String query = "DELETE FROM musteri WHERE musteri_id = ? AND user_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, musteri_id);
            pstmt.setInt(2,user_id);
            pstmt.executeUpdate();
        }
    }
    
    public static void musteriGuncelle(Musteri musteri) throws SQLException {
        String query = "UPDATE musteri SET isim = ?, mail = ? WHERE musteri_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1,musteri.getName());
            pstmt.setString(2, musteri.getMail());
            pstmt.setInt(3, musteri.getMusteri_id());
            pstmt.executeUpdate();
        }
    }
    //düzenlendi
    public static void musteriEkle(Musteri musteri) throws SQLException{
                                                            //                  //
        String query = "INSERT INTO musteri (name, mail, user_id) VALUES (?, ?, ?)"; 
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1, musteri.getName());
            pstmt.setString(2, musteri.getMail());
            pstmt.setInt(3, musteri.getUser_id());//
            pstmt.executeUpdate();
        }
    }
    //düzenlendi
    public static Musteri musteriGetir(int id) throws SQLException {
        String query = "SELECT * FROM musteri WHERE musteri_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return new Musteri(rs.getInt("musteri_id"), rs.getInt("user_id"), rs.getString("name"), rs.getString("mail"));
            }                                                                                       ///
        }
        return null;
    }
}
