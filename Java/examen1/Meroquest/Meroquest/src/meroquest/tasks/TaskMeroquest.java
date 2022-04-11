/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.tasks;

import javax.swing.JOptionPane;
import meroquest.gui.master;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public class TaskMeroquest extends Task {

	private long startTime;
	private long endTime;
	private boolean isStopped;
	private master master;

	public TaskMeroquest (master master) {
		System.out.println("Creando tarea (TaskMeroquest) con referencia a principal");
		this.master = master;
	}

	@Override
	public void start() {
		System.out.println("Iniciando tarea");
		this.isStopped = false;
		this.heroesWin = 0;
		this.setTarget(10);
		this.originalTarget = this.target;
		this.master.LB_Task.setEnabled(true);
		this.master.BT_Task.setEnabled(false);
		this.master.BT_StopTask.setEnabled(true);
		this.master.BT_Iniciar.setEnabled(false);
		this.startTime = System.nanoTime();
	}

	@Override
	public void finish() {
		this.endTime = System.nanoTime();
		System.out.println("Finalizando tarea");
		this.master.LB_Task.setEnabled(false);
		this.master.BT_Task.setEnabled(true);
		this.master.PB_Task.setValue(0);
		this.master.BT_StopTask.setEnabled(false);
		this.master.BT_Iniciar.setEnabled(true);
		this.master.LB_Detencion.setVisible(false);
		this.master.LB_Task.setText("");

		if (!stop()) {
			System.out.println("Mostrando resultado de tarea\n\tFin de estudio:Han ganado " + this.getHeroesWin() + " veces. Los héroes ganarán con una probabilidad de: " + ((float)this.getHeroesWin()) / this.getOriginalTarget() * 100 + "%.\nDuración de tarea: " + ((this.endTime - this.startTime)/Math.pow(10, 9)) + " Tiempo medio por juego: " + ((this.endTime - this.startTime)/Math.pow(10, 10)));
			JOptionPane.showMessageDialog(null, "Fin de estudio:Han ganado " + this.getHeroesWin() + " veces. Los héroes ganarán con una probabilidad de: " + ((float)this.getHeroesWin()) / this.getOriginalTarget() * 100 + "%.\nDuración de tarea: " + ((this.endTime - this.startTime)/Math.pow(10, 9)) + " Tiempo medio por juego: " + ((this.endTime - this.startTime)/Math.pow(10, 10)), "Informe", JOptionPane.INFORMATION_MESSAGE);	
		}
	}

	/**
	 * Ordena la detención de la tarea.
	 */
	public void setStop () {
		System.out.println("Enviando sennal de parada");
		this.isStopped = true;
	}

	@Override
	public boolean stop() {
		return this.isStopped;
	}

	@Override
	public void update() {
		System.out.println("Actualizando salida de interfaz con estado actual de la tarea");
		this.master.LB_Task.setText(String.format("%d", this.target));
		this.master.PB_Task.setValue(this.originalTarget - this.target);
	}
}