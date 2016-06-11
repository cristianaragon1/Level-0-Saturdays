import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors.Reds;

public class robotGraffiti {
	public static void main(String[] args) {
		Robot cristian = new Robot();
		cristian.setSpeed(100);
		cristian.setAngle(180);
		//cristian.move(200);
		cristian.penDown();
		
		cristian.setPenColor(Color.blue);
		for (int i = 0; i < 180; i++) {
			cristian.move(1);
		cristian.turn(-1);
		}
	}
}
