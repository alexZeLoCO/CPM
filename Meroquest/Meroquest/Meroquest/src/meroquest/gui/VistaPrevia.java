/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meroquest.gui;

/**
 *
 * @author Rodriguez Lopez, Alejandro // UO281827
 */
public class VistaPrevia extends javax.swing.JFrame {

	/**
	 * Creates new form Debug
	 */
	public VistaPrevia() {
		initComponents();
		System.out.println("Creando vista previa");
	}

	/**
	 * Crea una nueva ventana de Vista Previa con referencia a master.
	 * 
	 * @param master Referencia a la ventana principal.
	 */
	public VistaPrevia(master master) {
		this();
		System.out.println("Creando vista previa con referencia a principal");
		this.vM = master;
		this.update();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jScrollPane2 = new javax.swing.JScrollPane();
		TA_Current = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		BT_Actualizar = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();

		setTitle("Meroquest | Vista Previa");

		TA_Current.setColumns(15);
		TA_Current.setRows(3);
		jScrollPane2.setViewportView(TA_Current);

		jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel1.setText("Preview");

		BT_Actualizar.setText("Update");
		BT_Actualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BT_ActualizarActionPerformed(evt);
			}
		});

		jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
												Short.MAX_VALUE)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel1)
												.addGap(84, 84, 84)
												.addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 74,
														Short.MAX_VALUE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(BT_Actualizar)))
								.addContainerGap()));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 27,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(BT_Actualizar)))
								.addGap(11, 11, 11)
								.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Actualiza la estructura.
	 * Si se están realizando cambios, se mostrarán los actuales.
	 */
	public void update() {
		System.out.println("Actualizando valores de vista previa");
		if (this.vM.vPe != null && this.vM.vPe.isVisible()) {
			this.TA_Current.setText(this.vM.vPe.getCurrent().toString());
		} else {
			this.TA_Current.setText(this.vM.getEntities().toString());
		}
	}

	/**
	 * Se ha pulsado el botón de actualizar.
	 * 
	 * @param evt
	 */
	private void BT_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BT_ActualizarActionPerformed
		// TODO add your handling code here:
		this.update();
	}// GEN-LAST:event_BT_ActualizarActionPerformed

	@Override
	public void setVisible(boolean b) {
		super.setVisible(b);
		if (b) {
			this.update();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel.
		 * For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VistaPrevia().setVisible(true);
			}
		});
	}

	master vM;
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton BT_Actualizar;
	private javax.swing.JTextArea TA_Current;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JSeparator jSeparator1;
	// End of variables declaration//GEN-END:variables
}
