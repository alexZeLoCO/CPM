/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mensa;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class Opciones extends javax.swing.JFrame {

	Envio e;		// Reference of Envio.java
	
	/**
	 * Creates new form Opciones
	 */
	public Opciones() {
		initComponents();
	}
	
	/**
	 * Creates new form Opciones
	 * @param e Reference to Envio
	 */
	public Opciones (Envio e) {
		this();
		this.e = e;
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                buttonGroup1 = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                CB_Remitente = new javax.swing.JCheckBox();
                CB_Destino = new javax.swing.JCheckBox();
                jLabel2 = new javax.swing.JLabel();
                jRadioButton1 = new javax.swing.JRadioButton();
                jRadioButton2 = new javax.swing.JRadioButton();
                jRadioButton3 = new javax.swing.JRadioButton();

                jLabel1.setText("Opciones:");

                CB_Remitente.setText("Remitente");
                CB_Remitente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                CB_RemitenteActionPerformed(evt);
                        }
                });

                CB_Destino.setText("Destinatario");
                CB_Destino.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                CB_DestinoActionPerformed(evt);
                        }
                });

                jLabel2.setText("Color:");

                buttonGroup1.add(jRadioButton1);
                jRadioButton1.setText("Blanco");
                jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton1ActionPerformed(evt);
                        }
                });

                buttonGroup1.add(jRadioButton2);
                jRadioButton2.setText("Gris");
                jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton2ActionPerformed(evt);
                        }
                });

                buttonGroup1.add(jRadioButton3);
                jRadioButton3.setText("Azul");
                jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(CB_Destino)
                                                        .addComponent(CB_Remitente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(140, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CB_Destino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CB_Remitente)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
                // TODO add your handling code here:
		this.e.vp.TA_vistaPrevia.setBackground(Color.white);
		e.vp.repaint();
        }//GEN-LAST:event_jRadioButton1ActionPerformed

        private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
                // TODO add your handling code here:
		this.e.vp.TA_vistaPrevia.setBackground(Color.gray);
		e.vp.repaint();
        }//GEN-LAST:event_jRadioButton2ActionPerformed

        private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
                // TODO add your handling code here:
		this.e.vp.TA_vistaPrevia.setBackground(new java.awt.Color(200, 200, 255));
		e.vp.repaint();
        }//GEN-LAST:event_jRadioButton3ActionPerformed

        private void CB_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DestinoActionPerformed
                // TODO add your handling code here:
		if (CB_Destino.isSelected()) {
			this.e.vp.setDestinatario(this.e.TF_Destino.getText());
		} else {
			this.e.vp.setDestinatario("");
		}
        }//GEN-LAST:event_CB_DestinoActionPerformed

        private void CB_RemitenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_RemitenteActionPerformed
                // TODO add your handling code here:
		if (CB_Remitente.isSelected()) {
			this.e.vp.setRemitente(this.e.TF_Remitente.getText());
		} else {
			this.e.vp.setRemitente("");
		}
        }//GEN-LAST:event_CB_RemitenteActionPerformed

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
			java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Opciones().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JCheckBox CB_Destino;
        private javax.swing.JCheckBox CB_Remitente;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JRadioButton jRadioButton1;
        private javax.swing.JRadioButton jRadioButton2;
        private javax.swing.JRadioButton jRadioButton3;
        // End of variables declaration//GEN-END:variables
}
