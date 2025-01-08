package dao;

import java.sql.Connection;
import core.Database;
import entity.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author muham
 */
public class UserDao {

    private Connection connection;

    public UserDao() {
        this.connection = Database.getInstance();
    }

    public static User findByLogin(String mail, String password) {
        User user = null;
        String sql = "SELECT * FROM user WHERE mail = ? AND password = ?";

        try (Connection conn = Database.getInstance();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, mail);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    user = new User(
                            rs.getInt("id"), // Veritabanından id alanını alıyoruz
                            rs.getString("name"),
                            rs.getString("mail"),
                            rs.getString("password"),
                            rs.getString("company_name"),
                            rs.getString("city"),
                            rs.getInt("company_no"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kullanıcı bulunamadı", "Login Hata", JOptionPane.ERROR_MESSAGE);
        }

        return user; // Kullanıcı bulunmazsa null döner
    }

    // Kullanıcı kayıt işlemi için register metodu
    public static boolean register(String name, String mail, String password, String company_name, String city, int company_no) {
        Connection connection = Database.getInstance();
        String query = "INSERT INTO user (name, mail, password, company_name, city, company_no) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, mail);
            stmt.setString(3, password);
            stmt.setString(4, company_name);
            stmt.setString(5, city);
            stmt.setInt(6, company_no);
            stmt.executeUpdate();
            JOptionPane.showInternalMessageDialog(null, "Başarıyla kaydedildi!\n Giriş Yapılıyor...", "Başarılı!", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            return false; // Hata durumunda false döner
        }
        return true;
    }
    
    public User getUserById(int user_id){
        User user = null;
        String query = "SELECT * FROM user WHERE id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setInt(1,user_id);
            try(ResultSet rs = pstmt.executeQuery()){
                if(rs.next()){
                    user = new User(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("mail"),
                    rs.getString("password"),
                    rs.getString("company_name"),
                    rs.getString("city"),
                    rs.getInt("company_no")
                    );
                }
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return user;
    }
    
    public static void userSifreGuncelle(int user_id, String newPassword) throws SQLException {
        String query = "UPDATE user SET password = ? WHERE id = ?";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            pstmt.setString(1,newPassword);
            pstmt.setInt(2, user_id);
            pstmt.executeUpdate();
        }
    }
    
    public static List<String> getAllUserEmails(){
        List<String> emailList = new ArrayList<>();
        String query = "SELECT mail FROM user";
        try(Connection conn = Database.getInstance();
            PreparedStatement pstmt = conn.prepareStatement(query)){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String mail = rs.getString("mail");
                emailList.add(mail);
            }
        }catch(SQLException ex){
        ex.printStackTrace();   
        }
        return emailList;
    }
}
