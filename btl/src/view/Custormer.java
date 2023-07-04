
package view;


import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ticket;
import model.User;
public class Custormer extends javax.swing.JFrame {
    private User user = new User();
    private Ticket ticket = new Ticket();
    public Custormer() {
        initComponents();
        setLocationRelativeTo(this);
        setHello();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/titile.png"));
        setTitle("Rạp chiếu phim PTIT");
    }
    
    public Custormer(User user) {
        this.user = user;
        initComponents();
        setLocationRelativeTo(this);
        setHello();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/titile.png"));
        setTitle("Rạp chiếu phim PTIT");
    }

    private void setHello(){
        if(user.getName() != null)
            ttfHello.setText("Xin chào, " + user.getName());
        else
            ttfHello.setText("Xin chào");
    }
    public String getTen(){
        return user.getName();
    }
    public String getTenTK(){
        return user.getUsername();
    }
    public String getMK(){
        return user.getPassword();
    }
    public int getSodu(){
        return user.getWallet();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ttfHello = new javax.swing.JLabel();
        bntHistory = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnChangePass1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RẠP CHIẾU PHIM PTIT");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ttfHello.setBackground(new java.awt.Color(204, 204, 204));
        ttfHello.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ttfHello.setForeground(new java.awt.Color(255, 255, 255));
        ttfHello.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttfHello.setText("Xin chào, Anh Đức");

        bntHistory.setBackground(new java.awt.Color(102, 0, 51));
        bntHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historyIcon.png"))); // NOI18N
        bntHistory.setBorder(null);
        bntHistory.setBorderPainted(false);
        bntHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntHistory.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        bntHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntHistoryActionPerformed(evt);
            }
        });

        btnBooking.setBackground(new java.awt.Color(102, 0, 51));
        btnBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ticketIcon.png"))); // NOI18N
        btnBooking.setBorder(null);
        btnBooking.setBorderPainted(false);
        btnBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBooking.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lịch sử");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mua vé xem phim");

        btnChangePass1.setBackground(new java.awt.Color(204, 0, 102));
        btnChangePass1.setForeground(new java.awt.Color(255, 255, 255));
        btnChangePass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info.png"))); // NOI18N
        btnChangePass1.setBorder(null);
        btnChangePass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePass1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ttfHello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnChangePass1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntHistory))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(221, 221, 221))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttfHello, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntHistory)
                    .addComponent(btnBooking))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(btnChangePass1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void changePass(){
        DialogCusChangePass change = new DialogCusChangePass(this, true);
        change.setData(user.getPassword(), user.getUserID());
        change.setVisible(true);  
    }
    public void logOut(){
        Login log = new Login();
        this.dispose();
        log.show();
    }
    private void bntHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntHistoryActionPerformed
        DialogCusHistory cus = new DialogCusHistory(this, true);
        cus.addData(user.getUserID());
        cus.setVisible(true);
    }//GEN-LAST:event_bntHistoryActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        try {
            ticket.setUser_id(user.getUserID());
            ticket.setNameKH(user.getName());
            Movie movie = new Movie(ticket);
            movie.show();
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Custormer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnChangePass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePass1ActionPerformed
        DialogInformation info = new DialogInformation(this, true);
        info.setData(user.getUserID());
        info.setVisible(true);
    }//GEN-LAST:event_btnChangePass1ActionPerformed

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
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Custormer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Custormer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntHistory;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnChangePass1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ttfHello;
    // End of variables declaration//GEN-END:variables
}
