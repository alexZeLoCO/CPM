/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package meroquest.gui;

import java.awt.Color;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public class Dado extends javax.swing.JDialog {

	/**
	 * Creates new form Dado
	 */
	public Dado(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		System.out.println("Creando pantalla de dado");
		this.pOk = false;
		this.dado = Integer.parseInt(this.TF_Dado.getText());
		this.LT_Bin.setModel(new javax.swing.DefaultListModel<String>());
		this.LB_Bin.setBackground(Color.CYAN);
		this.LB_Bin.repaint();
	}

	public Dado () {
		this(null, true);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                BT_Cancelar = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                TF_Dado = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                BT_Ok = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                LB_Bin = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                LT_Bin = new javax.swing.JList<>();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Meroquest | Dado");

                BT_Cancelar.setText("Cancelar");
                BT_Cancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BT_CancelarActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel1.setText("Dado");

                jLabel2.setText("Lados del dado:");

                TF_Dado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
                TF_Dado.setText("1");
                TF_Dado.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                TF_DadoKeyTyped(evt);
                        }
                });

                jLabel3.setText("(Por defecto 6)");

                BT_Ok.setText("Aceptar");
                BT_Ok.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BT_OkActionPerformed(evt);
                        }
                });

                jLabel4.setText("Dado:");

                LB_Bin.setBackground(new java.awt.Color(0, 255, 204));
                LB_Bin.setText("1");
                LB_Bin.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseReleased(java.awt.event.MouseEvent evt) {
                                LB_BinMouseReleased(evt);
                        }
                });

                jScrollPane1.setViewportView(LT_Bin);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(BT_Cancelar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(BT_Ok))
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LB_Bin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(TF_Dado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel3)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(TF_Dado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(LB_Bin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(BT_Cancelar)
                                                        .addComponent(BT_Ok))))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

	/**
	 * Revisa si se ha salido utilizando el botón Ok.
	 * 
	 * @return true si se han confirmado los cambios. False en caso contrario.
	 */
	public boolean isOk () {
		return this.pOk;
	}

	/**
	 * Retorna el número de caras asignadas al dado.
	 * 
	 * @return Número de caras.
	 */
	public int getDado () {
		return this.dado;
	}

	/**
	 * Muestra por pantalla la ventana.
	 * 
	 * @return True si se ha salido con el Ok.
	 */
	public boolean showDialog () {
		System.out.println("Mostrando pantalla");
		this.pOk = false;
		this.setVisible(true);
		this.TF_Dado.setText(String.format("%d", this.getDado()));
		return this.isOk();
	}

	/**
	 * Se ha pulsado el botón de cancelar.
	 * 
	 * @param evt 
	 */
        private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
                // TODO add your handling code here:
	System.out.println("Eleccion cancelada");
	this.setVisible(false);
        }//GEN-LAST:event_BT_CancelarActionPerformed

	/**
	 * Se ha pulsado el bónto Ok.
	 * 
	 * @param evt 
	 */
        private void BT_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_OkActionPerformed
                // TODO add your handling code here:
	System.out.println("Eleccion aceptada");
	this.pOk = true;
	this.setVisible(false);
        }//GEN-LAST:event_BT_OkActionPerformed

        private void LB_BinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB_BinMouseReleased
                // TODO add your handling code here:
	javax.swing.DefaultListModel<String> m = (javax.swing.DefaultListModel<String>)
			this.LT_Bin.getModel();
	m.addElement(this.TF_Dado.getText() + " (" + this.LB_Bin.getText() + ")\n");
        }//GEN-LAST:event_LB_BinMouseReleased

        private void TF_DadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_DadoKeyTyped
	if (Integer.parseInt("" + evt.getKeyChar()) != 0 && Integer.parseInt("" + evt.getKeyChar()) !=1) {
    		System.out.println("Entrada denegada");
		evt.consume();
	} else { 
		if (!this.TF_Dado.getText().isBlank()) {
			System.out.println("No. " + Integer.parseInt(this.TF_Dado.getText(), 2));
			this.LB_Bin.setText(String.format("%d", Integer.parseInt(this.TF_Dado.getText(), 2)));
		}
	}            
        }//GEN-LAST:event_TF_DadoKeyTyped

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
			java.util.logging.Logger.getLogger(Dado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Dado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Dado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Dado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Dado dialog = new Dado(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	private boolean pOk;
	int dado;
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BT_Cancelar;
        private javax.swing.JButton BT_Ok;
        private javax.swing.JLabel LB_Bin;
        private javax.swing.JList<String> LT_Bin;
        private javax.swing.JTextField TF_Dado;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        // End of variables declaration//GEN-END:variables
}
