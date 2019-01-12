package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * 
		 */
		
		int x2 = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if(x2==1) {
			isVacation=false;
		}
		else if(x2==2) {
			isVacation=true;
		}

		int x = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		if (x == 1) {
			isWeekday = false;
		} else {
			isWeekday = true;
		}
		if(isVacation=true && isWeekday=true)

		System.out.println(isWeekday);
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * in�?.
		 */

	}
}
