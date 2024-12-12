/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in)
        
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a name:");
String name = sc.nextLine();
System.out.println("Hello " + name);

System.out.println("Please enter a number:");
int number1 = sc.nextInt();
sc.nextLine();

System.out.println("Please enter another number");
int number2 = sc.nextInt();
sc.nextLine();

int sum = number1 + number2;

System.out.println("the sum of the numbers is: " + sum );

System.out.println("Please enter your favorite food");
String food = sc.nextLine();

}
}