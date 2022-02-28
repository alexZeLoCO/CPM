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
	
	void run();

	void start();
	void finish();

	void update();

	boolean stop();
}
