/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public class TaskMeroquest extends Task {

	private boolean isStopped;
	private master master;

	public TaskMeroquest (master master) {
		this.master = master;
	}

	@Override
	public void start() {
		this.isStopped = false;
	}

	@Override
	public void finish() {
		this.master.BT_Task.setEnabled(true);
		this.master.BT_StopTask.setEnabled(false);
		JOptionPane.showMessageDialog(null, "Fin de estudio:Han ganado " + this.getHeroesWin() + " veces. Los héroes ganarán con una probabilidad de: " + ((float)this.getHeroesWin()) / this.getOriginalTarget(), "Informe", JOptionPane.INFORMATION_MESSAGE);	
	}

	public void setStop () {
		this.isStopped = true;
	}

	@Override
	public boolean stop() {
		return this.isStopped;
	}

	@Override
	public void update() {
		this.master.LB_Task.setText(String.format("%d", this.target));
		this.master.PB_Task.setValue(this.originalTarget - this.target);
	}
}