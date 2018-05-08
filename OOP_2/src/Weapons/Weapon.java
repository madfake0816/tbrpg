package Weapons;

public abstract class Weapon {

	protected String name = "not named";

	boolean isAncient = true;

	public  abstract void remastered();

	public void setName(String newName) {

		name = newName;
	}

	public String getName() {
		
		return name;
	}
}
