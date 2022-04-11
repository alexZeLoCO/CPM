/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4a;

/**
 *
 * @author Usuario
 */
abstract public class Tarea implements SincroForeBack {
    
    // Métodos para especificar la tarea a realizar
    private int SumaMin=100;
    private float SegsIte=0.1F;
    public void setSumaMin(int SumaMin)
    {
        this.SumaMin=SumaMin;
    }
    public void setSegsInte(float SegsIte)
    {
        this.SegsIte=SegsIte;    }
            
    public void Run()
    {
     System.out.println("Start");
     Start();// Indica que empieza
     
     java.util.Random RandGen = new java.util.Random();
     float SumaAct=0.0F;
     int Iters=0;
     while(SumaAct<SumaMin)    
     {
        Iters++;
        Duerme(); // Simula una tarea no interrumpida
        if(Stop()) // El interfaz informa al proceso
            break;  // Fuerza a terminar

        float Sumando=RandGen.nextFloat(); // random float in [0, 1]
        SumaAct+=Sumando;
        
        ProportionExecuted(SumaAct/SumaMin); // Informar al interfaz
        
        NuevoSumando(Sumando,SumaAct); // Informar al interfaz
        Message(""+Iters+" iteraciones");
     }
     Finish(); // Indica que termina
    }
    
    // Métodos llamados por Run
    private void Duerme()
    {
        try
        {
            Thread.sleep((int)(SegsIte*1000));
        }
        catch(java.lang.InterruptedException E){}
    }
}
