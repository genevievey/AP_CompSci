/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a first and last name with a space in the middle:");
	String name = sc.nextLine();
	int n = name.indexOf(" ");
	
	System.out.print("last name is");
	System.out.println(name.substring(n));
		
	}
}
