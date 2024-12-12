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
		System.out.println("Print out a number and we'll tell you every prime up to that number!");
		int number = sc.nextInt();
		
		for (int c = 2; c <= number; ++c) {
			boolean prime = isprime(c);
			
			if (prime == true) {
				System.out.println(c + " is a prime number");
			}
			
		}
		
	}
		
	public static boolean isprime(int testnum) {
		boolean isitprime = true;
		for (int i = 2; i < testnum; ++i) {
			int result = testnum % i;
			
			if (testnum % i == 0) {
				isitprime = false;
			}
		}
		return isitprime;
	}
}
