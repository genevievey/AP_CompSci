/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a random integer!");
		int number1 = sc.nextInt();
		
		System.out.println("Give me a second integer!");
		int number2 = sc.nextInt();
		
		System.out.println("Now a third!");
		int number3 = sc.nextInt();
		
		if((number1>number2) && (number1>number3))
		{
			System.out.println(number1 + " is the greatest");
		}
			if((number2>number1) && (number2>number3))
		{
			System.out.println(number2 + " is the greatest");
		}	
		if((number3>number1) && (number3>number2))
		{
			System.out.println(number3 + " is the greatest");
		}
		
			if((number1<number2) && (number1<number3))
		{
			System.out.println(number1 + " is the least");
		}
			if((number2<number1) && (number2<number3))
		{
			System.out.println(number2 + " is the least");
		}	
		if((number3<number1) && (number3<number2))
		{
			System.out.println(number3 + " is the least");
		}
		
	}
}
