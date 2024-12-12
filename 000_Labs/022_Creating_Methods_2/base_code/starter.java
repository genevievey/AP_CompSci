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
		System.out.println("Base number:");
		int base = sc.nextInt();
		System.out.println("Exponent number:");
		int expo = sc.nextInt();
		sc.close();
	    int result = methodexpo(base, expo);
		System.out.println(result);
		
	}
	
	public static int methodexpo(int base, int expo) {
		double output = Math.pow(base, expo);
		return (int) output;
	}
}
