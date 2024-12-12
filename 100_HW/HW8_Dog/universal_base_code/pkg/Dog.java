package pkg;
import java.util.Scanner;
import java.util.Random;

	public class Dog{
	String name;			
	String breed;	
	int age;		
	boolean isSleeping;	
	
	public Dog() {		// Default Constructor
		name =  new String("Clifford");
		breed = new String("big red dog");
		age = 3;
		isSleeping = false;
	}
	
	public Dog(String n, String b, int a){		// int, String, String, int Constructor
		name = n;
		breed = b;
		age = a;
	}

	public int getAge(){						// Returns the ID of the Employee
		return age;
	}

	public String getName(){			// Returns First Name of the Employee
		return name;
	}

	public String getbreed(){			// Returns Last name of the Employee
		return breed;
	}

	public boolean getSleeping(){				// Returns monthly salary of the Employee
		
		boolean isSleeping = age<10;
		
		if(true){
			return "yes";
		}
		else if(false){
			return "no";
		}
	}

	public void dogToString(){					// Prints all values of the Employee	
		System.out.println("------------------------------");
		System.out.println("Dog name: " + name);
		System.out.println("Dog breed: " + breed);
		System.out.println("Dog age: " + age);
		System.out.println("Sleeping: " + isSleeping);
		System.out.println("------------------------------");
		System.out.println("");
	
	}

}
