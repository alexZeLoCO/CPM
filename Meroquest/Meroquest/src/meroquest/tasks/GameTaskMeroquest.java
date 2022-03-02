/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.tasks;

import meroquest.gui.master;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public class GameTaskMeroquest extends GameTask {
	
	private master vM;

	public GameTaskMeroquest (master master) {
		System.out.println("Creando tarea (GameTaskMeroquest) con referencia a principal");
		this.vM = master;
	}

	@Override
	public void start () {
		System.out.println("Iniciando tarea");
		this.vM.setEnabled(false);
	}	

	@Override
	public void finish (jeroquest.logic.Game g) {
		System.out.println("Finalizando tarea");
		this.vM.vPp.showDialog(g);
		this.vM.setEnabled(true);
	}

}
