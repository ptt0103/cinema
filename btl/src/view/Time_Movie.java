
package view;

import controller.DAOController;
import java.awt.Toolkit;
import model.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Time_Movie extends javax.swing.JFrame {

    Ticket t = null;
    public Time_Movie() throws SQLException {
        initComponents();
//        setSize(1000, 1000);
       
//        hienthi();
//        setNameMovie();
        
    }
    public Time_Movie(Ticket ticket) throws SQLException, ParseException {
        this.t = ticket;
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/titile.png"));
        setSize(800, 600);
        setLocationRelativeTo(this);
        setTitle("Rạp chiếu phim PTIT");
        
        firstShow();
        setNameMovie();
//       showTT();
    }
//    public void showTT(){
//        System.out.println(t.getName_moive());
//        
//    }
            
    DAOController DAO = new DAOController();
    
    DefaultTableModel dfm;
    
    
    public boolean CompareDate(String s1) throws ParseException{
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(s1);  
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date nowDate = sdf.parse(sdf.format(new Date()));
        if(date1.before(nowDate)){
            return false;
        }
        return true;
        
    }
    public void firstShow() throws SQLException, ParseException{
        String query = "SELECT * FROM show_movie " +
"WHERE show_movie.MOVIE_ID IN (" +
"	SELECT movie.MOVIE_ID FROM movie " +
"    WHERE movie.TITILE = '" + t.getName_moive() + "' " +
")";
//        System.out.println(t.getName_moive()+ " " + query);
//        ArrayList<String> Date_movie = new ArrayList<>();
//        dfm = (DefaultTableModel) jTable1.getModel();
//
//        ResultSet rs = DAO.resultSet(query);
//        
//        while(rs.next()){
//            if(CompareDate(rs.getString(2)) == false){
//                System.out.println("0");
//                continue;
//            }
//            if(!Date_movie.contains(rs.getString(2))){
//                System.out.println(1);
//                jComboBox1.addItem(rs.getString(2));
//                Date_movie.add(rs.getString(2));
//            }
//            
//        } 
hienthi(t.getName_moive(), query);

    }
    
    public void hienthi(String nameMovie, String query) throws SQLException, ParseException {
//        ArrayList<Model.M_Show_movie> list = new ArrayList<>();
        ArrayList<String> Date_movie = new ArrayList<>();
        dfm = (DefaultTableModel) jTable1.getModel();
//        Model.Movie movie = new Model.Movie();
        ResultSet rs = DAO.resultSet(query);
        
        while(rs.next()){
            if(CompareDate(rs.getString(2)) == false){
                continue;
            }
            if(!Date_movie.contains(rs.getString(2))){
                jComboBox1.addItem(rs.getString(2));
                Date_movie.add(rs.getString(2));
            }
        } 


    }
    public void setNameMovie(){
        jLabel2.setText(t.getName_moive());
    }
    public void getShow_id() throws SQLException{
        String query = "SELECT SHOW_ID, FARE FROM show_movie " +
"WHERE MOVIE_ID = '"+ t.getMovie_id() + "' AND DATE_SHOW = '" + t.getDate_movie() +"' AND START_TIME = '" + t.getTime_moive() +"'";
        ResultSet rs = DAO.resultSet(query);
        while(rs.next()){
            t.setShow_id(rs.getInt(1));
            t.setFare_moive(rs.getInt(2));
        }
    }
//    public void setTimeMovie(){
//        int index = jComboBox1.getSelectedIndex();
//
//        if(index == 0){
//            t.setTimeMovie(jComboBox1.getItemAt(0));
//        }
//        else{
//            t.setTimeMovie(jComboBox1.getItemAt(index));
//    }
//  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Phim", "Ngày chiếu", "Giờ chiếu", "Giá vé"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên phim");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("0");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thời gian");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setMinimumSize(new java.awt.Dimension(72, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(65, 37));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(65, 33));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.setMinimumSize(new java.awt.Dimension(72, 30));

        jLabel4.setBackground(new java.awt.Color(204, 0, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thời gian chiếu phim");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Giờ chiếu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Movie m;
        try {
            m = new Movie(t); 
            m.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        t.setDate_movie(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
        t.setTime_moive(jComboBox2.getItemAt(jComboBox2.getSelectedIndex()));
        try {
            getShow_id();
        } catch (SQLException ex) {
            Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(t.getShow_id());
        try {
            Seat s = new Seat(t);
            s.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox2.removeAllItems();
       String date_movie = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        System.out.println(date_movie);
        dfm.setRowCount(0);
        String query = "SELECT * FROM show_movie " +
"WHERE show_movie.DATE_SHOW = '" + date_movie +"' " +
"AND show_movie.MOVIE_ID IN " +
"(SELECT " +
" movie.MOVIE_ID FROM movie WHERE movie.TITILE = '" + t.getName_moive() +"')";
        
                    ResultSet rs = null;
        try {
            rs = DAO.resultSet(query);
        } catch (SQLException ex) {
            Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rs.next()){
                dfm.addRow(new Object[]{
                    t.getName_moive(),
                    date_movie,
                    rs.getString(3),
                    rs.getInt(4)
                });
                jComboBox2.addItem((rs.getString(3)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
//hienthi(date_movie, query);
//        } catch (SQLException ex) {
//            Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
//        }
//hienthi(date_movie, query);
//        } catch (SQLException ex) {
//            Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Time_Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Time_Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Time_Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Time_Movie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Time_Movie().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Time_Movie.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}