/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import core.Database;
import entity.Fatura;
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
public class FaturaDao {
    private Connection connection;
    
    public FaturaDao(){
        this.connection = Database.getInstance();
    }
    
    public static List<Fatura> faturaListele(int user_id) throws SQLException {
        List<Fatura> faturaListesi = new ArrayList<>();
        String query = "SELECT * FROM fatura WHERE user_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, user_id);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int fatura_id = rs.getInt("fatura_id");
                int musteri_id = rs.getInt("musteri_id");
                double fiyat = rs.getDouble("toplam_tutar");
                faturaListesi.add(new Fatura(fatura_id, musteri_id, user_id, fiyat));
            }
        }
        return faturaListesi;
    }
    
    public static void faturaEkle(Fatura fatura) throws SQLException {
        String query = "INSERT INTO fatura (musteri_id, user_id, toplam_tutar) VALUES (?, ?, ?)";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, fatura.getMusteri_id());
            pstmt.setInt(2, fatura.getUser_id());
            pstmt.setDouble(3, fatura.getToplam_tutar());
            pstmt.executeUpdate();
        }
    }
    
    public static void faturaGuncelle(Fatura fatura) throws SQLException {
        String query = "UPDATE fatura SET musteri_id = ?, user_id = ?, toplam_tutar = ? WHERE fatura_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, fatura.getMusteri_id());
            pstmt.setInt(2, fatura.getUser_id());
            pstmt.setDouble(3, fatura.getToplam_tutar());
            pstmt.setInt(4, fatura.getFatura_id());
            pstmt.executeUpdate();
        }
    }
    
    public static void faturaSil(int id, int user_id) throws SQLException {
        String query = "DELETE FROM fatura WHERE fatura_id = ? AND user_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, id);
            pstmt.setInt(2, user_id);
            pstmt.executeUpdate();
        }
    }
    
    public static Fatura faturaGetir(int id) throws SQLException {
        String query = "SELECT * FROM fatura WHERE fatura_id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                Fatura fatura = new Fatura(rs.getInt("fatura_id"), rs.getInt("musteri_id"), rs.getInt("user_id"), rs.getDouble("toplam_tutar"));
                return fatura;
            }
        }
        return null;
    }
    
}
