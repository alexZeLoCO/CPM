/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.data;

import java.io.Serializable;

/**
 *
 * @author Rodríguez López, Alejandro // UO281827
 * @param <A> Key (Nombre de entidad)
 * @param <B> Value (Número de entidades)
 */
public class Pair<A, B> implements Serializable {

	private A primero;
	private B segundo;

	/**
	 * Crea un nuevo par dado un nombre y un valor.
	 * 
	 * @param a Nombre de la entidad.
	 * @param b Número de entidades.
	 */
	public Pair(A a, B b) {
		System.out.println("Creando par en funcion de dos valores");
		this.primero = a;
		this.segundo = b;
	}

	/**
	 * Asigna un nombre al par.
	 * 
	 * @param a Nombre.
	 */
	public void setPrimero(A a) {
		this.primero = a;
	}

	/**
	 * Asigna un valor asociado al par.
	 * 
	 * @param b Valor asociado.
	 */
	public void setSegundo(B b) {
		this.segundo = b;
	}

	/**
	 * Retorna el primer elemento del par.
	 * 
	 * @return Primer elemento del par. (Nombre)
	 */
	public A getFirst() {
		return this.primero;
	}

	/**
	 * Retorna el segundo elemento del par.
	 * 
	 * @return Segundo elemento del par. (Valor asociado)
	 */
	public B getSecond() {
		return this.segundo;
	}

	@Override
	public String toString() {
		return String.format("(%s  ~> %s)", this.getFirst(), this.getSecond());
	}

}
