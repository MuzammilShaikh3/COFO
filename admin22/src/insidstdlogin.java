

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
 
public class insidstdlogin extends javax.swing.JFrame {

    table t=new table();
     cart c=new cart();
      ResultSet rs;
    public insidstdlogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public int a=0;
    public int b=0;
    public int n1=0,n2=0,n3=0,n4=0,n5=0;
    public int p1=0,p2=0,p3=0,p4=0,p5=0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        sname = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.png"))); // NOI18N
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1);
        B1.setBounds(60, 140, 130, 160);

        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4.png"))); // NOI18N
        B3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3);
        B3.setBounds(60, 310, 130, 170);

        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1.png"))); // NOI18N
        B4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel1.add(B4);
        B4.setBounds(220, 310, 130, 170);

        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N
        B2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2);
        B2.setBounds(220, 140, 130, 160);

        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/burger.png"))); // NOI18N
        B5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B5MouseClicked(evt);
            }
        });
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel1.add(B5);
        B5.setBounds(370, 150, 250, 290);

        sname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(sname);
        sname.setBounds(80, 90, 110, 30);

        number.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel1.add(number);
        number.setBounds(550, 70, 34, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\muzam\\Downloads\\restaurant (1).png")); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(520, 80, 32, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MENU.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-20, 20, 730, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3186673.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, -190, 1130, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       
        String sni=sname.getText();
        this.setVisible(false);
       
        c.set(a,b);
        if(n5!=0){
            t.addFood("Burger",String.valueOf(n5),String.valueOf(p5),sni);
        }
        if(n1!=0){
            t.addFood("Bryce Wylde's",String.valueOf(n1),String.valueOf(p1),sni);
        }
        if(n2!=0){
            t.addFood("Knowsley Safari",String.valueOf(n2),String.valueOf(p2),sni);
        }
        if(n3!=0){
            t.addFood("Rosca de Reyes",String.valueOf(n3),String.valueOf(p3),sni);
        }
        if(n4!=0){
            t.addFood("Noodles",String.valueOf(n4),String.valueOf(p4),sni);
        }
        t.fillTable(c.t1);
        c.setVisible(true);
        
        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
      a++;
      b=b+145;
      n5++;
      p5=p5+145;
      number.setText(String.valueOf(a));
      
      
    }//GEN-LAST:event_B5ActionPerformed

    private void B5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B5MouseClicked

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
      a++;
      b=b+130;
      n1++;
      p1=p1+130;
      number.setText(String.valueOf(a));
      
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       a++;
       b=b+140;
       n2++;
       p2=p2+140;
       number.setText(String.valueOf(a));
       
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        a++;
        b=b+120;
        n3++;
        p3=p3+120;
        number.setText(String.valueOf(a));
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
       a++;
       b=b+150;
       n4++;
       p4=p4+150;
       number.setText(String.valueOf(a));
    }//GEN-LAST:event_B4ActionPerformed
    public int n;
    public void increment(){
        
        number.setText("."+n);
    }
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
            java.util.logging.Logger.getLogger(insidstdlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insidstdlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insidstdlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insidstdlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insidstdlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel number;
    public javax.swing.JLabel sname;
    // End of variables declaration//GEN-END:variables
}
