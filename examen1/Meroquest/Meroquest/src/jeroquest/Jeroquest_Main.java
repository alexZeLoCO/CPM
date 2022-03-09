package jeroquest;
// Demo of the class Jeroquest

import jeroquest.logic.Jeroquest;
import meroquest.data.EntityHashMap;

/**
 * Main program to test the game Jeroquest
 * 
 * @author Jorge Puente Peinador
 * @author Juan Luis Mateo
 * @version 1.4
 *
 */
public class Jeroquest_Main {

	public static void main(String[] args) {
		Jeroquest jq = new Jeroquest();
		// let's play a game with 3 Heroes against 4 Monsters
		// in a board of 7 by 10
		// in 20 turns
		jq.newGame(7, 7, 5, 5, 12, new EntityHashMap(0), 20, 1);
		jq.toPlay();
	}

}
