package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount");
		double startAmount = in.nextDouble();
		
		System.out.println("What is your win probability for a single play?");
		double winChance = in.nextDouble();
		
		System.out.println("What is the amount for you to consider this a successful day?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many days will you simulate?");
		int totalSimulations = in.nextInt();
		
		System.out.println("How many plays will you simulate?");
		int totalPlays = in.nextInt();
		
		while (startAmount < winLimit && startAmount > 0) {
			double random = Math.random();
			if (random <= winChance) {
				startAmount++;
				System.out.println("You win!");
			} else {
				startAmount--; 
				System.out.println("You lose!"); 	
				}
			}
		

		for(int i = 1; i <= totalSimulations; i++) {
			System.out.println("Day " + i + " is over");	}
		for(int j = 1; j <= totalPlays; j++) {
			System.out.println(j + " number of plays"); }
	
			// System.out.println("Day " + i + "was a " + k);
		
	}
}
