/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daa;

/**
 *
 * @author H P
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Warning
     */
    public Home() {
        initComponents();
        lbl_about.setVisible(false);
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
        pnl_sortDisplay1 = new javax.swing.JPanel();
        pnl_heading = new javax.swing.JPanel();
        lbl_about = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnl_close = new javax.swing.JPanel();
        lbl_close = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnl_heading1 = new javax.swing.JPanel();
        lbl_limit = new javax.swing.JLabel();
        pnl_sortDisplay = new javax.swing.JPanel();
        btn_bubble = new javax.swing.JButton();
        btn_insertion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(156, 39, 176));
        jPanel1.setLayout(null);

        pnl_sortDisplay1.setBackground(new java.awt.Color(3, 169, 244));
        pnl_sortDisplay1.setLayout(null);
        jPanel1.add(pnl_sortDisplay1);
        pnl_sortDisplay1.setBounds(0, 60, 730, 3);

        pnl_heading.setBackground(new java.awt.Color(13, 71, 161));
        pnl_heading.setToolTipText("");
        pnl_heading.setLayout(null);

        lbl_about.setBackground(new java.awt.Color(195, 75, 215));
        lbl_about.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_about.setForeground(new java.awt.Color(178, 178, 178));
        lbl_about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_about.setText("About Me");
        pnl_heading.add(lbl_about);
        lbl_about.setBounds(30, 30, 90, 20);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALGORITHM SIMULATOR");
        pnl_heading.add(jLabel1);
        jLabel1.setBounds(190, 13, 350, 30);

        pnl_close.setBackground(new java.awt.Color(57, 73, 171));
        pnl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_closeMouseClicked(evt);
            }
        });
        pnl_close.setLayout(null);

        lbl_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa/ic_close_white_24dp_1x.png"))); // NOI18N
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        pnl_close.add(lbl_close);
        lbl_close.setBounds(18, 15, 30, 30);

        pnl_heading.add(pnl_close);
        pnl_close.setBounds(669, 0, 60, 60);

        jPanel9.setBackground(new java.awt.Color(57, 73, 171));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa/ic_person_white_24dp_1x.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel9.add(jLabel5);
        jLabel5.setBounds(18, 15, 30, 30);

        pnl_heading.add(jPanel9);
        jPanel9.setBounds(0, 0, 60, 60);

        jPanel1.add(pnl_heading);
        pnl_heading.setBounds(0, 0, 730, 60);

        pnl_heading1.setBackground(new java.awt.Color(13, 71, 161));
        pnl_heading1.setToolTipText("");
        pnl_heading1.setLayout(null);

        lbl_limit.setBackground(new java.awt.Color(13, 71, 161));
        lbl_limit.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 16)); // NOI18N
        lbl_limit.setForeground(new java.awt.Color(178, 178, 178));
        lbl_limit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_limit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/daa/ic_priority_high_white_24dp_1x.png"))); // NOI18N
        lbl_limit.setText("Program Limitations");
        lbl_limit.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lbl_limit.setOpaque(true);
        lbl_limit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_limitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_limitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_limitMouseExited(evt);
            }
        });
        pnl_heading1.add(lbl_limit);
        lbl_limit.setBounds(560, 0, 170, 30);

        jPanel1.add(pnl_heading1);
        pnl_heading1.setBounds(0, 368, 730, 30);

        pnl_sortDisplay.setBackground(new java.awt.Color(25, 118, 210));
        pnl_sortDisplay.setLayout(null);

        btn_bubble.setBackground(new java.awt.Color(3, 169, 244));
        btn_bubble.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btn_bubble.setForeground(new java.awt.Color(255, 255, 255));
        btn_bubble.setText("BUUBLE SORT");
        btn_bubble.setBorder(null);
        btn_bubble.setBorderPainted(false);
        btn_bubble.setContentAreaFilled(false);
        btn_bubble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bubble.setOpaque(true);
        btn_bubble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bubbleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bubbleMouseExited(evt);
            }
        });
        btn_bubble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bubbleActionPerformed(evt);
            }
        });
        pnl_sortDisplay.add(btn_bubble);
        btn_bubble.setBounds(230, 80, 260, 40);

        btn_insertion.setBackground(new java.awt.Color(3, 169, 244));
        btn_insertion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        btn_insertion.setForeground(new java.awt.Color(255, 255, 255));
        btn_insertion.setText("INSERTION SORT");
        btn_insertion.setBorder(null);
        btn_insertion.setBorderPainted(false);
        btn_insertion.setContentAreaFilled(false);
        btn_insertion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_insertion.setOpaque(true);
        btn_insertion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_insertionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_insertionMouseExited(evt);
            }
        });
        btn_insertion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertionActionPerformed(evt);
            }
        });
        pnl_sortDisplay.add(btn_insertion);
        btn_insertion.setBounds(230, 175, 260, 40);

        jPanel1.add(pnl_sortDisplay);
        pnl_sortDisplay.setBounds(0, 60, 730, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 729, 398);

        setSize(new java.awt.Dimension(729, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bubbleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bubbleMouseEntered
        btn_bubble.setBackground(new java.awt.Color(195,75,215));
    }//GEN-LAST:event_btn_bubbleMouseEntered

    private void btn_bubbleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bubbleMouseExited
        btn_bubble.setBackground(new java.awt.Color(3,169,244));
    }//GEN-LAST:event_btn_bubbleMouseExited

    private void btn_bubbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bubbleActionPerformed
        
        new BubbleSort().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_bubbleActionPerformed

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void pnl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pnl_closeMouseClicked

    private void btn_insertionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insertionMouseEntered
        btn_insertion.setBackground(new java.awt.Color(195,75,215));
    }//GEN-LAST:event_btn_insertionMouseEntered

    private void btn_insertionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_insertionMouseExited
        btn_insertion.setBackground(new java.awt.Color(3,169,244));
    }//GEN-LAST:event_btn_insertionMouseExited

    private void btn_insertionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertionActionPerformed
        
        new InsertionSort().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_insertionActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        lbl_about.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        lbl_about.setVisible(true);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        lbl_about.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        lbl_about.setVisible(false);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new AboutMe().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        new AboutMe().setVisible(true);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void lbl_limitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_limitMouseClicked
        new Limits().setVisible(true);
    }//GEN-LAST:event_lbl_limitMouseClicked

    private void lbl_limitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_limitMouseEntered
        lbl_limit.setBackground(new java.awt.Color(57,73,171));
    }//GEN-LAST:event_lbl_limitMouseEntered

    private void lbl_limitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_limitMouseExited
        lbl_limit.setBackground(new java.awt.Color(13,71,161));
    }//GEN-LAST:event_lbl_limitMouseExited

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bubble;
    private javax.swing.JButton btn_insertion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl_about;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_limit;
    private javax.swing.JPanel pnl_close;
    private javax.swing.JPanel pnl_heading;
    private javax.swing.JPanel pnl_heading1;
    private javax.swing.JPanel pnl_sortDisplay;
    private javax.swing.JPanel pnl_sortDisplay1;
    // End of variables declaration//GEN-END:variables
}