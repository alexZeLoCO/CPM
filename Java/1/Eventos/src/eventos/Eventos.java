/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eventos;

/**
 *
 * @author uo281827 
 */
public class Eventos extends javax.swing.JFrame {

	/**
	 * Creates new form Eventos
	 */
	public Eventos() {
		initComponents();
		LT_Texto.setModel(new javax.swing.DefaultListModel());
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                TFTexto = new javax.swing.JTextField();
                BTCopia = new javax.swing.JButton();
                LBDestino = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jScrollPane1 = new javax.swing.JScrollPane();
                LT_Texto = new javax.swing.JList<>();
                BT_Insertar = new javax.swing.JButton();
                LB_Seleccion = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Escriba un texto:");

                TFTexto.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                TFTextoKeyReleased(evt);
                        }
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                TFTextoKeyTyped(evt);
                        }
                });

                BTCopia.setText("Copiar");
                BTCopia.setEnabled(false);
                BTCopia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BTCopiaActionPerformed(evt);
                        }
                });

                LBDestino.setText("Destino");

                LT_Texto.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = { "Rojo", "Verde" };
                        public int getSize() { return strings.length; }
                        public String getElementAt(int i) { return strings[i]; }
                });
                LT_Texto.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
                        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                                LT_TextoValueChanged(evt);
                        }
                });
                jScrollPane1.setViewportView(LT_Texto);

                BT_Insertar.setText("Insertar");
                BT_Insertar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BT_InsertarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(56, 56, 56)
                                                                                .addComponent(BTCopia)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(TFTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                                                        .addComponent(LBDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(BT_Insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(LB_Seleccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGap(0, 181, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(TFTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BTCopia)
                                        .addComponent(LBDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(BT_Insertar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LB_Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 80, Short.MAX_VALUE)))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
        private void BTCopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCopiaActionPerformed
                // TODO: add your handling code here:
		LBDestino.setText(TFTexto.getText());
        }//GEN-LAST:event_BTCopiaActionPerformed

        private void TFTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFTextoKeyTyped
                // TODO add your handling code here:
		if (!Character.isLetterOrDigit(evt.getKeyChar())) {	// Si no es ni letra ni digito
			evt.consume();	// Elimina evento
		}
        }//GEN-LAST:event_TFTextoKeyTyped

        private void TFTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFTextoKeyReleased
                // TODO add your handling code here:
		BTCopia.setEnabled(TFTexto.getText().length() >= 3);
        }//GEN-LAST:event_TFTextoKeyReleased

        private void BT_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_InsertarActionPerformed
                // TODO add your handling code here:
		((javax.swing.DefaultListModel) LT_Texto.getModel()).addElement(LBDestino.getText());
        }//GEN-LAST:event_BT_InsertarActionPerformed

        private void LT_TextoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_LT_TextoValueChanged
                // TODO add your handling code here:
		if (LT_Texto.getSelectedIndex() == -1) {
			throw new NullPointerException();
		}
		LB_Seleccion.setText(String.format(LT_Texto.getSelectedValue() + "\t" + LT_Texto.getSelectedIndex()));
        }//GEN-LAST:event_LT_TextoValueChanged

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
			java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Eventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Eventos().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BTCopia;
        private javax.swing.JButton BT_Insertar;
        private javax.swing.JLabel LBDestino;
        private javax.swing.JLabel LB_Seleccion;
        private javax.swing.JList<String> LT_Texto;
        private javax.swing.JTextField TFTexto;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        // End of variables declaration//GEN-END:variables
}
