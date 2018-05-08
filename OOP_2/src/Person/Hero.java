package Person;

import Weapons.Weapon;

public class Hero extends Spirit {

	public boolean isEvil;
	public int mana;
	public int gold;
	final String NATION = "Vivé la Britannia";
	private String nationality = NATION;
	public Weapon weapon;

	public Hero() {

	}

	Hero(int money) {

		money = gold;

	}

	String getInfo() {

		return "Name: " + getName() + "\nClass: " + "\nNationality: " + nationality
				+ "\nIs this one evil: " + isEvil + "\nAmount of Mana: " + mana + "\nAmount of Gold: " + gold
				+ " Goldcoins" + "\n";

	}

	public void setNationality(String nationality) {

		this.nationality = nationality;

	}

	public String getNationality() {
		return nationality;

	}

	void sayName() {
		System.out.println("My true name is: " + getName());
	}

	@Override
	public void joinFaction(String team) {

		super.faction = team;

	}
	
}
