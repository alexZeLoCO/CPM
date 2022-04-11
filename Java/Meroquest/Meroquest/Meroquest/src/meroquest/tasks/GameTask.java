/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.tasks;

import jeroquest.logic.Jeroquest;
import meroquest.data.EntityHashMap;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
abstract public class GameTask implements Game {

	private int heroes, monsters, rows, cols, turns, dice;
	private EntityHashMap struct;
	
	/**
	 * Asigna todos los atributos.
	 * @param heroes Número de héroes
	 * @param monsters Número de monstruos
	 * @param rows Número de filas
	 * @param cols Número de columnas
	 * @param turns Número de turnos
	 * @param dice Caras del dado
	 * @param struct Estructura de entidades
	 */
	public void setAll (int heroes, int monsters, int rows, int cols, int turns, int dice, EntityHashMap struct) {
		System.out.println("Asignando valores de tarea");
		this.heroes = heroes;
		this.monsters = monsters;
		this.rows = rows;
		this.cols = cols;
		this.turns = turns;
		this.dice = dice;
		this.struct = new EntityHashMap (struct);
	}

	@Override
	public void run() {
		System.out.println("Ejecutando tarea");
		start();

		Jeroquest jq = new Jeroquest();
		jq.newGame(this.heroes, this.monsters, this.rows, this.cols, this.turns, this.struct, this.dice, 500);
		finish(jq.toPlay());
	}
	
}
