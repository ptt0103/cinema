/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DAOController;
import java.awt.Toolkit;
import model.Ticket;
import model.list_id;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;

public class Movie extends javax.swing.JFrame {

    private Ticket t = new Ticket();
    
    String ten;
    public Movie() throws SQLException {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/titile.png"));
        setSize(800, 600);
        hienthi();
        setLocationRelativeTo(this);
        setTitle("Rạp chiếu phim PTIT");
       
    }
    public Movie(Ticket ticket) throws SQLException {
        this.t = ticket;
        
        initComponents();
        setSize(800, 600);
        hienthi();
        setLocationRelativeTo(this);
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/titile.png"));
        
    }
    DAOController DAO = new DAOController();
    public boolean CompareDate(String s1) throws ParseException{
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(s1);  
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date nowDate = sdf.parse(sdf.format(new Date()));
        if(date1.before(nowDate)){
            return false;
        }
        return true;
        
    }
    
    DefaultTableModel dfm;
    ArrayList<model.Movie> list = new ArrayList<>();
    
    public boolean trungNhau(int n){
        for(model.Movie m1 : list){
            if(n== m1.getId())
                return false;
        }
        return true;
    }
    
    String query = "SELECT movie.MOVIE_ID,movie.TITILE, movie.COUNTRY, movie.DURATION, show_movie.DATE_SHOW FROM show_movie\n" +
"INNER JOIN movie\n" +
"ON show_movie.MOVIE_ID = movie.MOVIE_ID";
    public String selection = "";
    public void hienthi() throws SQLException {
        dfm = (DefaultTableModel) jTable1.getModel();
       
        ResultSet rs = DAO.resultSet(query);
        
        while(rs.next()){
            try {
//                model.Movie m = new model.Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                if(CompareDate(rs.getString(5)) &&  trungNhau(rs.getInt(1)))
                {
                    list.add(new model.Movie(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
                }
            } catch (ParseException ex) {
                Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
        dfm.setRowCount(0);
        for(model.Movie mv : list)
        {
//            if(trungNhau(mv)){
                dfm.addRow(new Object[]{
                mv.getName_Movie(),
                mv.getCountry(),
                mv.getDuration()
            });
//            }
//            System.out.println(mv.getId());
           
        }
    }
    public void getID_Movie() throws SQLException{
        String query = "SELECT MOVIE_ID FROM movie WHERE TITILE = '"+ t.getName_moive() + "'";
        ResultSet rs = DAO.resultSet(query);
        while(rs.next()){
            t.setMovie_id(rs.getInt(1));
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txTenPhim = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txPhim = new javax.swing.JLabel();
        txTenphim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(65, 33));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DANH SÁCH PHIM TRONG RẠP");

        txTenPhim.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txTenPhim.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên phim", "Xuất xứ", "Thời lượng"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(204, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(65, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txPhim.setBackground(new java.awt.Color(255, 255, 255));
        txPhim.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txPhim.setForeground(new java.awt.Color(255, 255, 255));

        txTenphim.setBackground(new java.awt.Color(255, 255, 255));
        txTenphim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txTenphim.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txTenPhim))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txPhim)
                                        .addGap(49, 49, 49)
                                        .addComponent(txTenphim))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTenphim)
                    .addComponent(txPhim))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txTenPhim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int r = jTable1.getSelectedRow();
        if(r>=0 && r<=jTable1.getRowCount())
        {
            try {
            getID_Movie();
            System.out.println(t.getMovie_id());
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Time_Movie t_m;
        try {
            t_m = new Time_Movie(t);
            t_m.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Vui lòng chọn phim muốn xem");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        User u = new User();
        u.setUserID(t.getUser_id());
        u.setName(t.getNameKH());
        Custormer c = new Custormer(u);
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        String tenPhim = (String) jTable1.getValueAt(r, 0);
        txTenphim.setText(tenPhim);
        txPhim.setText("Tên Phim: ");
        t.setName_moive(tenPhim);
        try {
            getID_Movie();
        } catch (SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Movie().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txPhim;
    private javax.swing.JLabel txTenPhim;
    private javax.swing.JLabel txTenphim;
    // End of variables declaration//GEN-END:variables
}
