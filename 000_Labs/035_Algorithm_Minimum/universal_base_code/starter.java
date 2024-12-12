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
		int [] arr = new int[201];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 51; i < 201; i++){
			System.out.println(i+" ");
			arr[1]= (int)(Math.random()*101);
			System.out.println(arr[i]);
			if(arr[i] < min){
				System.out.println("min: "+ min);
			}
			if(arr[i] > max){
				System.out.println("max: "+ max);
			}
			int sum = 0;
				for (int num : arr) {
				sum+= num;
			}
			double avg = sum/100;
			System.out.println("avg:" + avg);
			}

		
	}
}
