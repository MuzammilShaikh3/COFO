
import com.email.durgesh.Email;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronakmalik
 */
public class payments extends javax.swing.JFrame {

    /**
     * Creates new form payments
     */
    
    public payments() {
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        uname = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);
        jPanel1.add(uname);
        uname.setBounds(200, 420, 300, 40);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(60, 330, 450, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Buy2 .png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 550, 260, 50);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(60, 420, 130, 40);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(60, 170, 20, 40);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(60, 220, 20, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("₹");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 50, 12, 30);

        total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(total);
        total.setBounds(430, 50, 90, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Total:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 50, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pay.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -10, 570, 1010);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    table t=new table();
    Dashboard db=new Dashboard();
    public void total(int p){
      int q=p;
      total.setText(String.valueOf(q));
    }
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       java.sql.PreparedStatement ps;
         ResultSet rs;
         String ToEmail;
         String rno=uname.getText();
         MyConnection mycon=new MyConnection();
         
         String query="SELECT email FROM loginstd WHERE `username`=?";
        try {
              ps= mycon.getConnection().prepareStatement(query);
            ps.setString(1, rno);
            rs=ps.executeQuery();
            while(rs.next()){
           ToEmail = rs.getString(1);
              
             try{
                 Email email=new Email("testproject396@gmail.com","Test@420");
                 email.setFrom("testproject396@gmail.com","Canteen project");
                 email.setSubject("ABOUT YOUR ORDER");
                 email.setContent("<h3>YOUR ORDER HAS BEEN PLACED</h3>","text/html");
                 email.addRecipient(ToEmail);
                 email.send();
                 JOptionPane.showMessageDialog(this,"YOUR ORDER HAS BEEN PLACED");
                 
             }catch(Exception e){
                 e.printStackTrace();
             }
                }
        } catch (SQLException ex) {
            Logger.getLogger(payments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               payments pay=new payments();
                pay.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel total;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
