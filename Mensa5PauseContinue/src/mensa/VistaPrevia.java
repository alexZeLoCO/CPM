/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensa;

/**
 *
 * @author quevedo
 */
public class VistaPrevia extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrevia
     */
    public VistaPrevia() {
        initComponents();
        
        Ori="";
        Des="";
        Texto="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taVistaPrevia = new javax.swing.JTextArea();

        getContentPane().setLayout(new java.awt.GridLayout());

        taVistaPrevia.setEditable(false);
        taVistaPrevia.setColumns(20);
        taVistaPrevia.setRows(5);
        jScrollPane1.setViewportView(taVistaPrevia);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void repinta(){
        String TextoFinal="";
        if(Ori.length()>0)
            TextoFinal="Origen:"+Ori+"\n";
        if(Des.length()>0)
            TextoFinal=TextoFinal+"Destino:"+Des+"\n";
        TextoFinal=TextoFinal+Texto;
        this.taVistaPrevia.setText(TextoFinal);
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
        this.taVistaPrevia.setBackground(C);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrevia().setVisible(true);
            }
        });
    }

    private String Des;
    private String Ori;
    private String Texto;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taVistaPrevia;
    // End of variables declaration//GEN-END:variables
}