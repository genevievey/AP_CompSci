/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your name?");
		String name = sc.nextLine();
		System.out.println("Whats your title?");
		String title = sc.nextLine();
		System.out.println("Pick your character: Wizard, Warrior, or Rogue"); 
		String character = sc.nextLine();
		System.out.println("You have 20 skill points to spend on the following: Strength, Dexterity, Intelligence, and Charisma. Spend them with caution!");
		
		System.out.println("Strength (1-10)");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("input a smaller amount.");
		}
		if(strength<=10)
		{
			System.out.println(20-strength + " remaining");
		}
		
		System.out.println("Dexterity (1-10)");
		int dex = sc.nextInt();
		if(dex>10)
		{
			System.out.println("input a smaller amount.");
		}
		if(dex<=10)
		{
			System.out.println((20-strength)-dex + " remaining");
		}
		
		System.out.println("Intelligence (1-10)");
		int intel = sc.nextInt();
		if(intel>10||intel+strength+dex>20)
		{
			System.out.println("input a smaller amount.");
		}
		if (intel<=10)
		{
			System.out.println(((20-strength)-dex)-intel + " remaining");
		}
		
		System.out.println("Charisma (1-10)");
		int rizz = sc.nextInt();
		if(rizz>10||intel+strength+dex+rizz>20)
		{
			System.out.println("input a smaller amount.");
		}
		if(rizz<=10);
		{
			System.out.println((((20-strength)-dex)-intel)-rizz + " remaining");
		}

		System.out.println("You are " + name + " the " + title + " of CVHS!");
		System.out.println("You are a " + character + " with the following stats...");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dex);
		System.out.println("Intelligence: " + intel);
		System.out.println("Charisma: " + rizz);
		
		}
	}

	
