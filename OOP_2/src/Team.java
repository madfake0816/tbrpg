import Person.Hero;
import Person.Summoner;
import Person.Spirit;

public class Team {
Summoner summoner;
Hero hero;

void getInfo() {
	System.out.println(summoner.getName()+" "+hero.getName());
}
}
