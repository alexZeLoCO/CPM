package jeroquest.units;

public class Wasp extends Monster {

	// initial values for the attributes
	protected static final int MOVEMENT = 0;
	protected static final int ATTACK = 1;
	protected static final int DEFENCE = 1;
	protected static final int BODY = 1;

	/**
	 * Create a Wasp from its name
	 *
	 * @param name name of the Wasp
	 */
	public Wasp(String name, int sides) {
		super(name, MOVEMENT, ATTACK, DEFENCE, BODY, sides);
	}

	public Wasp(String name, int ATTAK, int DEFENCE, int sides) {
		super(name, MOVEMENT, ATTAK, DEFENCE, BODY, sides);
	}

	// He protec he attak ^^
}
