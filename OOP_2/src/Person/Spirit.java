package Person;

public abstract class Spirit {

	private String name = "";
	protected int age = 0;
	boolean hasKilledYet = false;
	protected int lifepoints = 100;
	String faction = "none";

	void sayName() {

		System.out.println("My name is: " + getName());

	}

	public void setAge(int age) {

		this.age = age;

	}

	void killSomeone() {

		hasKilledYet = true;
	}

	int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int takeDamage(int damage) {

		this.lifepoints -= damage;

		return lifepoints;
	}

	public int healLifepoints(int heal) {

		this.lifepoints += heal;

		return lifepoints;

	}

	public void setLifepoints(int life) {
		this.lifepoints = life;
	}

	public int getLifepoints() {
		return lifepoints;

	}

	public abstract void joinFaction(String team);
}
