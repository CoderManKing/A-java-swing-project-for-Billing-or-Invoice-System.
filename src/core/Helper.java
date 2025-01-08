
package core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextField;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author muham
 */
public class Helper {
    
    public static boolean isFieldEmpty(JTextField field){
        // "trim()" metodu sağdan ve soldan boşlukları siler.
        return field.getText().trim().isEmpty();
    }
    
    public static boolean checkRegexControl(JTextField field, String type){
        String regex;
        switch(type){
            case "name":
                regex = "^[a-zA-Z\\s]+(?: [a-zA-Z\\s]+)*$";                
                if(Pattern.matches(regex, field.getText().trim()))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "İsim alanında geçersiz giriş\nRakam ve Özel karakter içeremez.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);                    
                break;
            case "mail":
                regex = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|fsm\\.edu\\.tr)$";
                if(Pattern.matches(regex, field.getText().trim()))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Mail alanında geçersiz giriş\nAlan adı 'gmail.com' \n veya 'fsm.edu.tr' olmalı", "Uyarı", JOptionPane.INFORMATION_MESSAGE);                    
                break;
            case "password":
                regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()\\-+=])[A-Za-z\\d!@#$%^&*()\\-+=]{8,20}$";
                if(Pattern.matches(regex, field.getText()))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Şifre 8-20 karakterli en az bir büyük ve küçük harf\nen az bir rakam ve bir özel karakter içermelidir.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
                break;
            case"vergiNo":
                regex = "^[1-9][0-9]{9}$";
                if(Pattern.matches(regex, field.getText().trim()))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Vergi alanında geçersiz giriş,\n10 hane ve rakamlardan oluşmalı!\n 0 ile başlayamaz.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);                    
                break;
            case"firmaUnvan":
                regex = "^[A-Za-z0-9çÇğĞıİöÖşŞüÜ&._\\s-]{3,50}$";
                if(Pattern.matches(regex, field.getText().trim()))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Firma Unvan alanında geçersiz giriş\n3-50 karakter arası olmalıdır.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lütfen uygun şekilde tüm alanları doldurun!", "Regex hatası", JOptionPane.ERROR_MESSAGE);
                return false;
        }
        return false;
    }
    
    public static boolean ccheckRegexControl(String str, String type){
        String regex;
        switch(type){
            case "name":
                regex = "^[a-zA-Z\\s]+(?: [a-zA-Z\\s]+)*$";                
                if(Pattern.matches(regex, str))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "İsim alanında geçersiz giriş\nRakam ve Özel karakter içeremez.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "mail":
                regex = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|fsm\\.edu\\.tr)$";
                if(Pattern.matches(regex, str))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Mail alanında geçersiz giriş\nAlan adı 'gmail.com' \n veya 'fsm.edu.tr' olmalı", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "password":
                regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}";
                if(Pattern.matches(regex, str))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Şifre 8-20 karakterli en az bir büyük ve küçük harf\nen az bir rakam ve bir özel karakter içermelidir.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
                break;
            case"vergiNo":
                regex = "^[1-9][0-9]{9}$";
                if(Pattern.matches(regex, str))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Vergi alanında geçersiz giriş,\n10 hane ve rakamlardan oluşmalı!\n 0 ile başlayamaz.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
                break;
            case"firmaUnvan":
                regex = "^[A-Za-z0-9çÇğĞıİöÖşŞüÜ&._\\s-]{3,50}$";
                if(Pattern.matches(regex, str))
                    return true;
                else
                    JOptionPane.showMessageDialog(null, "Firma Unvan alanında geçersiz giriş\n3-50 karakter arası olmalıdır.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lütfen uygun şekilde tüm alanları doldurun!", "Regex hatası", JOptionPane.ERROR_MESSAGE);
                return false;
        }
        return false;
    }
    //OVERLOAD
    public static void dosyayaYaz(DefaultTableModel model, String path) {
        try (FileWriter writer = new FileWriter(path); 
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            // Her satırı döngüde oku ve dosyaya yaz
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    bufferedWriter.write(model.getValueAt(i, j).toString() + ",");
                }
                bufferedWriter.newLine();
            }
            JOptionPane.showMessageDialog(null, "dosyaya yazıldı.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "dosyaya yazarken sorun oluştu", "hata!", JOptionPane.ERROR_MESSAGE);
        }
    }
    // OVERLOAD
    public static void dosyayaYaz(JTextArea textArea, String path) {
        try (FileWriter writer = new FileWriter(path); 
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            // Her satırı döngüde oku ve dosyaya yaz
            textArea.write(writer);
            JOptionPane.showMessageDialog(null, "dosyaya yazıldı.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "dosyaya yazarken sorun oluştu", "hata!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
