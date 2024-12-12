/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String sent = sc.nextLine();
        
        while(true){
            if(sent.indexOf(" ") == -1) {
                System.out.print(pigLatin(sent));
                break;
            }
            int space = sent.indexOf(" ");
            String word = sent.substring(0, space);
            System.out.print(pigLatin(word) + " ");
            sent = sent.substring(space+ 1);
       }
	}
    public static String pigLatin(String sent) {
        String result = "";
        String vowels = "aeiouAEIOU";
        char firstChar = sent.charAt(0);

        if (vowels.indexOf(firstChar) != -1) {
            result = sent+"way";
        }
        
        else {
            int vowelIndex = -1;
            for (int i = 0; i < sent.length(); i++) {
                if (vowels.indexOf(sent.charAt(i)) != -1) {
                    vowelIndex = i;
                    break;
                }
            }
            
            if (vowelIndex == 1) {
                result = sent.substring(1) + sent.charAt(0) + "ay";
            }
            else if (vowelIndex == 2) {
                result = sent.substring(2) + sent.substring(0, 2) + "ay";
            }
            else {
                result = sent.substring(vowelIndex) + sent.substring(0, vowelIndex) + "ay";
            }
        }
        return result;
    }
}
