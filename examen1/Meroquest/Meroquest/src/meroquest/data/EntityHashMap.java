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
@SuppressWarnings ("unchecked")
public class EntityHashMap implements Serializable {

	private final HashMap<Integer, Pair<String, Integer>> data;
	private int entities;

	/**
	 * Crea una nueva tabla Hash de Entidades
	 * @param size Tamaño de la tabla.
	 */
	public EntityHashMap (int size) {
		System.out.println("HashMap de entidades creado en funcion de entero");
		this.entities = 0;
		this.data = new HashMap<Integer, Pair<String, Integer>> (size);
	}

	/**
	 * Crea una nueva tabla Hash de Entidades cuyas entradas serán los HashCode de las Strings.
	 * @param elems HashCode de los elementos.
	 */
	public EntityHashMap (String[] elems) {
		this(elems.length);
		System.out.println("HashMap de entidades creado en funcion de cadenas de entidades");
		for (String s : elems) {
			this.data.put(s.hashCode(), new Pair <String, Integer> (s, 0));
		}
	}

	/**
	 * Crea una nueva tabla Hash de Entidades igual a una concreta.
	 * @param ref  Hash de referencia.
	 */
	public EntityHashMap (EntityHashMap ref) {
		this(ref.size());
		System.out.println("HashMap de entidades creado en funcion de HashMap de entidades copia");
		for (Map.Entry<Integer, Pair<String, Integer>> e : ref.data.entrySet()) {
			this.put(e.getValue().getPrimero(), e.getValue().getSegundo());
		}
	}

	/**
	 * Retorna el tamaño de la tabla Hash de Entidades.
	 */
	public int size(){
		return this.data.size();
	}

	/**
	 * Retorna el número de entidades de la tabla Hash.
	 */
	public int nEntities () {
		return this.entities;
	}

	/**
	 * Añade el par de nombre y valor. Si existe ya el par, se actualiza.
	 * 
	 * @param nombre Nombre de la entidad.
	 * @param value Valor asociado (número de entidades)
	 * @return null si no existía elemento. El valor anterior si ya existía.
	 */
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

	/**
	 * Retorna el par correspondiente a un dado valor Hash.
	 * @param key HashCode
	 * 
	 * @return Par nombre/valor correspondiente al HashCode.
	 */
	public Pair get (Integer key) {
		return this.data.get(key);
	}

	/**
	 * Retorna el par correspondiente a un nombre dado.
	 * @param nombre nombre correspondiente al par.
	 * 
	 * @return Par nombre/valor correspondiente al nombre.
	 */
	public Pair get (String nombre) {
		return this.get(nombre.hashCode());
	}

	/**
	 * Retorna la estructura Hash en forma de set.
	 * 
	 * @return Set de entradas de la tabla Hash.
	 */
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
