/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play a game! Guess a number between 1-1000!");
		int num = sc.nextInt();
		
		int rand = (int)(Math.random() * 1000);
		
		while(num!=rand)
		{ 
			if (num>rand)
			{
			System.out.println("too high");
			}
			
			if(num<rand)
			{
				System.out.println("too low");
				
			}
			
			if (num==rand)
			{
				System.out.println("You win!");
				
				break;
			}
			
			System.out.println("Guess again!");
			num = sc.nextInt();
			
		}



		
	}
}
