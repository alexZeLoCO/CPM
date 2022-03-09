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
public interface SincroForeBack {
    // Lanzar la tarea
    void Run();
    
    // Información que la tarea manda a la interfaz
    void Start(); // Empezó 
    void Finish(float ImporteTotal); // Terminó e indica el importe total
    void DetalleDeCalculo(String Msg); // Mensaje de detalle de cálculo
    void InicioCalculo(); // Se inicia un cálculo
    void FinCalculo(); // Se termina el cálculo empezado
    void ProporcionCalculo(float P); // Se indica en [0;1] la proporción del cálculo realizado
    void DetalleDeImporte(String Msg); // Mensaje de detalle de cálculo

    // Información que el interfaz manda la tarea
    boolean Stop(); // Si retorna verdadero la tarea debe intentar terminar
}
