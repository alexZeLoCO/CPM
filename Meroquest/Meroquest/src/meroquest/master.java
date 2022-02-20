/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meroquest;

/**
 *
 * @author Rodriguez Lopez, Alejandro // UO281827
 */
public class master extends javax.swing.JFrame {

	/**
	 * Creates new form master
	 */
	public master() {
		initComponents();
		this.maxEntities = this.SL_Alto.getValue() * this.SL_Ancho.getValue();
		this.updateEntityNumber(this.maxEntities);
		this.SP_Ancho.setValue(this.SL_Ancho.getValue());
		this.SP_Alto.setValue(this.SL_Alto.getValue());
		this.SP_Turnos.setValue(this.SL_Turnos.getValue());
		this.SP_Monstruos.setValue(this.SL_Monstruos.getValue());
		this.SP_Heroes.setValue(this.SL_Heroes.getValue());
		//this.vPe = new PersonalizarEntidades (this);
		this.entities = new EntityHashMap (8);
		this.vD = new Debug (this);
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
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                SL_Ancho = new javax.swing.JSlider();
                SL_Alto = new javax.swing.JSlider();
                jLabel5 = new javax.swing.JLabel();
                SL_Turnos = new javax.swing.JSlider();
                SP_Ancho = new javax.swing.JSpinner();
                SP_Alto = new javax.swing.JSpinner();
                SP_Turnos = new javax.swing.JSpinner();
                jLabel6 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                SL_Heroes = new javax.swing.JSlider();
                SL_Monstruos = new javax.swing.JSlider();
                SP_Heroes = new javax.swing.JSpinner();
                SP_Monstruos = new javax.swing.JSpinner();
                BT_Personalizar = new javax.swing.JButton();
                BT_Iniciar = new javax.swing.JButton();
                jSeparator2 = new javax.swing.JSeparator();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                jMenu2 = new javax.swing.JMenu();
                MI_VistaPrevia = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
                jLabel1.setText("MEROQUEST");

                jLabel2.setText("TABLERO:");

                jLabel3.setText("Ancho:");

                jLabel4.setText("Alto:");

                SL_Ancho.setMaximum(10);
                SL_Ancho.setMinimum(1);
                SL_Ancho.setValue(5);
                SL_Ancho.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SL_AnchoStateChanged(evt);
                        }
                });

                SL_Alto.setMaximum(10);
                SL_Alto.setMinimum(1);
                SL_Alto.setValue(5);
                SL_Alto.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SL_AltoStateChanged(evt);
                        }
                });

                jLabel5.setText("Número de turnos:");

                SL_Turnos.setValue(20);
                SL_Turnos.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SL_TurnosStateChanged(evt);
                        }
                });

                SP_Ancho.setToolTipText("");
                SP_Ancho.setValue(5);
                SP_Ancho.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SP_AnchoStateChanged(evt);
                        }
                });

                SP_Alto.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SP_AltoStateChanged(evt);
                        }
                });

                SP_Turnos.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SP_TurnosStateChanged(evt);
                        }
                });

                jLabel6.setText("ENTIDADES:");

                jLabel7.setText("Héroes:");

                jLabel8.setText("Monstruos:");

                SL_Heroes.setValue(5);
                SL_Heroes.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SL_HeroesStateChanged(evt);
                        }
                });

                SL_Monstruos.setValue(5);
                SL_Monstruos.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SL_MonstruosStateChanged(evt);
                        }
                });

                SP_Heroes.setValue(5);
                SP_Heroes.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SP_HeroesStateChanged(evt);
                        }
                });

                SP_Monstruos.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                SP_MonstruosStateChanged(evt);
                        }
                });

                BT_Personalizar.setText("Personalizar entidades");
                BT_Personalizar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                BT_PersonalizarActionPerformed(evt);
                        }
                });

                BT_Iniciar.setText("Iniciar");

                jMenu1.setText("Archivo");
                jMenuBar1.add(jMenu1);

                jMenu2.setText("Opciones");

                MI_VistaPrevia.setText("Vista Previa");
                MI_VistaPrevia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                MI_VistaPreviaActionPerformed(evt);
                        }
                });
                jMenu2.add(MI_VistaPrevia);

                jMenuBar1.add(jMenu2);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(BT_Iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(BT_Personalizar)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel7))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(SL_Monstruos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(SP_Monstruos))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(SL_Heroes, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(SP_Heroes))))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator1)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5))
                                                                        .addComponent(jLabel6))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(SL_Alto, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                                                                        .addComponent(SL_Ancho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(SP_Ancho, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                                                                        .addComponent(SP_Alto)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(SL_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(SP_Turnos, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))))
                                                        .addComponent(jLabel2))
                                                .addGap(11, 11, 11))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(SL_Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SP_Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(SL_Alto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SP_Alto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(SL_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SP_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(SL_Heroes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SP_Heroes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(SL_Monstruos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SP_Monstruos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BT_Personalizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BT_Iniciar)
                                .addContainerGap(15, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

	public int getMaxEntities () {
		return this.maxEntities;
	}

	public int getMaxMonstruos () {
		return this.SL_Monstruos.getValue(); 
	}

	public EntityHashMap getEntities () {
		return this.entities;
	}

        private void BT_PersonalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PersonalizarActionPerformed
                // TODO add your handling code here:
	this.vPe = new PersonalizarEntidades (this);		// FIXME: I need all data to be updated to this point in vPe.
	this.vPe.setVisible(true);
	if (!vPe.isOk()) {
		this.entities = new EntityHashMap (this.vPe.getOriginal());
	}
        }//GEN-LAST:event_BT_PersonalizarActionPerformed

        private void SL_MonstruosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SL_MonstruosStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Monstruos.getValue().toString()) != this.SL_Monstruos.getValue()) {
		this.SP_Monstruos.setValue(this.SL_Monstruos.getValue());
	}
	this.updateEntityNumber(this.maxEntities);
        }//GEN-LAST:event_SL_MonstruosStateChanged

        private void SP_MonstruosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SP_MonstruosStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Monstruos.getValue().toString()) < 0) { 
		this.SP_Monstruos.setValue(0);
	}
	if (Integer.parseInt(this.SP_Monstruos.getValue().toString()) > this.SL_Monstruos.getMaximum()) {
		this.SP_Monstruos.setValue(this.SL_Monstruos.getMaximum());
	}
	if (Integer.parseInt(this.SP_Monstruos.getValue().toString()) != this.SL_Monstruos.getValue()) {
		this.SL_Monstruos.setValue(Integer.parseInt(this.SP_Monstruos.getValue().toString()));
	}
        }//GEN-LAST:event_SP_MonstruosStateChanged

        private void SL_HeroesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SL_HeroesStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Heroes.getValue().toString()) != this.SL_Heroes.getValue()) {
		this.SP_Heroes.setValue(this.SL_Heroes.getValue());
	}
	this.updateEntityNumber(this.maxEntities);
        }//GEN-LAST:event_SL_HeroesStateChanged

        private void SP_HeroesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SP_HeroesStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Heroes.getValue().toString()) < 0) { 
		this.SP_Heroes.setValue(0);
	}
	if (Integer.parseInt(this.SP_Monstruos.getValue().toString()) > this.SL_Heroes.getMaximum()) {
		this.SP_Heroes.setValue(this.SL_Heroes.getMaximum());
	}
	if (Integer.parseInt(this.SP_Heroes.getValue().toString()) != this.SL_Heroes.getValue()) {
		this.SL_Heroes.setValue(Integer.parseInt(this.SP_Heroes.getValue().toString()));
	}
        }//GEN-LAST:event_SP_HeroesStateChanged

        private void SL_TurnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SL_TurnosStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Turnos.getValue().toString()) != this.SL_Turnos.getValue()) {
		this.SP_Turnos.setValue(this.SL_Turnos.getValue());
	}
        }//GEN-LAST:event_SL_TurnosStateChanged

        private void SP_TurnosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SP_TurnosStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Turnos.getValue().toString()) < 0) { 
		this.SP_Turnos.setValue(0);
	}
	if (Integer.parseInt(this.SP_Turnos.getValue().toString()) > this.SL_Turnos.getMaximum()) {
		this.SP_Turnos.setValue(this.SL_Turnos.getMaximum());
	}
	if (Integer.parseInt(this.SP_Turnos.getValue().toString()) != this.SL_Turnos.getValue()) {
		this.SL_Turnos.setValue(Integer.parseInt(this.SP_Turnos.getValue().toString()));
	}
        }//GEN-LAST:event_SP_TurnosStateChanged

	// Size Options
        private void SL_AltoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SL_AltoStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Alto.getValue().toString()) != this.SL_Alto.getValue()) {
		this.SP_Alto.setValue(this.SL_Alto.getValue());
	}
	this.maxEntities = this.SL_Alto.getValue() * this.SL_Ancho.getValue();
	this.updateEntityNumber(this.maxEntities);
        }//GEN-LAST:event_SL_AltoStateChanged

        private void SP_AltoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SP_AltoStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Alto.getValue().toString()) < 0) { 
		this.SP_Alto.setValue(0);
	}
	if (Integer.parseInt(this.SP_Alto.getValue().toString()) > this.SL_Alto.getMaximum()) {
		this.SP_Alto.setValue(this.SL_Alto.getMaximum());
	}
	if (Integer.parseInt(this.SP_Alto.getValue().toString()) != this.SL_Alto.getValue()) {
		this.SL_Alto.setValue(Integer.parseInt(this.SP_Alto.getValue().toString()));
	}
        }//GEN-LAST:event_SP_AltoStateChanged

        private void SL_AnchoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SL_AnchoStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Ancho.getValue().toString()) != this.SL_Ancho.getValue()) {
		this.SP_Ancho.setValue(this.SL_Ancho.getValue());
	}
	this.maxEntities = this.SL_Alto.getValue() * this.SL_Ancho.getValue();
	this.updateEntityNumber(this.maxEntities);
        }//GEN-LAST:event_SL_AnchoStateChanged

        private void SP_AnchoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SP_AnchoStateChanged
                // TODO add your handling code here:
	if (Integer.parseInt(this.SP_Ancho.getValue().toString()) < 0) { 
		this.SP_Ancho.setValue(0);
	}
	if (Integer.parseInt(this.SP_Ancho.getValue().toString()) > this.SL_Ancho.getMaximum()) {
		this.SP_Ancho.setValue(this.SL_Ancho.getMaximum());
	}
	if (Integer.parseInt(this.SP_Ancho.getValue().toString()) != this.SL_Ancho.getValue()) {
		this.SL_Ancho.setValue(Integer.parseInt(this.SP_Ancho.getValue().toString()));
	}
        }//GEN-LAST:event_SP_AnchoStateChanged

        private void MI_VistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_VistaPreviaActionPerformed
                // TODO add your handling code here:
	this.vD.setVisible(true);
        }//GEN-LAST:event_MI_VistaPreviaActionPerformed

	private void updateEntityNumber (int maxEntities) {
		this.SL_Monstruos.setMaximum(maxEntities);
		this.SL_Monstruos.setValue(Math.min(this.SL_Monstruos.getValue(), this.SL_Monstruos.getMaximum()));
		this.SL_Heroes.setMaximum(this.maxEntities - this.SL_Monstruos.getValue());
		this.SL_Heroes.setValue(Math.min(this.SL_Heroes.getValue(), this.SL_Heroes.getMaximum()));
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
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new master().setVisible(true);
			}
		});
	}

	private int maxEntities;
	PersonalizarEntidades vPe;
	Debug vD;
	private EntityHashMap entities;
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton BT_Iniciar;
        private javax.swing.JButton BT_Personalizar;
        private javax.swing.JMenuItem MI_VistaPrevia;
        private javax.swing.JSlider SL_Alto;
        private javax.swing.JSlider SL_Ancho;
        private javax.swing.JSlider SL_Heroes;
        private javax.swing.JSlider SL_Monstruos;
        private javax.swing.JSlider SL_Turnos;
        private javax.swing.JSpinner SP_Alto;
        private javax.swing.JSpinner SP_Ancho;
        private javax.swing.JSpinner SP_Heroes;
        private javax.swing.JSpinner SP_Monstruos;
        private javax.swing.JSpinner SP_Turnos;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        // End of variables declaration//GEN-END:variables
}
