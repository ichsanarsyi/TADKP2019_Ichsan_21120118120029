
package penghitungdzikir;

public class tahlil extends javax.swing.JFrame {

    public tahlil() {
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

        btnC = new javax.swing.JButton();
        btntahlil1 = new javax.swing.JButton();
        btnbacktahlil = new javax.swing.JButton();
        jumlahtahlil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penghitungdzikir/btnclear.png"))); // NOI18N
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 60, 60));

        btntahlil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penghitungdzikir/btn1.png"))); // NOI18N
        btntahlil1.setBorder(null);
        btntahlil1.setBorderPainted(false);
        btntahlil1.setContentAreaFilled(false);
        btntahlil1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntahlil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntahlil1ActionPerformed(evt);
            }
        });
        getContentPane().add(btntahlil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 100, 100));

        btnbacktahlil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penghitungdzikir/btnBack.png"))); // NOI18N
        btnbacktahlil.setBorder(null);
        btnbacktahlil.setBorderPainted(false);
        btnbacktahlil.setContentAreaFilled(false);
        btnbacktahlil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbacktahlil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbacktahlilActionPerformed(evt);
            }
        });
        getContentPane().add(btnbacktahlil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 80));

        jumlahtahlil.setFont(new java.awt.Font("Futura Bk BT", 0, 48)); // NOI18N
        jumlahtahlil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jumlahtahlil.setBorder(null);
        jumlahtahlil.setOpaque(false);
        jumlahtahlil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahtahlilActionPerformed(evt);
            }
        });
        getContentPane().add(jumlahtahlil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 260, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penghitungdzikir/4tahlil.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbacktahlilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbacktahlilActionPerformed
        home jump = new home();        
        jump.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbacktahlilActionPerformed

    private void jumlahtahlilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahtahlilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahtahlilActionPerformed
    
    private int count;
    private void btntahlil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntahlil1ActionPerformed
        count++;
        jumlahtahlil.setText (Integer.toString(count));
    }//GEN-LAST:event_btntahlil1ActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        int reset = 0;
        jumlahtahlil.setText(String.valueOf(reset));
    }//GEN-LAST:event_btnCActionPerformed

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
            java.util.logging.Logger.getLogger(tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tahlil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tahlil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnbacktahlil;
    private javax.swing.JButton btntahlil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jumlahtahlil;
    // End of variables declaration//GEN-END:variables
}
