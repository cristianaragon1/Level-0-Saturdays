import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		/*
		 * 1. Use the dance method to make the Tortoise spin.
		 * 
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		 */
		String Dizzy = JOptionPane.showInputDialog("On a scale of 1-10 how dizzy do you want the tortoise to be?");
		int dizzyNum = Integer.parseInt(Dizzy);
		Tortoise.show();
		dance(dizzyNum);
		
		
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
