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
public class TareaMensa extends Tarea{
    
    private Envio VEnvio;
    private boolean IsStopped;
    
    public TareaMensa(Envio VEnvio){
        super();
        this.VEnvio=VEnvio;
        this.IsStopped=false;
    }

    
    // Información que la tarea manda a la interfaz
    public void Start(){ // Empezó 
        this.VEnvio.bCalcularImporte.setEnabled(false);
        this.VEnvio.bPararCalculo.setEnabled(true);
        this.VEnvio.bRealizarPago.setEnabled(false);
        this.VEnvio.taDetalleCalculo.setText("");
        this.VEnvio.taImporteDetallado.setText("");
        this.VEnvio.pbCalculo.setValue(0);
        this.VEnvio.lImporteTotal.setText("Importe Total:");
        this.IsStopped=false;
    }
    public void Finish(float ImporteTotal){ // Terminó e indica el importe total
        this.VEnvio.lImporteTotal.setText("Importe Total:"+ImporteTotal);
        this.VEnvio.bCalcularImporte.setEnabled(true);
        this.VEnvio.bPararCalculo.setEnabled(false);
        this.VEnvio.bRealizarPago.setEnabled(true);
    }
    public void DetalleDeCalculo(String Msg){ // Mensaje de detalle de cálculo
        this.VEnvio.taDetalleCalculo.setText(this.VEnvio.taDetalleCalculo.getText()+Msg+"\n");
        this.VEnvio.taDetalleCalculo.setSelectionStart(this.VEnvio.taDetalleCalculo.getText().length());
        this.VEnvio.taDetalleCalculo.setSelectionEnd(this.VEnvio.taDetalleCalculo.getText().length());
    }
    public void InicioCalculo(){ // Se inicia un cálculo
        this.VEnvio.pbCalculo.setValue(0);
    }
    public void FinCalculo(){ // Se termina el cálculo empezado
        this.VEnvio.pbCalculo.setValue(100);
    }
    public void ProporcionCalculo(float P){ // Se indica en [0;1] la proporción del cálculo realizado
        this.VEnvio.pbCalculo.setValue((int)(P*100));
    }
    public void DetalleDeImporte(String Msg){ // Mensaje de detalle de cálculo
        this.VEnvio.taImporteDetallado.setText(this.VEnvio.taImporteDetallado.getText()+Msg+"\n");
    }
    // Información que el interfaz manda la tarea
    public boolean Stop(){ // Si retorna verdadero la tarea debe intentar terminar
        return IsStopped;
    }
    
    public void setStop(){
        IsStopped=true;
        this.VEnvio.bCalcularImporte.setEnabled(true);
        this.VEnvio.bPararCalculo.setEnabled(false);
        this.VEnvio.bRealizarPago.setEnabled(false);
    }
}
