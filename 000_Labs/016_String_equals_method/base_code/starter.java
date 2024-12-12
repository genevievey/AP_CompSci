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
		System.out.println("Pick your character: Wizard, Warrior, or Rogue"); 
		String text = sc.nextLine();
		
		if(text.equals("Wizard"))
		{
			System.out.println("You're a wizard! Yay!");
		}
		else if(text.equals("wizard"))
		{
			System.out.println("You're a wizard! Yay!");
		}
		else if(text.equals("Warrior"))
		{
			System.out.println("You're a warrior! Woo!");
		}
		else if(text.equals("warrior"))
		{
			System.out.println("You're a warrior! Woo!");
		}
		else if(text.equals("Rogue"))
		{
			System.out.println("You're a rogue! Cool!");
		}
		else if(text.equals("rogue"))
		{
			System.out.println("You're a rogue! Cool!");
		}
		
		else{
			System.out.println("Great you're a troll now");
		}
	}
}
