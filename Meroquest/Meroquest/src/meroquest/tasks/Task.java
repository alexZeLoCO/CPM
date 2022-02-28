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
	private int heroesWin;

	private int heroes, monsters, rows, columns, turns;
	private EntityHashMap struct;

	public int getHeroesWin () {
		return this.heroesWin;
	}

	public int getOriginalTarget () {
		return this.originalTarget;
	}

	public void setTarget (int target) {
		this.target = target;
	}

	public void setHeroes (int heroes) {
		this.heroes = heroes;
	}

	public void setMonsters (int monsters) {
		this.monsters = monsters;
	}

	public void setRows (int rows) {
		this.rows = rows;
	}

	public void setCols (int cols) {
		this.columns = cols;
	}

	public void setTurns (int turns) {
		this.turns = turns;
	}

	public void setStruct (EntityHashMap struct) {
		this.struct = new EntityHashMap (struct);
	}

	public void run () {
		System.out.println("Start");
		start();

		this.heroesWin = 0;
		this.setTarget(10);
		this.originalTarget = this.target;

		while (!stop() && this.target-- > 0) {
			this.update();
			Jeroquest jq = new Jeroquest();
			jq.newGame(this.heroes, this.monsters, this.rows, this.columns, this.turns, this.struct, 6, 0);	
			if (jq.toPlay().highestBody().equals("Heroes")) {
				this.heroesWin++;
			}
			System.out.println("\n-----------------------------\n"
				        + "Iteraciones restantes: " + this.target + 
				           "\n-----------------------------\n");
		}

		finish();
	}
}

