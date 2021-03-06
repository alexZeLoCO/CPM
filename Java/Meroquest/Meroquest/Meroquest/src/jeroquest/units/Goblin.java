package jeroquest.units;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Goblin extends Monster implements Guard,Sabroso {

	// initial values for the attributes
	protected static final int MOVEMENT = 10;
	protected static final int ATTACK = 2;
	protected static final int DEFENCE = 1;
	protected static final int BODY = 1;

	/**
	 * Create a goblin from its name
	 * 
	 * @param name goblin's name
	 */
	public Goblin(String name, int sides) {
		super(name, MOVEMENT, ATTACK, DEFENCE, BODY, sides);
	}

	public int sangrado () {
		return 1;
	}

	/************************************************
	 * Interface Piece implementation
	 **********************************************/

	public void guard() {
		System.out.printf("%s is guarding",this.getName());
	}

	/**
	 * Generate a text representation of the character in the board (implementing an
	 * abstract method)
	 * 
	 * @return the text representation of the object in the board
	 */
	public char toChar() {
		return 'G';
	}

	/************************************************
	 * Interface GraphicElement implementation
	 **********************************************/

	// Goblin icon
	private static Icon icon = new ImageIcon(ClassLoader.getSystemResource("jeroquest/gui/images/goblin.png"));

	public Icon getImage() {
		return icon;
	}

}
