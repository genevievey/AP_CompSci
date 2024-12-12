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
	System.out.println("Whats your pet peeve");
	String peeve = sc.nextLine();
	
	String p ="Did you just say your pet peev was \"";
	String r ="\"";
	System.out.println(p+peeve+r);
	
	String i = "\t sassball\\\\excuse you!";
	System.out.println(i);
	}
}
