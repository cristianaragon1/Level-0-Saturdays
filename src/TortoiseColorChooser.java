import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import javax.swing.JOptionPane;

public class TortoiseColorChooser {
	public static void main(String[] args) {
Tortoise.show();
Tortoise.setSpeed(10);
Tortoise.setPenWidth(10);;
for (int j = 0; j < 5; j++) {
	

String colorchoose = JOptionPane.showInputDialog("What color would you like the tortoise to draw with");
String shapechoose = JOptionPane.showInputDialog("What shape would you like to draw?");

if (colorchoose.equals("red")) {
	Tortoise.setPenColor(Color.red);
}

else if (colorchoose.equals("orange")) {
	Tortoise.setPenColor(Colors.Oranges.Orange);
}

else if (colorchoose.equals("yellow")) {
	Tortoise.setPenColor(Colors.Yellows.Yellow);
}

else if (colorchoose.equals("green")) {
	Tortoise.setPenColor(Colors.Greens.LawnGreen);
}

else if (colorchoose.equals("blue")) {
	Tortoise.setPenColor(Colors.Blues.CornflowerBlue);
}

else if (colorchoose.equals("purple")) {
	Tortoise.setPenColor(Colors.Purples.Purple);
}
else if (colorchoose.equals("")) {
	Tortoise.setPenColor(Colors.getRandomColor());
}


if (shapechoose.equals("square")) {
	for (int i = 0; i < 70; i++) {
		Tortoise.move(100);
		Tortoise.turn(90);
	}
}

if (shapechoose.equals("circle")) {
	for (int i = 0; i < 70; i++) {
		Tortoise.move(100);
		Tortoise.turn(70);
	}
}

if (shapechoose.equals("rectangle")) {
	for (int i = 0; i < 5; i++) {
		Tortoise.move(200);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
	}
}
}

		//3. ask the user what color they would like the tortoise to draw
		
		//4. use an if/else statement to set the pen color that the user requested

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	//1. make the tortoise draw a shape (this will take more than one line of code)


	}
}



