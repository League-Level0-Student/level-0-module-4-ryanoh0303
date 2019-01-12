package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String y = JOptionPane.showInputDialog("how many nickels do you have?");

		int x = Integer.parseInt(y);

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer
		String y2 = JOptionPane.showInputDialog("How many dimes do you have?");

		int x2 = Integer.parseInt(y2);

		String y3 = JOptionPane.showInputDialog("How many quarters do you have?");
		int x3 = Integer.parseInt(y3);

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable
		int money = (x * 5) + (x2 * 10) + (x3 * 25);

		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + money);

	}
}
