/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class MyCharacter {
	String role;
	int dexterity;					
	int intelligence;	
	int strength;	
	int charisma;	

	public MyCharacter() {
		role = "wizard";
		dexterity = 0;
		intelligence = 0;
		strength = 0;
		charisma = 0;
	}

	public MyCharacter(int d, int i, int s, int c){	
		dexterity = d;
		intelligence = i;
		strength = s;
		charisma = c;
	}
	
	public String getRole(){					
		return role;
	}

	public int getDexterity(){			
		return dexterity;
	}

	public int getIntelligence(){			
		return intelligence;
	}

	public double getCharisma(){			
	}

	public double getStrength(){		
		return strength;
	}

	public void MyToString(){						
		System.out.println("Role: " +role);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Strength: " + strength);
		System.out.println("Charisma: " + charisma);
	}
}
