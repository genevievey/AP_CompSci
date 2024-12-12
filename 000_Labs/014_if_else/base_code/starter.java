/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play a game!");
		System.out.println("Guess a number between 1 and 1000!");
		System.out.println("If you get the number right, you win!");
		int number1 = sc.nextInt();
		
		
		if(number1==224)
		{
			System.out.println("You win!");
		}
		else
		{
			System.out.println("Try again loser");
		}
	
		
	}
}
