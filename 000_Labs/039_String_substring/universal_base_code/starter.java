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
	System.out.println("enter a word:");
	String word = sc.nextLine();
	
		int num1=0;
		int num2=1;
	for(int num=0; num<word.length(); num++){
		System.out.println(num+" "+word.substring(num1,num2));
		num1++;
		num2++;
	}


		
	}
}
