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
	
	public void setAll (int heroes, int monsters, int rows, int cols, int turns, int dice, EntityHashMap struct) {
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
		start();

		Jeroquest jq = new Jeroquest();
		jq.newGame(this.heroes, this.monsters, this.rows, this.cols, this.turns, this.struct, this.dice, 500);
		jq.toPlay();

		finish();
	}
	
}
