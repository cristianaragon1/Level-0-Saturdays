import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		for (int i = 0; i < 6; i++) {

			String Animal = JOptionPane.showInputDialog("What animal do you want? (cow, duck, dog, cat, llama, or human)");
			if (Animal.equalsIgnoreCase("Cow")) {
				playMoo();
			} else if (Animal.equalsIgnoreCase("Duck")) {
				playQuack();
			} else if (Animal.equalsIgnoreCase("Dog")) {
				playWoof();
			} else if (Animal.equalsIgnoreCase("Cat")) {
				playMeow();
			} else if (Animal.equalsIgnoreCase("Llama")) {
				playLLama();
			} else if (Animal.equalsIgnoreCase("Human")) {
				playHuman();
			} else {
				JOptionPane.showMessageDialog(null, "Sorry! I don't know what sound that animal makes!");
			}
		}

		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLLama() {
		playNoise(llamaFile);
	}

	void playHuman() {
		playNoise(humanFile);
	}

	String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";
	String humanFile = "/Users/league/Desktop/hello.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
