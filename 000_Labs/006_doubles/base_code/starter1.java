/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter1 {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
Scanner sc = new Scanner(System.in);
System.out.println("Enter a temperature in Fahrenheit:");
String fahrenheit = sc.nextLine();
int celcius = fahrenheit-32*5/9;
System.out.println("This is " + fahrenheit + " in Celcius:" + celcius);



	}
}
