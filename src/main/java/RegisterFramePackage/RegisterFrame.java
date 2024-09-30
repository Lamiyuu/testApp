/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RegisterFramePackage;
import LoginFramePackage.LoginFrame;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
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

        jButtonHide = new javax.swing.JButton();
        jButtonHide1 = new javax.swing.JButton();
        gradientText1 = new RegisterFramePackage.GradientText();
        gradientPanelRegister1 = new RegisterFramePackage.GradientPanelRegister();
        jPanel1 = new javax.swing.JPanel();
        gradientText2 = new RegisterFramePackage.GradientText();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCCCD = new javax.swing.JTextField();
        jTextFieldHoTen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNgaySinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldSoPhong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTenDangNhap = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonDangKi = new javax.swing.JButton();
        jButtonVeDangNhap = new javax.swing.JButton();
        jTextFieldMatKhauMoi = new javax.swing.JPasswordField();
        jTextFieldXacNhanMatKhau = new javax.swing.JPasswordField();
        logoPanel1 = new LoginFramePackage.LogoPanel();

        jButtonHide.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonHide.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHide.setText("–");
        jButtonHide.setContentAreaFilled(false);
        jButtonHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonHideMouseExited(evt);
            }
        });
        jButtonHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHideActionPerformed(evt);
            }
        });

        jButtonHide1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonHide1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHide1.setText("–");
        jButtonHide1.setContentAreaFilled(false);
        jButtonHide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonHide1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonHide1MouseExited(evt);
            }
        });
        jButtonHide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHide1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng kí");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        gradientText2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout gradientText2Layout = new javax.swing.GroupLayout(gradientText2);
        gradientText2.setLayout(gradientText2Layout);
        gradientText2Layout.setHorizontalGroup(
            gradientText2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );
        gradientText2Layout.setVerticalGroup(
            gradientText2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("CCCD");

        jTextFieldHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoTenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Họ tên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Ngày sinh");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Số phòng");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Tên đăng nhập");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Mật khẩu mới");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Xác nhận mật khẩu");

        jButtonDangKi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDangKi.setForeground(new java.awt.Color(0, 153, 153));
        jButtonDangKi.setText("Đăng kí");
        jButtonDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangKiActionPerformed(evt);
            }
        });

        jButtonVeDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonVeDangNhap.setForeground(new java.awt.Color(0, 153, 153));
        jButtonVeDangNhap.setText("Về đăng nhập");
        jButtonVeDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVeDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(gradientText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonDangKi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(jButtonVeDangNhap))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCCCD)
                            .addComponent(jTextFieldHoTen)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNgaySinh, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSoPhong)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldTenDangNhap)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMatKhauMoi)
                            .addComponent(jTextFieldXacNhanMatKhau))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(gradientText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldXacNhanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDangKi)
                    .addComponent(jButtonVeDangNhap))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout logoPanel1Layout = new javax.swing.GroupLayout(logoPanel1);
        logoPanel1.setLayout(logoPanel1Layout);
        logoPanel1Layout.setHorizontalGroup(
            logoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        logoPanel1Layout.setVerticalGroup(
            logoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gradientPanelRegister1Layout = new javax.swing.GroupLayout(gradientPanelRegister1);
        gradientPanelRegister1.setLayout(gradientPanelRegister1Layout);
        gradientPanelRegister1Layout.setHorizontalGroup(
            gradientPanelRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelRegister1Layout.createSequentialGroup()
                .addGroup(gradientPanelRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelRegister1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(logoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanelRegister1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        gradientPanelRegister1Layout.setVerticalGroup(
            gradientPanelRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanelRegister1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanelRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanelRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHideMouseEntered
        jButtonHide.setOpaque(true);
        jButtonHide.setBackground(Color.GRAY);
    }//GEN-LAST:event_jButtonHideMouseEntered

    private void jButtonHideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHideMouseExited
        jButtonHide.setOpaque(false);
    }//GEN-LAST:event_jButtonHideMouseExited

    private void jButtonHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHideActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButtonHideActionPerformed

    private void jButtonHide1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHide1MouseEntered
        jButtonHide.setOpaque(true);
        jButtonHide.setBackground(Color.GRAY);
    }//GEN-LAST:event_jButtonHide1MouseEntered

    private void jButtonHide1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHide1MouseExited
        jButtonHide.setOpaque(false);
    }//GEN-LAST:event_jButtonHide1MouseExited

    private void jButtonHide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHide1ActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButtonHide1ActionPerformed

    private void jTextFieldHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoTenActionPerformed

    private void jButtonDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangKiActionPerformed
        String fullName, loginName, password, confirmPassword, cccd, email, dob, roomPosition, query;
         
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DatabasePackage.DatabaseConnection.getConnection();

            // Lấy dữ liệu từ người dùng
            fullName = jTextFieldHoTen.getText();
            loginName = jTextFieldTenDangNhap.getText();
            password = new String(jTextFieldMatKhauMoi.getPassword());
            confirmPassword = new String(jTextFieldXacNhanMatKhau.getPassword());
            cccd = jTextFieldCCCD.getText();
            email = jTextFieldEmail.getText();
            dob = jTextFieldNgaySinh.getText();
            roomPosition = jTextFieldSoPhong.getText();

            // Kiểm tra lỗi
            if (fullName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Họ và tên là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (loginName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tên đăng nhập là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mật khẩu là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cccd.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Số CCCD là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Email là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (dob.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ngày sinh là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (roomPosition.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vị trí phòng là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Câu lệnh SQL để thêm người dùng mới
            query = "INSERT INTO user(full_name, login_name, password, cccd, email, dob, room_position) VALUES(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, fullName);
            pstmt.setString(2, loginName);
            pstmt.setString(3, password);
            pstmt.setString(4, cccd);
            pstmt.setString(5, email);
            pstmt.setString(6, dob);
            pstmt.setString(7, roomPosition);
            pstmt.executeUpdate();

            // Xóa dữ liệu nhập vào
            jTextFieldHoTen.setText("");
            jTextFieldTenDangNhap.setText("");
            jTextFieldMatKhauMoi.setText("");
            jTextFieldXacNhanMatKhau.setText("");
            jTextFieldCCCD.setText("");
            jTextFieldEmail.setText("");
            jTextFieldNgaySinh.setText("");
            jTextFieldSoPhong.setText("");

            // Thông báo thành công
            JOptionPane.showMessageDialog(this, "Tài khoản mới đã được tạo thành công");
            
            
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi cơ sở dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy driver JDBC", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDangKiActionPerformed

    private void jButtonVeDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVeDangNhapActionPerformed
        LoginFrame LoginFrame = new LoginFrame(); 
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonVeDangNhapActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RegisterFramePackage.GradientPanelRegister gradientPanelRegister1;
    private RegisterFramePackage.GradientText gradientText1;
    private RegisterFramePackage.GradientText gradientText2;
    private javax.swing.JButton jButtonDangKi;
    private javax.swing.JButton jButtonHide;
    private javax.swing.JButton jButtonHide1;
    private javax.swing.JButton jButtonVeDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCCCD;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHoTen;
    private javax.swing.JPasswordField jTextFieldMatKhauMoi;
    private javax.swing.JTextField jTextFieldNgaySinh;
    private javax.swing.JTextField jTextFieldSoPhong;
    private javax.swing.JTextField jTextFieldTenDangNhap;
    private javax.swing.JPasswordField jTextFieldXacNhanMatKhau;
    private LoginFramePackage.LogoPanel logoPanel1;
    // End of variables declaration//GEN-END:variables
}
