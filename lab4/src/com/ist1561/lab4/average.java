package com.ist1561.lab4;
import java.util.Scanner;

public class average {
	public static void main (String[] args) { 
		Scanner myObj = new Scanner(System.in);
	    int one;
	    System.out.println("Enter your first number");
	    one = myObj.nextInt();
	    int two;
	    System.out.println("Enter your second number");
	    two = myObj.nextInt();
	    int three;
	    System.out.println("Enter your third number");
	    three = myObj.nextInt();
	    System.out.println("The average of your three numbers is: " + ((one+two+three)/3) );
	}

}
