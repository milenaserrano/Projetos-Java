
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
public class FrmExercicio_Menus extends javax.swing.JFrame {

    /**
     * Creates new form FrmExercicio_Menus
     */
    public FrmExercicio_Menus() {
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

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpcApp1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        OpcSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Word = new javax.swing.JMenuItem();
        Excel = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Jogo1 = new javax.swing.JMenuItem();
        Jogo2 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu5.setText("jMenu5");

        jMenuItem4.setText("jMenuItem4");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exercício - Menus - 2019");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setMnemonic('A');
        jMenu1.setText("Aplicativos");

        OpcApp1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        OpcApp1.setText("Cálculo de Compra");
        OpcApp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcApp1ActionPerformed(evt);
            }
        });
        jMenu1.add(OpcApp1);

        jMenuItem6.setText("Cálculo de Soma");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator2);

        OpcSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        OpcSair.setText("Sair");
        OpcSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcSairActionPerformed(evt);
            }
        });
        jMenu1.add(OpcSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('U');
        jMenu2.setText("Utilitários");

        Word.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        Word.setText("MS-Word");
        Word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WordActionPerformed(evt);
            }
        });
        jMenu2.add(Word);

        Excel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Excel.setText("MS-Excel");
        Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelActionPerformed(evt);
            }
        });
        jMenu2.add(Excel);

        jMenuBar1.add(jMenu2);

        jMenu4.setMnemonic('J');
        jMenu4.setText("Jogos/Acessórios");

        Jogo1.setText("Paint");
        Jogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jogo1ActionPerformed(evt);
            }
        });
        jMenu4.add(Jogo1);

        Jogo2.setText("Ferramenta de Captura");
        Jogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jogo2ActionPerformed(evt);
            }
        });
        jMenu4.add(Jogo2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpcApp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcApp1ActionPerformed
FrmCalc_Compra_Parc FrmCalc_Compra_Parc = new FrmCalc_Compra_Parc();
     FrmCalc_Compra_Parc.setVisible (true);        
    }//GEN-LAST:event_OpcApp1ActionPerformed

    private void WordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WordActionPerformed
       
        try {
            Runtime.getRuntime().exec("cmd.exe /C start WINWORD.exe");
        } catch (IOException ex) {
            Logger.getLogger(FrmExercicio_Menus.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_WordActionPerformed

    private void ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start EXCEL.exe");
        } catch (IOException ex) {
            Logger.getLogger(FrmExercicio_Menus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExcelActionPerformed

    private void OpcSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_OpcSairActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         FrmSoma Frm_Soma = new FrmSoma();
        Frm_Soma.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void Jogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jogo1ActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start mspaint.exe");
        } catch (IOException ex) {
            Logger.getLogger(FrmExercicio_Menus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Jogo1ActionPerformed

    private void Jogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jogo2ActionPerformed
       try {
            Runtime.getRuntime().exec("cmd.exe /C start SnippingTool.exe");
        } catch (IOException ex) {
            Logger.getLogger(FrmExercicio_Menus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Jogo2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmExercicio_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmExercicio_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmExercicio_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmExercicio_Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExercicio_Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Excel;
    private javax.swing.JMenuItem Jogo1;
    private javax.swing.JMenuItem Jogo2;
    private javax.swing.JMenuItem OpcApp1;
    private javax.swing.JMenuItem OpcSair;
    private javax.swing.JMenuItem Word;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
