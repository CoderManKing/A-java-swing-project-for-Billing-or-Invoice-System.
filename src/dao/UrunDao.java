/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import core.Database;
import entity.Urun;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author muham
 */
public class UrunDao {
    private Connection connection;
    
    public UrunDao(){
        this.connection = Database.getInstance();
    }
    
    public static List<Urun> urunListele(int user_id) throws SQLException {
        List<Urun> urunListesi = new ArrayList<>();
        String query = "SELECT * FROM urun WHERE user_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, user_id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("urun_id");
                String urun_name = rs.getString("urun_name");
                double fiyat = rs.getDouble("fiyat");
                urunListesi.add(new Urun(id, user_id, urun_name,fiyat));
            }
        }
        return urunListesi;
    }
    
    //düzenlendi    
    public static void urunEkle(Urun urun) throws SQLException {
        String query = "INSERT INTO urun (urun_name, fiyat, user_id) VALUES (?, ?, ?)";
        try(Connection conn = Database.getInstance();           //
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1, urun.getUrun_name()); 
            pstmt.setDouble(2, urun.getFiyat()); 
            pstmt.setInt(3, urun.getUser_id());//
            pstmt.executeUpdate();
        }
    }
    
    public static void urunGuncelle(Urun urun)throws SQLException {
        String query = "UPDATE urun SET urun_name = ?, fiyat = ? WHERE urun_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1, urun.getUrun_name()); 
            pstmt.setDouble(2, urun.getFiyat());
            pstmt.setInt(3, urun.getUrun_id());
            pstmt.executeUpdate();
        }
    }
    
    public static void urunSil(int id, int user_id) throws SQLException {
        String query = "DELETE FROM urun WHERE urun_id = ? AND user_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, id);
            pstmt.setInt(2, user_id);
            pstmt.executeUpdate();
        }
    }
    
    public static Urun urunGetir(int id)throws SQLException {
        String query = "SELECT * FROM urun WHERE urun_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return new Urun(rs.getInt("urun_id"), rs.getInt("user_id"), rs.getString("urun_name"), rs.getDouble("fiyat"));
            }
        }
        return null;
    }
}
