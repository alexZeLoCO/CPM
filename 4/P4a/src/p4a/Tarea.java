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
    private int Iters=100;
    private float SegsIte=0.1F;
    public void setIteraciones(int Iters)
    {
        this.Iters=Iters;
    }
    public void setSegsInte(float SegsIte)
    {
        this.SegsIte=SegsIte;    
    }
            
    public void Run()
    {
        System.out.println("Start");
     Start();// Indica que empieza
     
     /*
      while (iteraciones-- != 0 && !this.stop()) {
     }
     */
     for(int i=1;i<=Iters;i++)
     {
        Duerme(); // Simula una tarea no interrumpida
        if(Stop()) // El interfaz informa al proceso
            break;  // Fuerza a terminar

        ProportionExecuted(1F*i/Iters); // Informar al interfaz
        
        if((i%7)==0)
            Message("Iteración "+i+" múltiplo de 7"); // Informar al interfaz
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
