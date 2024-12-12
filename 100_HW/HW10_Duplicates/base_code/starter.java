/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		
		System.out.println("These are the " + arr.length + " numbers:");
		
			for(int i=0; i<arr.length; i++){
				arr[i]=(int)((Math.random()*20)+1);
				System.out.print(arr[i]+", ");
			}
			
		int target = (int)((Math.random()*10)+1);
		for(int i = 0; i<arr.length; i++){
			if (arr[i]==target){
				System.out.println("duplicate found");
			}
		}
		int count = 0;
		
		for(int i = 0; i<arr.length-1; i++){
		   if(arr[1]==arr[i+1]){
				System.out.println(" ");
		    	System.out.println("Consect at " + i + " and " + (i+1));
		    	count++;
		} 
		
	}
	


	}
}

