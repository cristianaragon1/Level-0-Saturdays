import javax.swing.JOptionPane;

public class messageBox {
	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Enter the username.");
		String password = JOptionPane.showInputDialog("Enter your password");
		if (username.equalsIgnoreCase("amazing programmers") && password.equalsIgnoreCase("password")) {
			JOptionPane.showMessageDialog(null, "Welcome");
		} else {
			JOptionPane.showMessageDialog(null, "Username or password is incorrect.");
		}
	}
}
