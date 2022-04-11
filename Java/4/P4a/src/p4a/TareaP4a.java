/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4a;

/**
 *
 * @author Usuario
 */
public class TareaP4a extends Tarea {
    // Acceso al interfaz
    private VentanaP4a Inter;
    private boolean IsStoped;
    
    public TareaP4a(VentanaP4a Inter)
    {
        IsStoped=false;
        this.Inter=Inter;
    }
            
    // Información que manda a la interfaz
    public void Start()
    {
        Inter.PBarEjecuta.setValue(0);
        IsStoped=false;
    }
    
    public void Finish()
    {
        Inter.PBarEjecuta.setValue(100);

        // Permitir que se pueda volver a ejecutar
        Inter.BStop.setEnabled(false);        
        Inter.BEjecuta.setEnabled(true);
    }
    

    public void ProportionExecuted(float p)
    {
        Inter.PBarEjecuta.setValue((int)(p*100));
    }
    
    public void Message(String M)
    {
        Inter.LMensaje.setText(M);
    }
    
    // Información que el interfaz manda al proceso
    public void setStop()
    {
        // Indicar un Stop
        this.IsStoped=true;
    }

    
    public boolean Stop()
    {
        return IsStoped;
    }
    
}
