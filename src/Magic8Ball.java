// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int Randomnum = new Random().nextInt(6);
	// 3. Print out this variable
System.out.println(Randomnum);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask the Magic 8 Ball");
	// 5. If the random number is 0
if (Randomnum == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
else if (Randomnum == 1) {
	JOptionPane.showMessageDialog(null, "No");
}
	// -- tell the user "No"

	// 7. If the random number is 2
else if (Randomnum == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask google");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
else if (Randomnum == 3) {
	JOptionPane.showMessageDialog(null, "Ask again Later...");
}
	// -- write your own answer
else if (Randomnum == 4) {
	JOptionPane.showMessageDialog(null, "hahahah nope");
}
else if (Randomnum == 5) {
	JOptionPane.showMessageDialog(null, "Most Likely Yes!");
}
else if (Randomnum == 6) {
	JOptionPane.showMessageDialog(null, "If you are under 18, you will need a parent or guardian to answer this question.");
}
}
}


