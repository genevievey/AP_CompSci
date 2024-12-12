/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987,"dwight","schrute",4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(15);
		dwight.getAnnualSalary();
		Employee jim = new Employee(2474,"jim","halpert",4416.66);
		jim.employeeToString();
		jim.raiseSalary(15);
		jim.getAnnualSalary();
		Employee pam = new Employee(2011,"pam","beesly",2250.00);
		pam.employeeToString();
		pam.raiseSalary(15);
		pam.getAnnualSalary();
		Employee meredith = new Employee(2231,"meredith", "palmer", 3416.66);
		meredith.employeeToString();
		meredith.raiseSalary(15);
		meredith.getAnnualSalary();

		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		meredith.employeeToString();
		
	    


	}
		
}
