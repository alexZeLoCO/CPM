/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meroquest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Rodriguez Lopez, Alejandro // UO281827 
 */
public class EntityHashMap {

	private final HashMap<Integer, Pair> data;

	public EntityHashMap (int size) {
		this.data = new HashMap<Integer, Pair> (size);
	}

	public int size(){
		return this.data.size();
	}

	public Integer put (String nombre, Integer key, Integer value) {
		Integer out = null;
		if (this.data.containsKey(key)) {
			out = this.data.get(key).getSegundo();
		}
		this.data.put(key, new Pair (nombre, value));
		return out;
	}

	public Pair get (Integer key) {
		return this.data.get(key);
	}

	@Override
	public String toString () {
		String out = "";
		Iterator<Map.Entry<Integer, Pair>> itr = this.data.entrySet().iterator();
		Map.Entry<Integer, Pair> current;
		while (itr.hasNext()) {
			current = itr.next();
			out+=current.getValue().getPrimero() + "\t" + current.getKey() + "  ~> " + current.getValue().getSegundo() + "\n";
		}
		return out;
	}
		
	public final class Pair {
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
