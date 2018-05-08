package Person;

public class Summoner extends Spirit {

	final String NATION = "Vivé la Britannia";

	private String nationality;

	Summoner() {

		nationality = NATION;

	}

	public Summoner(String birthname) {

		setName(birthname);
	}

	public String getInfo() {

		return "Name: " + getName() + "\nAge: " + age + "\nNationality: " + nationality + "\n";
	}

	public void setNationality(String nationality) {

		this.nationality = nationality;

	}

	String getNationality() {
		return nationality;
	}

	void sayName() {
		System.out.println("I will not falter, for I am " + getName());
	}

	public int takeDamage(int damage) {

		this.lifepoints -= damage * 1.2;

		return lifepoints;
	}

	@Override
	public void joinFaction(String team) {
		
		faction = team;

	}
}
