/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Rodriguez Lopez, Alejandro // UO281827 
 */
public class EntityHashMap implements Serializable {

	private final HashMap<Integer, Pair<String, Integer>> data;
	private int entities;

	public EntityHashMap (int size) {
		System.out.println("HashMap de entidades creado en funcion de entero");
		this.entities = 0;
		this.data = new HashMap<Integer, Pair<String, Integer>> (size);
	}

	public EntityHashMap (String[] elems) {
		this(elems.length);
		System.out.println("HashMap de entidades creado en funcion de cadenas de entidades");
		for (String s : elems) {
			this.data.put(s.hashCode(), new Pair <String, Integer> (s, 0));
		}
	}

	public EntityHashMap (EntityHashMap ref) {
		this(ref.size());
		System.out.println("HashMap de entidades creado en funcion de HashMap de entidades copia");
		for (Map.Entry<Integer, Pair<String, Integer>> e : ref.data.entrySet()) {
			this.put(e.getValue().getPrimero(), e.getValue().getSegundo());
		}
	}

	public int size(){
		return this.data.size();
	}

	public int nEntities () {
		return this.entities;
	}

	public Integer put (String nombre, Integer value) {
		Integer out = null;
		if (this.data.containsKey(nombre.hashCode())) {
			out = this.data.get(nombre.hashCode()).getSegundo();
			this.entities-=this.data.get(nombre.hashCode()).getSegundo();
		}
		this.data.put(nombre.hashCode(), new Pair (nombre, value));
		this.entities+=this.data.get(nombre.hashCode()).getSegundo();
		System.out.printf("Elemento de hashmap incluido / sustituido:\t%s\n", this.data.get(nombre.hashCode()).toString());
		return out;
	}

	public Pair get (Integer key) {
		return this.data.get(key);
	}

	public Pair get (String nombre) {
		return this.get(nombre.hashCode());
	}

	public Set <Map.Entry<Integer, Pair<String, Integer>>> entrySet () {
		System.out.println("Retornando entry set de HashMap");
		return this.data.entrySet();
	}

	@Override
	public String toString () {
		System.out.println("Retornando cadena descriptiva del HashMap");
		String out = "Entidad\tCódigo ~> Cantidad\n";
		Iterator<Map.Entry<Integer, Pair<String, Integer>>> itr = this.data.entrySet().iterator();
		Map.Entry<Integer, Pair<String, Integer>> current;
		while (itr.hasNext()) {
			current = itr.next();
			out+=current.getValue().getPrimero() + "\t" + current.getKey() + "  ~> " + current.getValue().getSegundo() + "\n";
		}
		return out;
	}
}
