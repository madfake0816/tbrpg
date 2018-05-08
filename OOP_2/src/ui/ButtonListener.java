package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Person.Archer;
import Person.Hero;
import Person.Lancer;
import Person.Saber;

public class ButtonListener extends JFrame implements ActionListener {

	Hero hero = new Hero();
	int temp;
	JFrame heroClass;

	JButton heroSaber;
	JButton heroArcher;
	JButton heroLancer;

	JPanel heroPanel;

	JLabel heroLabel;

	public ButtonListener() {

		this.setTitle("Choice of Hero");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		heroPanel = new JPanel();

		heroLabel = new JLabel("Please choose your Hero:");

		heroSaber = new JButton("Saber");
		heroArcher = new JButton("Archer");
		heroLancer = new JButton("Lancer");

		heroSaber.addActionListener(this);
		heroArcher.addActionListener(this);
		heroLancer.addActionListener(this);

		heroPanel.add(heroLabel);
		heroPanel.add(heroSaber);
		heroPanel.add(heroArcher);
		heroPanel.add(heroLancer);

		this.add(heroPanel);

		this.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.heroSaber) {

			heroLabel.setText("You chose Saber as your Hero.");
			hero = new Saber();
			heroSaber.setVisible(false);
			heroArcher.setVisible(false);
			heroLancer.setVisible(false);
			temp = 1;

		} else if (e.getSource() == this.heroArcher) {

			heroLabel.setText("You chose Archer as your Hero.");
			hero = new Archer();
			heroSaber.setVisible(false);
			heroArcher.setVisible(false);
			heroLancer.setVisible(false);
			temp = 2;
		} else if (e.getSource() == this.heroLancer) {

			heroLabel.setText("You chose Lancer as your Hero.");
			hero = new Lancer();
			heroSaber.setVisible(false);
			heroArcher.setVisible(false);
			heroLancer.setVisible(false);
			temp = 3;
		}

	}

public int getTemp() {
	return temp;
	
}
}
