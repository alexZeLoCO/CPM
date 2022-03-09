/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package meroquest.tasks;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public interface Game {
	
	/**
	 * Procedimiento de iniciación.
	 * Se ejecuta al inicio de run().
	 */
	public void start ();

	/**
	 * Procedimiento de finalización.
	 * Se ejecuta al final de run().
	 * @param g Estado final de partida. 
	 */
	public void finish (jeroquest.logic.Game g);

	/**
	 * Tare a ejecutar.
	 */
	public void run();
}
