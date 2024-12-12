/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] arr = new int[3000];
		int i=0;
		int c=3;
		while (i<1000){
			System.out.print((arr[i]=c)+ ", ");
			i++;
			c++;
			c++;
			c++;
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		int[] arr = new int[1001];
		int i=0;
		int c=1001;
		while (i<1000){
			System.out.print((arr[i]=c-1)+ ", ");
			i++;
			c--;
		}
	}
}
