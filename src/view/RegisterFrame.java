package view;

import core.Helper;
import dao.UserDao;
import javax.swing.JOptionPane;

/**
 *
 * @author muham
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fld_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fld_mail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fld_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        fld_password_again = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        fld_company = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fld_vergi_no = new javax.swing.JTextField();
        btn_backToLoginPage = new javax.swing.JButton();
        combo_box_city = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Muhasebe Programı Kayıt");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(528, 602));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Muhasebe Programı Kayıt Ol");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yeni Üye Kayıt", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setText("İsim");

        fld_name.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setText("E-mail");

        fld_mail.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setText("Şifre");

        fld_password.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setText("Şifre Tekrar");

        fld_password_again.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        btn_register.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_register.setText("Kayıt Ol");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setText("Firma Unvanı");

        fld_company.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel8.setText("Vergi Numarası");

        fld_vergi_no.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N

        btn_backToLoginPage.setFont(new java.awt.Font("Segoe Print", 3, 12)); // NOI18N
        btn_backToLoginPage.setText("Login Ekranına Geri Dön");
        btn_backToLoginPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backToLoginPageActionPerformed(evt);
            }
        });

        combo_box_city.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        combo_box_city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADANA", "ADIYAMAN", "AFYONKARAHİSAR", "AĞRI", "AKSARAY", "AMASYA", "ANKARA", "ANTALYA", "ARDAHAN", "ARTVİN", "AYDIN", "BALIKESİR", "BARTIN", "BATMAN", "BAYBURT", "BİLECİK", "BİNGÖL", "BİTLİS", "BOLU", "BURDUR", "BURSA", "ÇANAKKALE", "ÇANKIRI", "ÇORUM", "DENİZLİ", "DİYARBAKIR", "DÜZCE", "EDİRNE", "ELAZIĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR", "GAZİANTEP", "GİRESUN", "GÜMÜŞHANE", "HAKKARİ", "HATAY", "IĞDIR", "ISPARTA", "İSTANBUL", "İZMİR", "KAHRAMANMARAŞ", "KARABÜK", "KARAMAN", "KARS", "KASTAMONU", "KAYSERİ", "KIRIKKALE", "KIRKLARELİ", "KIRŞEHİR", "KİLİS", "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "MARDİN", "MERSİN", "MUĞLA", "MUŞ", "NEVŞEHİR", "NİĞDE", "ORDU", "OSMANİYE", "RİZE", "SAKARYA", "SAMSUN", "SİİRT", "SİNOP", "SİVAS", "ŞANLIURFA", "ŞIRNAK", "TEKİRDAĞ", "TOKAT", "TRABZON", "TUNCELİ", "UŞAK", "VAN", "YALOVA", "YOZGAT", "ZONGULDAK" }));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setText("Şehir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                    .addComponent(fld_name)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fld_mail)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_register, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(fld_password_again, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fld_password, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fld_company)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                        .addComponent(fld_vergi_no)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(combo_box_city, javax.swing.GroupLayout.Alignment.LEADING, 0, 340, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_backToLoginPage))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_register, fld_company, fld_mail, fld_name, fld_password, fld_password_again, fld_vergi_no, jLabel2, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fld_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_vergi_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_backToLoginPage))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fld_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_box_city, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fld_password_again, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btn_register, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backToLoginPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backToLoginPageActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backToLoginPageActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        //Alanların boş olma durumunun kontrolü
        if (Helper.isFieldEmpty(this.fld_name) || Helper.isFieldEmpty(this.fld_mail)
                || Helper.isFieldEmpty(this.fld_company) || Helper.isFieldEmpty(this.fld_vergi_no)
                || Helper.isFieldEmpty(fld_password) || Helper.isFieldEmpty(this.fld_password_again)) {
            JOptionPane.showMessageDialog(this, "Lütfen tüm alanları doldurun!", "Boş alan kalmamalı! ", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Şifrelerin aynı olmama durumunun kontrolü
        if (!new String(fld_password.getPassword()).equals(new String(fld_password_again.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Şifreler uyuşmuyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String password = new String(fld_password.getPassword());
        //Tüm alanlar içib regex kontrolü! 
        if (!Helper.checkRegexControl(fld_name, "name") || !Helper.checkRegexControl(fld_mail, "mail")
                || !Helper.checkRegexControl(fld_vergi_no, "vergiNo")
                || !Helper.checkRegexControl(fld_company, "firmaUnvan")) {
            return;
        } /*else if (!Helper.ccheckRegexControl(password, "password")) {
            return;
        }*/

        String name = fld_name.getText().trim();
        String mail = fld_mail.getText().trim();
        String company_name = fld_company.getText().trim();
        String city = (String) combo_box_city.getSelectedItem();
        int company_no = Integer.parseInt(fld_vergi_no.getText());

        UserDao.register(name, mail, password, company_name, city, company_no);
        JOptionPane.showMessageDialog(this, "Kullanıcı kaydedildi! ");
    }//GEN-LAST:event_btn_registerActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backToLoginPage;
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> combo_box_city;
    private javax.swing.JTextField fld_company;
    private javax.swing.JTextField fld_mail;
    private javax.swing.JTextField fld_name;
    private javax.swing.JPasswordField fld_password;
    private javax.swing.JPasswordField fld_password_again;
    private javax.swing.JTextField fld_vergi_no;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
