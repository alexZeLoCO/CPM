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
public class Pair<A, B> implements Serializable {

	private A primero;
	private B segundo;
	
	public Pair (A a, B b) {
		System.out.println("Creando par en funcion de dos valores");
		this.primero = a;
		this.segundo = b;
	}

	public void setPrimero (A a) {
		this.primero = a;
	}

	public void setSegundo (B b) {
		this.segundo = b;
	}

	public A getPrimero() {
		return this.primero;
	}

	public B getSegundo() {
		return this.segundo;
	}

	@Override
	public String toString () {
		return String.format("(%s  ~> %s)", this.getPrimero(), this.getSegundo());
	}

}
