/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
	String Role;
	int Dex;
	int Charisma;
	int Strength;
	int intel;

	public MyCharacter() {
		Role = "wizard";
		Dex = 5;
		Charisma = 7;
		Strength = 4;
		intel = 7;
		
	}
	
	public MyCharacter(String text) {
		if(text.equals("Wizard"))
		{
			Role = text;
			System.out.println("You're a wizard! Yay!");
		}
		else if(text.equals("wizard"))
		{
			Role = text;
			System.out.println("You're a wizard! Yay!");
		}
		else if(text.equals("Warrior"))
		{
			Role = text;
			System.out.println("You're a warrior! Woo!");
		}
		else if(text.equals("warrior"))
		{
			Role = text;
			System.out.println("You're a warrior! Woo!");
		}
		else if(text.equals("Rogue"))
		{
			Role = text;
			System.out.println("You're a rogue! Cool!");
		}
		else if(text.equals("rogue"))
		{
			Role = text;
			System.out.println("You're a rogue! Cool!");
		}
		else{
			Role = "troll";
			System.out.println("Great you're a troll now");
		}
		Dex = 5;
		intel = 7;
		Strength = 4;
		Charisma = 7;
	}
	
	
	public void MyToString(){
		System.out.println("Your Role is:" + Role);
		System.out.println("Your dexterity is:" + Dex);
		System.out.println("Your intelligence is:" + intel);
		System.out.println("Your charisma is:" + Charisma);
		System.out.println("Your strength is:" + Strength);
			
	}

}

