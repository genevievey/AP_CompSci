/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
		// Your code goes below here
		
		public static int randAge() {
        return (int)(Math.random() * 100);
    }

    public static void main(String args[]) {
        PooleDwarf[] dwarfs = new PooleDwarf[7];
        
        for (int i = 0; i < 7; i++) {
            dwarfs[i] = new PooleDwarf(randName(), randAge()); 
        }

        String firstDwarfName = dwarfs[0].getName(); 
        int duplicates = 0;  
        
        for (int i = 1; i < 7; i++) {  
            if (dwarfs[i].isSameName(firstDwarfName)) { 
                duplicates++;  
            }
        }

        System.out.println(firstDwarfName+ " was the name with "+ duplicates + " matches!" );
		PooleDwarf test = new PooleDwarf();
		
	}
}
