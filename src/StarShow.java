import java.awt.Color;
import java.util.Random;

import javax.print.DocFlavor.INPUT_STREAM;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class StarShow {

	void makeStars() {
		// 13. Set the speed to 8
		Tortoise.setSpeed(8);
		// 6. Make a variable to hold the X position of the Robot and set it to
		// 10
		int tortoiseX = 10;
		// 7. Make a variable to hold the Y position of the Robot and set it to
		// 950
		int tortoiseY = 950;
		// 8. Make a variable to hold the star size and set it to 25
		int starSize = 25;
		// 12. Repeat the steps #19 to #18, 30 times
		for (int i = 0; i < 30; i++) {

			// 19. Set the pen width to i
			Tortoise.setPenWidth(i);
			// 10. Set the X position of the robot to your X variable
			Tortoise.setX(tortoiseX);
			// 11. Set the Y position of the robot to your Y variable
			Tortoise.setY(tortoiseY);
			// 9. Call the drawStar() method with your star size variable
			drawStar(starSize);
			// 14. Increase the X position by star size. See Figure 2.
			tortoiseX = tortoiseX + starSize;
			// 15. decrease the Y position by star size. See Figure 3.
			tortoiseY = tortoiseY - starSize;
			// 16. Increase the star size by 20
			starSize = starSize + 20;
			// 17. Turn the robot 12 degrees
			Tortoise.turn(12);
			// 18. Make each star a different random color like in Figure 4.
			Tortoise.setPenColor(Colors.getRandomColor());
		}
	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		Tortoise.show();
		// 4. Repeat both commands 5 times. See Figure 1 at
		// http://bit.ly/star-show
		for (int i = 0; i < 5; i++) {
			// 1. Move the robot the distance of the starSize variable
			Tortoise.move(starSize);
			// 3. Turn the robot 144 degrees
			Tortoise.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}

}
