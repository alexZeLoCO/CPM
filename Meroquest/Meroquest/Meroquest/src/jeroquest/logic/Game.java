package jeroquest.logic;

import java.util.Map;
import jeroquest.boardgame.Board;
import jeroquest.boardgame.Dice;
import jeroquest.units.*;
import jeroquest.units.Character;
import meroquest.data.EntityHashMap;
import meroquest.data.Pair;

/**
 * Programming Methodology Practice. Jeroquest - An example of Object Oriented
 * Programming. Class Game - represents the state of a game and it is defined
 * as: a set of characters, the board where they move around, the current round
 * and the total number of rounds to play
 * 
 * @author Jorge Puente Peinador y Ramiro Varela Arias
 * @author Juan Luis Mateo
 * 
 */

public class Game {
	private Character characters[]; // characters in the game
	private Board board; // where the game takes place
	private int currentRound; // current round
	private int totalRounds; // maximum number of rounds to play

	/**
	 * Gets the total rounds of the game
	 * 
	 * @return the total number of rounds of the game
	 */
	public int getTotalRounds() {
		return totalRounds;
	}

	/**
	 * Set the total of rounds (it is a private method)
	 * 
	 * @param totalRounds the total number of rounds to play
	 */
	private void setTotalRounds(int totalRounds) {
		this.totalRounds = totalRounds;
	}

	/**
	 * Create a new game with parameters
	 * 
	 * @param numHeroes   total number of heroes to create
	 * @param numMonsters total number of monsters to create
	 * @param rows        height of the board to create
	 * @param columns     width of the board to create
	 * @param totalRounds total number of rounds to play
	 * @param struct      structure containing the number of entities
	 */
	public Game(int numHeroes, int numMonsters, int rows, int columns, int totalRounds, EntityHashMap struct,
			int sides) {
		// total number of rounds
		setTotalRounds(totalRounds);

		// Create a board with the given dimensions
		board = new Board(rows, columns);
		// Number of characters
		int barbarian = 0;
		int dwarf = 0;
		int mummy = 0;
		int goblin = 0;
		int swarm = 0;
		int vampire = 0;
		int guardian = 0;
		int virus = 0;

		for (Map.Entry<Integer, Pair<String, Integer>> e : struct.entrySet()) {
			switch ((String) e.getValue().getFirst()) {
				case ("Bárbaro"):
					barbarian = (Integer) e.getValue().getSecond();
					break;
				case ("Enano"):
					dwarf = (Integer) e.getValue().getSecond();
					break;
				case ("Momia"):
					mummy = (Integer) e.getValue().getSecond();
					break;
				case ("Goblin"):
					goblin = (Integer) e.getValue().getSecond();
					break;
				case ("Enjambre"):
					swarm = (Integer) e.getValue().getSecond();
					break;
				case ("Vampiro"):
					vampire = (Integer) e.getValue().getSecond();
					break;
				case ("Guardián"):
					guardian = (Integer) e.getValue().getSecond();
					break;
				case ("Virus"):
					virus = (Integer) e.getValue().getSecond();
					break;
			}
		}

		numHeroes -= guardian;

		// create the characters
		characters = new Character[numHeroes + numMonsters];

		// setting heroes
		for (int i = 0; i < barbarian; i++) {
			characters[i] = new Barbarian("Barbarian" + i, "<NoPlayer>", sides);
		}
		for (int i = 0; i < dwarf; i++) {
			characters[i + barbarian] = new Dwarf("Dwarf" + i, "<NoPlayer>", sides);
		}

		// setting monsters
		for (int i = 0; i < mummy; i++) {
			characters[i + numHeroes] = new Mummy("Mummy" + i, sides);
		}
		for (int i = 0; i < goblin; i++) {
			characters[i + numHeroes + mummy] = new Goblin("Goblin" + i, sides);
		}
		for (int i = 0; i < swarm; i++) {
			characters[i + numHeroes + mummy + goblin] = new Swarm("Swarm" + i, sides);
		}
		for (int i = 0; i < vampire; i++) {
			characters[i + numHeroes + mummy + goblin + swarm] = new Vampire("Vampire" + i, sides);
		}
		for (int i = 0; i < virus; i++) {
			characters[i + numHeroes + mummy + goblin + swarm + vampire] = new Virus("Virus" + i, sides);
		}

		// setting guardians
		for (int i = 0; i < guardian; i++) {
			characters[i + numHeroes + numMonsters - guardian] = new Guardian("Guardian" + i, sides);
		}

		// Rest of heroes
		for (int x = 0; x < numHeroes - barbarian - dwarf - guardian; x++)
			if (Dice.roll() % 2 == 0)// if even create a barbarian
				characters[x + dwarf + barbarian] = new Barbarian("Barbarian" + x, "<NoPlayer>", sides);
			else // if odd create a Dwarf
				characters[x + dwarf + barbarian] = new Dwarf("Dwarf" + x, "<NoPlayer>", sides);

		// Rest of monsters
		for (int y = 0; y < numMonsters - mummy - goblin - swarm - vampire - virus - guardian; y++) {
			switch (Dice.roll(5)) {
				case (1):
					characters[y + numHeroes + mummy + goblin + swarm + vampire] = new Mummy("Mummy" + y, sides);
					break;
				case (2):
					characters[y + numHeroes + mummy + goblin + swarm + vampire] = new Goblin("Goblin" + y, sides);
					break;
				case (3):
					characters[y + numHeroes + mummy + goblin + swarm + vampire] = new Swarm("Swarm" + y, sides);
					break;
				case (4):
					characters[y + numHeroes + mummy + goblin + swarm + vampire] = new Vampire("Vampire" + y, sides);
					break;
				case (5):
					characters[y + numHeroes + mummy + goblin + swarm + vampire] = new Virus("Virus" + y, sides);
			}
		}

		boolean leader = false;
		for (int i = 0; i < characters.length && !leader; i++) {
			if (characters[i] instanceof Vampire) {
				((Vampire) characters[i]).setLeader(true);
				leader = !leader;
			}
		}

		this.secureIntegrity();

		// first round
		currentRound = 1;
	}

	private void secureIntegrity() {
		int nulls = 0;
		for (int i = 0; i < this.characters.length; i++) {
			if (this.characters[i] == null) {
				for (int j = i; j < this.characters.length - 1; j++) {
					this.characters[j] = characters[j + 1];
				}
				nulls++;
			}
		}
		Character[] neu = new Character[this.characters.length - nulls];
		for (int i = 0; i < neu.length; i++) {
			neu[i] = this.characters[i];
		}
		this.characters = neu;
	}

	/**
	 * Get the current round in the game
	 * 
	 * @return the current round
	 */
	public int getCurrentRound() {
		return currentRound;
	}

	/**
	 * Set the current round
	 * 
	 * @param currentRound the new current round
	 */
	public void setCurrentRound(int currentRound) {
		this.currentRound = currentRound;
	}

	/**
	 * Get the character of the game
	 * 
	 * @return array with the character of the game
	 */
	public Character[] getCharacters() {
		return characters;
	}

	/**
	 * Get the board of the game
	 * 
	 * @return the board of the game
	 */
	public Board getBoard() {
		return board;
	}

	public String highestBody() { // Returns the name of the class with highest value for the total body points in
									// the current state of the game
		int cHeroes = 0;
		int cMonsters = 0;

		for (Character c : this.getCharacters()) {
			if (c instanceof Hero)
				cHeroes += c.getBody();
			else if (c instanceof Monster)
				cMonsters += c.getBody();
			// System.out.println(p.getClass());
		}
		if (cMonsters > cHeroes)
			return "Monsters";
		else if (cHeroes > cMonsters)
			return "Heroes";
		else
			return "Draw";
	}

	/**
	 * Generate a printable version of the object as String (Overridden method)
	 * 
	 * @return The printable version of the object as String
	 */
	@Override
	public String toString() {
		String s = "";
		for (int x = 0; x < characters.length; x++) {
			s += String.format("%s\n", characters[x]);
		}
		s += getBoard();
		return s;
	}

}
