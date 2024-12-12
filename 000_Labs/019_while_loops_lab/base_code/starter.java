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
		System.out.println("Whats your name?");
		String name = sc.nextLine();
		System.out.println("How many times should i print your name?");
		int print = sc.nextInt();
		
			int c = 0;
		while(c<print)
		{
			System.out.println(name);
			if(c==print)
			{
				break;
			}
		c=c+1;
		}



		
	}
}
