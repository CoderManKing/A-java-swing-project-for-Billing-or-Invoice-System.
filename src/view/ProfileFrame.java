/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import core.Helper;
import dao.UserDao;
import entity.User;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author muham
 */
public class ProfileFrame extends javax.swing.JFrame {
    private static User user;
    /**
     * Creates new form ProfileFrame
     */
    public ProfileFrame(User _user) {
        user = new User();
        user = _user;
        initComponents();
        bilgileriGetir();
    }
    
    private void bilgileriGetir(){
        lbl_id.setText("Kullanıcı id: "+user.getId());
        lbl_name.setText("Kullancı adı: "+user.getName());
        lbl_mail.setText("Kullanıcı mail: "+user.getMail());
        lbl_co_nam.setText("Firma Unvan: "+user.getCompany_name());
        lbl_city.setText("Şehir: "+user.getCity());
        lbl_co_no.setText("Vergi Numarası: "+user.getCompany_no());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_mail = new javax.swing.JLabel();
        lbl_co_nam = new javax.swing.JLabel();
        lbl_city = new javax.swing.JLabel();
        lbl_co_no = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fld_password = new javax.swing.JPasswordField();
        fld_password_again = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btn_pass_change = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bilgilerim", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        lbl_id.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_id.setText("User ID :");

        lbl_name.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_name.setText("User Name");

        lbl_mail.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_mail.setText("E-mail");

        lbl_co_nam.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_co_nam.setText("Company Name");

        lbl_city.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_city.setText("City");

        lbl_co_no.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbl_co_no.setText("Company Number");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_co_nam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_city, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_co_no, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lbl_id)
                .addGap(18, 18, 18)
                .addComponent(lbl_name)
                .addGap(18, 18, 18)
                .addComponent(lbl_mail)
                .addGap(18, 18, 18)
                .addComponent(lbl_co_nam)
                .addGap(18, 18, 18)
                .addComponent(lbl_city)
                .addGap(18, 18, 18)
                .addComponent(lbl_co_no)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Düzenle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("Yeni Şifre");

        fld_password.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        fld_password_again.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Yeni Şifre Tekrar");

        btn_pass_change.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_pass_change.setText("Şifre Değiştir");
        btn_pass_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pass_changeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fld_password, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_password_again)
                    .addComponent(btn_pass_change, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_pass_change, fld_password, fld_password_again, jLabel2, jLabel3});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fld_password_again, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pass_change)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Main Frame");

        jMenuItem1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jMenuItem1.setText("Ana Sayfaya Dön");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MainFrame mf = new MainFrame(user);
        mf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_pass_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pass_changeActionPerformed
        //Şifrelerin aynı olmama durumunun kontrolü
        if (!new String(fld_password.getPassword()).equals(new String(fld_password_again.getPassword()))) 
        {
            JOptionPane.showMessageDialog(this, "Şifreler uyuşmuyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(Helper.isFieldEmpty(fld_password) || Helper.isFieldEmpty(fld_password_again)){
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun!", "Boş alan kalmamalı! ", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        String pass1 = new String(fld_password.getPassword());
        String pass2 = new String(fld_password_again.getPassword());
        
        if(!Helper.ccheckRegexControl(pass1, "password") ||
        !Helper.ccheckRegexControl(pass2, "password")){
            return;
        }

        try {
            UserDao.userSifreGuncelle(user.getId(), pass2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Şifre güncellenirken bir hata oluştu", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_pass_changeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileFrame(new User()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pass_change;
    private javax.swing.JPasswordField fld_password;
    private javax.swing.JPasswordField fld_password_again;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_city;
    private javax.swing.JLabel lbl_co_nam;
    private javax.swing.JLabel lbl_co_no;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_name;
    // End of variables declaration//GEN-END:variables
}
