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
		int number1 = sc.nextInt();
		
		if(number1>224)
		{
		System.out.println("Too high");
		}
		
		if(number1<224)
		{
			System.out.println("Too low");
		}
		
		if(number1==224)
		{
			System.out.println("You win!");
		}
	}
}
