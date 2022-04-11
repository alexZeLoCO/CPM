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
public abstract class Tarea implements SincroForeBack{

    // Información que debe ser indicada a la clase
    private boolean Seguro;
    private int PagoAplazado; // Aplazamiento en meses. -1 indica que no hay aplazamiento 
    
    // Constrctor
    Tarea(){
        Seguro=false;
        PagoAplazado=-1;
    }
    
    public void setSeguro(boolean Seguro){
        this.Seguro=Seguro;
    }
    
    public void setPagoApazado(int PagoAplazado){
        this.PagoAplazado=PagoAplazado;
    }
            
    
    // Lanzar la tarea
    public void Run(){
        Start();

        // Tarjeta
        float Importe=40;
        DetalleDeImporte("Tarifa 40€");
        DetalleDeCalculo("Comprobando tarjeta");
        InicioCalculo();
        for(int i=0;i<10;i++){
            Duerme(0.25F);
	while (pause()) {
	Duerme(0.25F);
	}
            ProporcionCalculo((i+1)/10F);
            DetalleDeCalculo(" Condicón "+(char)((int)'A'+i)+" OK");
            if(Stop()) return;
        }
        FinCalculo();
        DetalleDeCalculo("Targeta OK");
        DetalleDeImporte("Targeta 5€");
        Importe=Importe+5;
        
	while (pause()) {
	Duerme(0.25F);
	}

        // Seguro
        if(Seguro){
            DetalleDeCalculo("Buscando el mejor seguro");
            InicioCalculo();
            for(int i=0;i<5;i++){
                Duerme(0.5F);
	while (pause()) {
	Duerme(0.25F);
	}
                ProporcionCalculo((i+1)/5F);
                DetalleDeCalculo(" Seguro "+(char)((int)'A'+i)+" "+(2+i)+"€");
                if(Stop()) return;
            }
            FinCalculo();            
            DetalleDeCalculo("Seguro más barato: 2€");
            DetalleDeImporte("Seguro 2€");
            Importe=Importe+2;
        } // fin Seguro
        
	while (pause()) {
	Duerme(0.25F);
	}

        if(PagoAplazado>0){
            float CostePlazos=0;
            DetalleDeCalculo("calculando coste de cada mes");
            InicioCalculo();
            for(int i=0;i<PagoAplazado;i++){
                Duerme(0.5F);
	while (pause()) {
	Duerme(0.25F);
	}
                ProporcionCalculo((i+1.0F)/PagoAplazado);
                DetalleDeCalculo(" Mes "+(i+1)+" 0.5€");
                CostePlazos=CostePlazos+0.5F;
                if(Stop()) return;
            }
            FinCalculo();            
            DetalleDeCalculo("Total coste aplazamiento: "+CostePlazos+"€");
            DetalleDeImporte("Coste aplazamiento: "+CostePlazos+"€");
            Importe=Importe+CostePlazos;
        } // Fin Pago Aplazado
        
        DetalleDeImporte("Importe total: "+Importe+"€");
        Finish(Importe);
    }
            
    // Métodos llamados por Run
    private void Duerme(float SegsIte)
    {
        try
        {
            Thread.sleep((int)(SegsIte*1000));
        }
        catch(java.lang.InterruptedException E){}
    }     
}
