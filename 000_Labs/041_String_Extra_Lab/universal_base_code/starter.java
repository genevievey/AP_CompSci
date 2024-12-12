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
	BaseClass test = new BaseClass (); 
	Scanner sc = new Scanner (System.in); 
	System.out.println ("Enter a sentence:"); 
	String sentence = sc.nextLine(); 
	String finalsent = ""; 
	
	for(int i = 0; i < sentence.length(); i++){ 
		int space = sentence.indexOf(" ");
		String word = sentence. substring(0, space);
		sentence = sentence.substring(space+1);
		finalsent = " " + word + finalsent;
		if (sentence.indexOf(" ") == -1){
			finalsent = sentence + finalsent;
			break; 
		}
	}
			System.out.println (finalsent);
}

}
