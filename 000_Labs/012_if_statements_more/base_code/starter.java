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
		System.out.println("Give me an integer:"); 
		int number1 = sc.nextInt();
		System.out.println("Give me another integer:");
		int number2 = sc.nextInt();
		
		if(number1>number2)
		{
			System.out.println(number1 + ">" + number2);
		}
		
		if(number1<number2)
		{
			System.out.println(number1 + "<" + number2);
		}
		
		if(number1==number2)
		{
			System.out.println(number1 + "=" + number2);
		}
	}
}
