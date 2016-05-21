
// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {
		
	

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		
		// Convert their answer to an int using Integer.parseInt()
		// Ask the user how many dimes they have, and convert their answer
		

		// Ask the user how many quarters they have, and convert their answer
		
		// Calculate how much money the user has and save it in a double
		// variable
		//int nicksTotal = nicksNum * 5;
		//int dimesTotal = dimesNum * 10; 
		//int quartersTotal = quartersNum * 25;
		//int realSum = Integer.parseInt(sum);
		// Tell the user how much money they have
		int nickelsTotal = getNickelsAmount();
		int dimesTotal = getDimesAmount();
		int quartersTotal = getQuartersAmount();
		int sum = nickelsTotal + dimesTotal + quartersTotal;

		JOptionPane.showMessageDialog(null, "You have " + sum + " cents");
	}

	public static int getNickelsAmount() {
		// TODO Auto-generated method stub
		String nicks = JOptionPane.showInputDialog("How many nickels do you have?");
		int nicksNum = Integer.parseInt(nicks);
		int nicksTotal = nicksNum *5;
		return nicksTotal;
	}
	public static int getDimesAmount() {
		// TODO Auto-generated method stub
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimesNum = Integer.parseInt(dimes);
		int dimesTotal = dimesNum * 10;
		return dimesTotal;
	}
	public static int getQuartersAmount() {
		// TODO Auto-generated method stub
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quartersNum = Integer.parseInt(quarters);
		int quartersTotal = quartersNum * 25;
		return quartersTotal;
	}
}
