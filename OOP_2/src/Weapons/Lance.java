package Weapons;

public class Lance extends Weapon {

	public String element = "none";

	public void setElement(String newElement) {
		element = newElement;
	}

	@Override
	public void remastered() {
		isAncient = false;
		
	}

}
