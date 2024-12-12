/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Sunday=0, Monday=1, Tuesday=2, Wednesday=3, Thursday=4, Friday=5, Saturday=6"); 
		System.out.println("What day of the week is it?"); 
		int number1 = sc.nextInt();
		
		if(number1==0)
		{
			System.out.println("Wake up at 10:00am!!");
		}
		if(number1==1)
		{
			System.out.println("Wake up at 7:00am!!");
		}
		if(number1==2)
		{
			System.out.println("Wake up at 7:00am!!");
		}
		if(number1==3)
		{
			System.out.println("Wake up at 7:00am!!");
		}
		if(number1==4)
		{
			System.out.println("Wake up at 7:00am!!");
		}
		if(number1==5)
		{
			System.out.println("Wake up at 7:00am!!");
		}
		if(number1==6)
		{
			System.out.println("Wake up at 10:00am!!");
		}
	}
}
