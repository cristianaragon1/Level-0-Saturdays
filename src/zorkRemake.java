import java.util.Scanner;

public class zorkRemake {
	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		System.out.println("What is your name?");
		String nameAnswer = w.nextLine();
		//System.out.println(answer);
		if (nameAnswer.equals("cristian")) {
			System.out.println("i know that name!");
			String nameTrue = w.nextLine();
			if (nameTrue.equals("really?")) {
				System.out.println("yes you're a programmer right?");
			}
		}else {
			System.out.println("I'm not too sure if i know you");
			System.out.println("Would you like to start an adventure?");
			String adventureStart = w.nextLine();
			if (adventureStart.equals("yes")) {
				System.out.println("Very well, Teleporting to the AMAZON RAINFOREST!");
				System.out.println("BRRREEEEEERRRPPPP");
			}
		}
		System.out.println("Welcome Traveler "+ nameAnswer + " today you embark on a journey like no other, filled with plot twisting turns, spooky caves, and unidentified creatures!" );
		System.out.println("Your objective is to find the hidden Amazon Package that ironically crash landed in the Amazon Rainforest by a faulty drone.");
		System.out.println("You have been assigned this backpack full of multiple supplies which you can check out later.");
		System.out.println("My name is Zork, and my mission is to assist you on this adventure!");
		System.out.println("Are you ready?");
		w.nextLine();
		System.out.println("Ready or not we shall begin no matter what!");
		System.out.println("You find yourself standing in the middle of the forest, your backpack is on your back and an open trail awaits you.");
		
		String optionOne = w.nextLine();
		if (optionOne.equals("walk on trail")) {
			System.out.println("you begin to walk the trail and go quite the distance");
			System.out.println("you havent seen much until you spot a shiny object at the bottom of a steep cliff");
			System.out.println("Maybe there is something in your backpack that could help you get down there");
			String shinyOne = w.nextLine();
			if (shinyOne.equals("open backpack")) {
				System.out.println("ITEMS IN BAG:");
				System.out.println("Rope");
				System.out.println("Grappling hook");
				System.out.println("Inflatable Water Raft");
				System.out.println("Tent");
				System.out.println("Water Purifier");
				System.out.println("Combat Knife");
				System.out.println("Super Grip Boots");
			}
			String itemBag = w.nextLine();
			if (itemBag.equals("grab rope")) {
				System.out.println("you tak the rope out of the backpack and tie it around a tree");
				System.out.println("now you begin to safely make your way down the cliff to the shiny object");
			}
		}else {
			System.out.println("I'm not sure what you mean by that.");
			optionOne = w.nextLine();
		}
	}
}
