/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Rodriguez Lopez, Alejandro // UO281827 
 */
public class EntityHashMap implements Serializable {

	private final HashMap<Integer, Pair> data;
	private int entities;

	public EntityHashMap (int size) {
		this.entities = 0;
		this.data = new HashMap<Integer, Pair> (size);
	}

	public EntityHashMap (String[] elems) {
		this(elems.length);
		for (String s : elems) {
			this.data.put(s.hashCode(), new Pair (s, 0));
		}
	}

	public EntityHashMap (EntityHashMap ref) {
		this(ref.size());
		for (Map.Entry<Integer, Pair> e : ref.data.entrySet()) {
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
		return out;
	}

	public Pair get (Integer key) {
		return this.data.get(key);
	}

	public Pair get (String nombre) {
		return this.get(nombre.hashCode());
	}

	@Override
	public String toString () {
		String out = "Entidad\tCódigo ~> Cantidad\n";
		Iterator<Map.Entry<Integer, Pair>> itr = this.data.entrySet().iterator();
		Map.Entry<Integer, Pair> current;
		while (itr.hasNext()) {
			current = itr.next();
			out+=current.getValue().getPrimero() + "\t" + current.getKey() + "  ~> " + current.getValue().getSegundo() + "\n";
		}
		return out;
	}
		
	public final class Pair implements Serializable {
		private final String primero;
		private final Integer segundo;

		protected Pair (String primero, Integer segundo) {
			this.primero = primero;
			this.segundo = segundo;
		}

		public String getPrimero() {
			return this.primero;
		}

		public Integer getSegundo() {
			return this.segundo;
		}
	}
}
