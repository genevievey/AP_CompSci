/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.
	public static boolean isLeapYear(int y){
		return y%4==0;
		
	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.
	public static int getDigitSum(int n){
		int sum = 0
		while(n>0){
			sum = sum + (n % 10);
			n = n/10
		}
		return sum;
	}
	
	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.
	public static void printifConsecutive(int a, int b, int c){
		if(a+1 == b && b+1 ==c){
			System.out.println("consecutive");
		}
		else(){
			System.out.println("not consecutive");
		}
	}

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(year%4==0){
			System.out.println(year + " is a leap year!");
		}
		else(){
			System.out.println(year + " is not a leap year!");
		}

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
	
		if(num1+1=num2&&num2+1==num3){
		System.out.println("these numbers are consecutive");
		}
		else(){
			System.out.println("these numbers aren't consecutive");
		}
		System.out.println("----------------------------------------");
	}
}
