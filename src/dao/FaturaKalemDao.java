/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import core.Database;
import entity.FaturaKalem;
import java.sql.*;
            
/**
 *
 * @author muham
 */
public class FaturaKalemDao {
    private Connection connection;
    
    public FaturaKalemDao(){
        this.connection = Database.getInstance();
    }
    
    public static void faturaKalemEkle(FaturaKalem kalem) throws SQLException {
        String query = "INSERT INTO faturakalem (fatura_id, urun_id, miktar, tutar) VALUES (?, ?, ?, ?)";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1, kalem.getFatura_id());
            pstmt.setInt(2, kalem.getUrun_id());
            pstmt.setInt(3, kalem.getMiktar());
            pstmt.setDouble(4, kalem.getTutar());
            pstmt.executeUpdate();
        }
    }
}
