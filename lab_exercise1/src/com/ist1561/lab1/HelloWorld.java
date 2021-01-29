package com.ist1561.lab1;
import java.util.Scanner;

public class HelloWorld {
	public static void main (String[] args) { 
		System.out.println("Hello World!");
		Scanner myObj = new Scanner(System.in);
	    String name;
	    System.out.println("Enter name:"); 
	    name = myObj.nextLine(); 
		System.out.println("My name is " + name + ".");
	}

}
