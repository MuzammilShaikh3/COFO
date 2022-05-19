
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muzam
 */
public class cart extends javax.swing.JFrame {

    /**
     * Creates new form cart
     */
    table t=new table();
    Dashboard db=new Dashboard();
    public cart() {
        initComponents();
        this.setLocationRelativeTo(null);
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        proceed = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rupee = new javax.swing.JLabel();
        ptext = new javax.swing.JLabel();
        qtext = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        proceed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHECKOUT.png"))); // NOI18N
        proceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        jPanel1.add(proceed);
        proceed.setBounds(60, 310, 240, 60);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("|");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 180, 10, 30);

        rupee.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rupee.setText("₹");
        jPanel1.add(rupee);
        rupee.setBounds(260, 180, 10, 30);

        ptext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(ptext);
        ptext.setBounds(270, 180, 60, 30);

        qtext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(qtext);
        qtext.setBounds(190, 180, 30, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Total:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 180, 70, 30);

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "price"
            }
        ));
        t1.setGridColor(new java.awt.Color(255, 255, 255));
        t1.setOpaque(false);
        jScrollPane1.setViewportView(t1);
        if (t1.getColumnModel().getColumnCount() > 0) {
            t1.getColumnModel().getColumn(1).setPreferredWidth(6);
            t1.getColumnModel().getColumn(2).setPreferredWidth(6);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 360, 160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        this.setVisible(false);
        payments pay=new payments();
        pay.total(d);
        pay.setVisible(true);
    }//GEN-LAST:event_proceedActionPerformed
      public int d;
     public void set(int n,int m){
      int c=n;
      d=m;
      qtext.setText(String.valueOf(c));
      ptext.setText(String.valueOf(d));
    }
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
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cart c=new cart();
                c.setVisible(true);
  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proceed;
    private javax.swing.JLabel ptext;
    public javax.swing.JLabel qtext;
    private javax.swing.JLabel rupee;
    public javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
