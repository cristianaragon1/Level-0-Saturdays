import javax.swing.JOptionPane;

public class joke {
	public static void main(String[] args) {
		String askJoke = JOptionPane.showInputDialog("Do you want to hear a joke?");
		if (askJoke.equalsIgnoreCase("yes")) {
			tellJoke();
			String scale = JOptionPane.showInputDialog("On a scale of 1-10 how annoying was I?");
			int boi = Integer.parseInt(scale);
			if (boi > 0 && boi < 11) {
				for (int i = 0; i < boi; i++) {
					tellJoke();
				}
			}else {
				JOptionPane.showMessageDialog(null, "no, that would be impossibly annoying");
			}
		}else {
			JOptionPane.showMessageDialog(null, "lol ok bye");
		}
			}

	static void tellJoke() {
		JOptionPane.showInputDialog("What did the farmer say when his tractor got stolen?");
		JOptionPane.showMessageDialog(null, "My tractor got stolen.");
	}
}
