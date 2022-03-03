/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package meroquest.tasks;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public interface SincroForeBack {
	
	/**
	 * Tarea a ejecutar.
	 */
	void run();

	/**
	 * Procedimieto de iniciación.
	 * Se ejecuta al inicio de run().
	 */
	void start();

	/**
	 * Procedimiento de finalización.
	 * Se ejecuta al final de run().
	 */
	void finish();

	/**
	 * Actualiza la interfaz con el estado de la tarea.
	 */
	void update();

	/**
	 * Revisa si la tarea ha sido detenida.
	 * 
	 * @return true si se ha ordenado la detención. false en caso contario.
	 */
	boolean stop();
}
