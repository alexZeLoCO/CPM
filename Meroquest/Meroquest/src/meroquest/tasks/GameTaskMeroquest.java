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
		this.vM = master;
	}

	@Override
	public void start () {

	}	

	@Override
	public void finish (jeroquest.logic.Game g) {
		this.vM.vPp.showDialog(g);
	}

}
