/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word or phrase:");
	String sent = sc.nextLine();
	
	while(true){
		if(sent.indexOf(" ")==-1){
			System.out.print(spongeCase(sent));
			break;
		}
		int space = sent.indexOf(" ");
		String word = sent.substring(0, space);
		System.out.print(spongeCase(word)+ " ");
		sent=sent.substring(space+1);
		
	}
	}
	public static String spongeCase(String sent){
		String result = "";
	
	for(int i=0; i<sent.length(); i++){
		String letter = sent.substring(i,i+1);
		if(i%2==0){
			letter = letter.toLowerCase();
		}
		else{
			letter = letter.toUpperCase();
		}
		result = result+letter;
	}
	return result;
}

}