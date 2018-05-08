import java.util.Random;

import Person.Archer;
import Person.Hero;
import Person.Lancer;
import Person.Saber;
import Person.Summoner;

public class Main {

	public static void main(String[] args) {

		// Erstellen der Speicherarrays

		final int GROUP = 7;
		Random rnd = new Random();

		Hero[] grailwar = new Hero[GROUP];

		

			Saber Hero1 = new Saber();
			Archer Hero2 = new Archer();
			Lancer Hero3 = new Lancer();
			

			System.out.println(Hero3.weapon.getClass());

		// Namen der Helden

		Hero1.setName("Mordred");
		Hero2.setName("Atalanta");
		Hero3.setName("Achilles");
		



		// Faktion

		Hero1.isEvil = false;
		Hero2.isEvil = false;
		Hero3.isEvil = true;
	

		// Menge an Mana

		Hero1.mana = 1000;
		Hero2.mana = 350;
		Hero3.mana = 50;
		

		Hero1.setNationality("British");
		Hero2.setNationality("Greek");
		Hero3.setNationality("Greek");
		
		

		
		

		Summoner Jeanne = new Summoner("Jeanne D' Arc");
		Jeanne.setNationality("French");
		Jeanne.setAge(27);
		System.out.println(Jeanne.getInfo());
		
		
		System.out.println("Current Lifepoints: " + grailwar[0].getLifepoints());
		grailwar[0].takeDamage(20);
		System.out.println(grailwar[0].getName() + " has taken " + (100 - grailwar[0].takeDamage(0)) + " Damage!");
		System.out.println("Remaining Lifepoints: " + grailwar[0].getLifepoints());

		System.out.println();

		System.out.println("Current Lifepoints: " + Jeanne.getLifepoints());
		Jeanne.takeDamage(20);
		System.out.println(Jeanne.getName() + " has taken " + (100 - Jeanne.takeDamage(0)) + " Damage!");
		System.out.println("Remaining Lifepoints: " + Jeanne.getLifepoints());

		System.out.println();

		System.out.println("Current Lifepoints: " + Jeanne.getLifepoints());
		
		int cache = Jeanne.getLifepoints();
		Jeanne.healLifepoints(50);
		
		System.out.println(Jeanne.getName() 
				+ " has healed " 
				+ (  Jeanne.getLifepoints() - cache 
				+ " Lifepoints!"));
		
		System.out.println("Remaining Lifepoints: " + Jeanne.getLifepoints());
		
		
	}

}
