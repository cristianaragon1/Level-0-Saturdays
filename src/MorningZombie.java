import javax.swing.JOptionPane;

public class MorningZombie {
	static void weekday() {
		JOptionPane.showMessageDialog(null, "Get up, Take a Shower, Eat Breakfast, brush your teeth, and go to school");
	}

	static void weekend() {
		JOptionPane.showMessageDialog(null, "Sleep in, go get other important stuff done later :D");
	}

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("What Day Is It?");
		String breaks = JOptionPane.showInputDialog("Is it a break/vacation day?");
		if (breaks.equals("yes")) {
			weekend();
		}
		if (breaks.equals("no")) {
			weekday();
		} else if (day.equalsIgnoreCase("Monday")) {
			weekday();
		} else if (day.equalsIgnoreCase("Tuesday")) {
			weekday();
		} else if (day.equalsIgnoreCase("Wednesday")) {
			weekday();
		} else if (day.equalsIgnoreCase("Thursday")) {
			weekday();
		} else if (day.equalsIgnoreCase("Friday")) {
			weekday();
		} else if (day.equalsIgnoreCase("Saturday")) {
			weekend();
		} else if (day.equalsIgnoreCase("Sunday")) {
			weekend();
		}

	}
}
