/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


private class Ogre {
	private String name;
	private boolean ugly;

	public Ogre() {
		name = "Shrek";
		boolean ugly = true;
	}

	private String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	private void interact(Donkey donkey){
		System.out.println(donkey.getname() + ", what are you doing in my swamp?!");
		return;
	}


}
