/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot machine rules:"); 
		System.out.println("1. All players start with $100"); 
		System.out.println("2. Input a wager lesser than or equal to your total amount of money");
		System.out.println("The slot machine will roll 3 numbers");
		System.out.println("	a. if all 3 numbers match, your money triples"); 
		System.out.println("	b. if 2 numbers match, your money doubles"); 
		System.out.println("	c. if none match, your money is lost");
		System.out.println("--------------------------------------------------------------------"); 
		System.out.println("Would you like to play (Yes/No)");
		String yn = sc.nextLine();
		
		if(yn=="Yes")
		{
			System.out.println("Great!");
			
			int money=100;
			
			while(money>0)
		{ 
			System.out.println("input how much money to wager:");
			int gamble = sc.nextInt();
			
			int roll1 = (int)(Math.random()*10);
			int roll2 = (int)(Math.random()*10);
			int roll3 = (int)(Math.random()*10);
			
			if (roll1==roll2&&roll1==roll3)
			{
				money = money-gamble;
				gamble = gamble*3;
				System.out.println("Now you have " + (money + gamble));
			}
			else if (roll1==roll2||roll1==roll3||roll2==roll3)
			{
				money = money - gamble;
				gamble = gamble*2;
				System.out.println("Now you have "+ (money+gamble));
			}
			else if (roll1!=roll2&&roll1!=roll3&&roll2!=roll3)
			{
				money = money - gamble;
				System.out.println("Now you have " + (money-gamble));
			}
			if(money==0)
			{
				System.out.println("Oh no! No more moneys left!");
				
				break; 
			}
		}
		
		}
			
		
		if(yn=="No")
		{
			System.out.println("Okay see you again soon!");
		}
		
		
		
		}
		
	}
	
		
		
		
	

	

		

