/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p4a;

/**
 *
 * @author Usuario
 */
public interface SincroForeBack {
    // Lanzar la tarea
    void Run();
    
    // Información que la tarea manda a la interfaz
    void Start(); // Empezó 
    void Finish(); // Terminó 
    void ProportionExecuted(float p); // Me indica la proporción de su ejecución
    void Message(String M); // Me indica que muestre un mensaje (Nº iteraciones)
    
    void NuevoSumando(float Sumando,float SumaAct); 
    // Indica a la interfaz el nuevo sumando usado y la suma actual

    // Información que el interfaz manda la tarea
    boolean Stop(); // Si retorna verdadero la tarea debe terminar
}
