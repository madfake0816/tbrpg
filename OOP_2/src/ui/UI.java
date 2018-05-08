package ui;

import javax.swing.*;
import Person.*;
import Weapons.*;

public class UI {

	public static void main(String[] args) {

		Hero hero = new Hero();

		ButtonListener bl = new ButtonListener();

		bl.setVisible(true);

		int temp = bl.getTemp();
		switch (temp) {
		case 1:
			hero = new Saber();
			break;
		case 2:
			hero = new Archer();
			break;
		case 3:
			hero = new Lancer();
			break;
		}
		
		System.out.println(hero.getClass());

		// TODO Auto-generated method stub

		/*
		 * JFrame heroClass = new JFrame("Choice of Hero");
		 * 
		 * 
		 * JPanel heroPanel = new JPanel();
		 * 
		 * JLabel heroLabel = new JLabel("Please choose your Hero:");
		 * 
		 * JButton heroSaber = new JButton ("Saber"); JButton heroArcher = new JButton
		 * ("Archer"); JButton heroLancer = new JButton ("Lancer");
		 * 
		 * heroPanel.add(heroLabel); heroPanel.add(heroSaber);
		 * heroPanel.add(heroArcher); heroPanel.add(heroLancer);
		 * 
		 * 
		 * 
		 * heroClass.add(heroPanel);
		 * 
		 * 
		 * heroClass.pack();
		 * 
		 * heroClass.setVisible(true);
		 */

	}

}
