/*
 *	Author:
 *  Date:
 *	Collaborator(s): BaseClass test = new BaseClass();
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	Scanner sc = new Scanner(System.in);
	System.out.println("What's your dog's name?");
	String name = sc.nextLine();
	System.out.println("What's " + name + "'s breed");
	String breed = sc.nextLine();
	System.out.println("What's " + name + "'s age?");
	int age = sc.nextInt();
	
	Employee doggy = new Dog(name, breed, age, isSleeping);
		doggy.dogToString();
	
	
	


	}
}
