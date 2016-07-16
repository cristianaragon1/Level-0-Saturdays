import javax.swing.JOptionPane;

public class factor {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a Number");
		int intput1 = Integer.parseInt(input1);
		for (int i = 0; i < intput1; i++) {
			factor(intput1, i);
		}
//		String input2 = JOptionPane.showInputDialog("Enter a bigger Number");
//		int intputB = Integer.parseInt(input2);
	}
	static void factor(int intput1, int intputB) {
		if (intput1 % intputB == 0) {
			
			System.out.println(intput1 + " is a factor of " + intputB);
		}
	}

}
