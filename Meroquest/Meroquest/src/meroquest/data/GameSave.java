/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.data;

import java.io.Serializable;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827 
 */
public class GameSave implements Serializable {
	
	private EntityHashMap entities;
	private Pair<Integer, Integer> size;
	private Pair <Integer, Integer> heroesMonsters;
	private int turns;

	public GameSave () {
		this(0,0,0,0,0,null);
	}

	public GameSave (int heroes, int monsters, int rows, int cols, int turns, EntityHashMap struct) {
		this.entities = new EntityHashMap(struct);
		this.size = new Pair <Integer, Integer> (rows, cols);
		this.heroesMonsters = new Pair <Integer, Integer> (heroes, monsters);
		this.turns = turns;
	}

	public GameSave(GameSave gameSave) {
		this(gameSave.getHeroes(), gameSave.getMonsters(), gameSave.getRows(), gameSave.getCols(), gameSave.getTurns(), gameSave.getEntities());
	}

	public int getHeroes () {
		return this.heroesMonsters.getPrimero();
	}

	public int getMonsters () {
		return this.heroesMonsters.getSegundo();
	}

	public int getRows () {
		return this.size.getPrimero();
	}

	public int getCols () {
		return this.size.getSegundo();
	}

	public int getTurns () {
		return this.turns;
	}

	public EntityHashMap getEntities() {
		return this.entities;
	}
}
