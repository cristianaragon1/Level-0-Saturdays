import javax.swing.JOptionPane;

public class ifstate {
public static void main(String[] args) {
	
	// 1. correct the birthdays for your family below
	String momsBirthday = "Febuary 15th";
	String dadsBirthday = "January 28th";
	String myBirthday = "November 8th";

	// 2. Find out which birthday the user wants and and store their response in a variable
String Name = JOptionPane.showInputDialog("Whose birthday do you want to know?");
	// 3. Print out what the user typed
	System.out.println(Name);
	// 4. if user asked for "mom"
	if (Name.equalsIgnoreCase("mom")) {
		System.out.println(momsBirthday);
	}if (!Name.equalsIgnoreCase("dad")) {
	System.out.println(dadsBirthday);	
	}if (!Name.equalsIgnoreCase("yours")) {
		System.out.println(myBirthday);
	}else {
		System.out.println("Sorry, I dont remember that person's birthday!");
	}
		//print mom's birthday
	// 5. if user asked for "dad"
		// print dad's birthday
	// 6. if user asked for your name
		// print myBirthday
	//7. otherwise print "Sorry, i don't remember that person's birthday!"

}
}
