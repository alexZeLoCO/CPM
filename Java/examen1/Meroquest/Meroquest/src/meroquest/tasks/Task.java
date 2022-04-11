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
abstract public class Task implements SincroForeBack {
	
	protected int target;
	protected int originalTarget;
	int heroesWin;

	private int heroes, monsters, rows, columns, turns;
	private EntityHashMap struct;

	/**
	 * Retorna el número de veces que han ganado los héroes.
	 * 
	 * @return Número de victorias de los héroes.
	 */
	public int getHeroesWin () {
		return this.heroesWin;
	}

	/**
	 * Retorna el número objetivo de iteraciones.
	 * 
	 * @return Número objetivo de iteraciones.
	 */
	public int getOriginalTarget () {
		return this.originalTarget;
	}

	/**
	 * Asigna el número total de iteraciones
	 * 
	 * @param target Número total de iteraciones.
	 */
	public void setTarget (int target) {
		this.target = target;
	}

	/**
	 * Asigna el número de héroes.
	 * 
	 * @param heroes Número de héroes.
	 */
	public void setHeroes (int heroes) {
		this.heroes = heroes;
	}

	/**
	 * Asigna el número de monstruos.
	 * 
	 * @param monsters Número de monstruos.
	 */
	public void setMonsters (int monsters) {
		this.monsters = monsters;
	}

	/**
	 * Asigna el número de filas,
	 * 
	 * @param rows Número de filas.
	 */
	public void setRows (int rows) {
		this.rows = rows;
	}

	/**
	 * Asigna el número de columnas.
	 * 
	 * @param cols Número de columnas.
	 */
	public void setCols (int cols) {
		this.columns = cols;
	}

	/**
	 * Asigna el número de turnos.
	 * 
	 * @param turns Número de turnos.
	 */
	public void setTurns (int turns) {
		this.turns = turns;
	}

	/**
	 * Asigna la estructura de entidades.
	 * 
	 * @param struct Estructura de entidades a asignar.
	 */
	public void setStruct (EntityHashMap struct) {
		this.struct = new EntityHashMap (struct);
	}

	@Override
	public void run () {
		System.out.println("Ejecutando tarea");
		start();

		while (!stop() && this.target-- > 0) {
			this.update();
			Jeroquest jq = new Jeroquest();
			jq.newGame(this.heroes, this.monsters, this.rows, this.columns, this.turns, this.struct, 6, 100);	
			if (jq.toPlay().highestBody().equals("Heroes")) {
				this.heroesWin++;
			}
			System.out.println(	"\n-----------------------------\n"
					 + "Iteraciones restantes: " + this.target + 
					 "\n-----------------------------\n");
		}
		finish();
	}
}

