import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		// 1. Make a new class, create a main method, and show the tortoise.
		Tortoise.show();
		Tortoise.setSpeed(10);
		String Shape = JOptionPane.showInputDialog("What shape do you want to draw? Square, Circle, or Triangle");
		// 2. Have the Tortoise draw a square.
		if (Shape.equalsIgnoreCase("square")) {
			drawSquare();
		}
		if (Shape.equalsIgnoreCase("circle")) {
			drawCircle();
		}
		if (Shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
		// 3. Extract this code into a drawSquare() method.

		// 4. Have the Tortoise draw a triangle.

		// 5. Extract this code into a drawTriangle() method.

		// 6. Have the Tortoise draw a circle.

		// 7. Extract this code into a drawCircle() method.

		// 8. Ask the user which shape they want. Draw the appropriate shape
		// depending on their answer.

		// 9. Ask the user which color they want. Color the the shape depending
		// on their answer.

	}

	static void drawSquare() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			Tortoise.move(50);
			Tortoise.turn(90);
		}

	}

	static void drawTriangle() {
		for (int i = 0; i < 60; i++) {
			Tortoise.turn(30);
			Tortoise.move(250);
			Tortoise.turn(90);
		}
	}

	static void drawCircle() {
		for (int i = 0; i < 60; i++) {
			Tortoise.turn(70);
			Tortoise.move(50);
		}
	}
}
