/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

/**
 *
 * @author davidperezarias
 */
public class FrmMenu extends javax.swing.JFrame {
    
    
    FrmGestorCandidato frmCandidato;
    FrmGestorVotante frmVotante;
    FrmVotar frmVotar;

    /**
     * Creates new form FrmGestorCandidato
     */
    public FrmMenu() {
        initComponents();
        frmCandidato = new FrmGestorCandidato(this);
        frmVotante = new FrmGestorVotante(this);
        frmVotar = new FrmVotar(this);
    }
    


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        botonMenuEleccion = new javax.swing.JButton();
        botonMenuCandidato = new javax.swing.JButton();
        botonMenuVotante = new javax.swing.JButton();
        botonSalirApp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("LiHei Pro", 1, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 153, 153));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Elecciones");

        botonMenuEleccion.setForeground(new java.awt.Color(0, 0, 0));
        botonMenuEleccion.setText("Votar");
        botonMenuEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuEleccionActionPerformed(evt);
            }
        });

        botonMenuCandidato.setForeground(new java.awt.Color(0, 0, 0));
        botonMenuCandidato.setText("Gestor candidato");
        botonMenuCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuCandidatoActionPerformed(evt);
            }
        });

        botonMenuVotante.setForeground(new java.awt.Color(0, 0, 0));
        botonMenuVotante.setText("Gestor votante");
        botonMenuVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuVotanteActionPerformed(evt);
            }
        });

        botonSalirApp.setForeground(new java.awt.Color(0, 0, 0));
        botonSalirApp.setText("Salir");
        botonSalirApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirAppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonMenuEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMenuCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonMenuVotante, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(botonSalirApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMenuCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMenuVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonMenuEleccion, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(botonSalirApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuCandidatoActionPerformed
      
        frmCandidato.setLocationRelativeTo(this);
        
        frmCandidato.setVisible(true);
        
    }//GEN-LAST:event_botonMenuCandidatoActionPerformed

    private void botonMenuVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuVotanteActionPerformed
         
        frmVotante.setLocationRelativeTo(this);
        
        frmVotante.setVisible(true);
        
        
    }//GEN-LAST:event_botonMenuVotanteActionPerformed

    private void botonMenuEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuEleccionActionPerformed
        
        frmVotar.setLocationRelativeTo(this);
        
        frmVotar.setVisible(true);
        
        
    }//GEN-LAST:event_botonMenuEleccionActionPerformed

    private void botonSalirAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirAppActionPerformed
        
    }//GEN-LAST:event_botonSalirAppActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenuCandidato;
    private javax.swing.JButton botonMenuEleccion;
    private javax.swing.JButton botonMenuVotante;
    private javax.swing.JButton botonSalirApp;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
