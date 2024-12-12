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
		int [] arr = new int [1000];
			
			public static void arrayToString(int k){
				for(int i=0; i<arr.length; i++){
				arr[i]=(int)((Math.random()*k)+1);
				System.out.println(arr[i]);
			}
			
			for(int i=0; i<arr.length; i++){
				int min=100;
				if(min>arr[i]){
					arr[i]=min;
				}
			}
			System.out.println("Minimum:" + min);
			
			for(int i=0; i<arr.length; i++){
				int max=0;
				if(max<arr[i]){
					arr[i]=max;
				}
			}
			System.out.println("Maximum:" + max);
			}
			
		


		
	}
}
