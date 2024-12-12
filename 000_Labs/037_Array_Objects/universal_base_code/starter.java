/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String[] args) {
		//Your code goes below here
		String[][] wizards = new String[100][3];
		String[][] warriors = new String[100][3];
		for (int i = 0; i < 100; i++) {
			wizards[i][0] = "Gandalf";
			wizards[i][1] = "14";
			wizards[i][2] = "false";
			warriors[i][0] = "Gimli";
			warriors[i][1] = "14";
			warriors[i][2] = "false";
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of fighters on both sides (up to 100):");
		int fighters = Integer.valueOf(input.nextLine()) - 1;
		int damage = 0;
		int life = 14;
		boolean isDead = true;
		int wiz = fighters;
		int war = fighters;
		while ((wiz >= 0)&&(war >= 0)) {
			isDead = false;
			damage = attack();
			life = Integer.valueOf(warriors[war][1]);
			if (life < damage) {
				warriors[war][1] = "0";
				isDead = true;
			} else {
				warriors[war][1] = Integer.toString(life - damage);
			}
			System.out.println(wizards[(wiz)][0] + " #" + (wiz + 1) + " strikes for " + damage + " damage on " + warriors[(war)][0] + " #" + (war + 1) + " who has " + warriors[war][1] + " life.");
			if (isDead) {
				warriors[(war)][2] = "true";
				war--;
			}
			if (war > 0) {
				isDead = false;
				damage = attack();
				life = Integer.valueOf(wizards[wiz][1]);
				if (life < damage) {
					wizards[wiz][1] = "0";
					isDead = true;
				} else {
					wizards[wiz][1] = Integer.toString(life - damage);
				}
				System.out.println(warriors[(war)][0] + " #" + (war + 1) + " strikes for " + damage + " damage on " + wizards[(wiz)][0] + " #" + (wiz + 1) + " who has " + wizards[wiz][1] + " life.");
				if (isDead) {
					wizards[(wiz)][2] = "true";
					wiz--;
				}
			}
		}
		if (war > wiz) {
			System.out.println("The Warriors defeated all the wizards with " + (war + 1) + " warriors left!");
		} else {
			System.out.println("The Wizards defeated all the warriors with " + (wiz + 1) + " wizards left!");
		}
	}
		
	public static int attack() {
		Random random = new Random();
		int hit = random.nextInt(10) + 1;
		return hit;
	}
		
}
	
	

