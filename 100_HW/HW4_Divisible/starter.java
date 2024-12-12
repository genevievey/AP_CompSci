/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer:"); 
		int number1 = sc.nextInt();
		System.out.println("Give me another integer:");
		int number2 = sc.nextInt();
		
		if (number1%2 == 0)
		{
			System.out.println(number1 + " is even");
		}
		else if (number1%2 == 1)
		{
			System.out.println(number1 + " is odd");
		}
		if (number1%3 == 0)
		{
			System.out.println(number1 + " is divisible by 3");
		}
		if (number1%4 == 0)
		{
			System.out.println(number1 + " is divisible by 4");
		}
		
		if (number2%2 == 0)
		{
			System.out.println(number2 + " is even");
		}
		else if (number2%2 == 1)
		{
			System.out.println(number2 + " is odd");
		}
		if (number2%3 == 0)
		{
			System.out.println(number2 + " is divisible by 3");
		}
		if (number2%4 == 0)
		{
			System.out.println(number2 + " is divisible by 4");
		}
	}
}
