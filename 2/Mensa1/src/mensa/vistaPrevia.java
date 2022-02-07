/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mensa;

/**
 *
 * @author UO281827 // Rodriguez Lopez, Alejandro
 */
public class VistaPrevia extends javax.swing.JFrame {
public VistaPrevia() {
 initComponents();
 Ori=""; Des=""; Texto="";
 }

private void repinta() {
 	String TextoFinal="";
	 if(Ori.length()>0)
 		TextoFinal="Origen: "+Ori+"\n";
	 if(Des.length()>0)
 		TextoFinal=TextoFinal+"Destino: "+Des+"\n";
 	TextoFinal=TextoFinal+Texto;
 	this.TA_vistaPrevia.setText(TextoFinal);
 }

public void setDestinatario(String Des){
	 this.Des=Des;
 	repinta();
 }

public void setRemitente(String Ori){
	 this.Ori=Ori;
 	repinta();
 }

public void setTexto(String Texto){
	 this.Texto=Texto;
	 repinta();
 }

public void setColorFondo(java.awt.Color C){
	 this.TA_vistaPrevia.setBackground(C);
 }

private String Des;
private String Ori;
private String Texto;

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                TA_vistaPrevia = new javax.swing.JTextArea();

                TA_vistaPrevia.setEditable(false);
                TA_vistaPrevia.setColumns(20);
                TA_vistaPrevia.setRows(5);
                jScrollPane1.setViewportView(TA_vistaPrevia);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VistaPrevia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new VistaPrevia().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JTextArea TA_vistaPrevia;
        javax.swing.JScrollPane jScrollPane1;
        // End of variables declaration//GEN-END:variables
}
