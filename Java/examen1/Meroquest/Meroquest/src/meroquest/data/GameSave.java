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

	/**
	 * Crea una nueva imagen de partida.
	 */
	public GameSave () {
		this(0,0,0,0,0,null);
	}

	/**
	 * Crea una nueva imagen de partida a partir de unos valores dados.
	 * 
	 * @param heroes Número de heroes
	 * @param monsters Número de monstruos
	 * @param rows Número de filas
	 * @param cols Número de columnas
	 * @param turns Número de turnos
	 * @param struct Estructura de entidades
	 */
	public GameSave (int heroes, int monsters, int rows, int cols, int turns, EntityHashMap struct) {
		System.out.println("Creando imagen de juego");
		this.entities = new EntityHashMap(struct);
		this.size = new Pair <Integer, Integer> (rows, cols);
		this.heroesMonsters = new Pair <Integer, Integer> (heroes, monsters);
		this.turns = turns;
	}

	/**
	 * Crea una nueva imagen de partida a partir de una ya existente.
	 * 
	 * @param gameSave Imagen de partida de referencia.
	 */
	public GameSave(GameSave gameSave) {
		this(gameSave.getHeroes(), gameSave.getMonsters(), gameSave.getRows(), gameSave.getCols(), gameSave.getTurns(), gameSave.getEntities());
	}

	/**
	 * Retorna el número de heroes.
	 * 
	 * @return Número de heroes en la imagen de partida.
	 */
	public int getHeroes () {
		return this.heroesMonsters.getPrimero();
	}

	/**
	 * Retorna el número de monstruos.
	 * 
	 * @return Número de monstruos en la imagen de partida.
	 */
	public int getMonsters () {
		return this.heroesMonsters.getSegundo();
	}

	/**
	 * Retorna el número de filas.
	 * 
	 * @return Número de filas en la imagen de partida.
	 */
	public int getRows () {
		return this.size.getPrimero();
	}

	/**
	 * Retorna el número de columnas.
	 * 
	 * @return Número de columnas en la imagen de partida.
	 */
	public int getCols () {
		return this.size.getSegundo();
	}

	/**
	 * Retorna el número de turnos.
	 * 
	 * @return Número de turnos en la imagen de partida.
	 */
	public int getTurns () {
		return this.turns;
	}

	/**
	 * Retorna la estructura Hash de Entidades.
	 * 
	 * @return Estructura EntitiesHashMap en la imagen de partida.
	 */
	public EntityHashMap getEntities() {
		return this.entities;
	}
}
