/**
 * 
 */
package com.sqa.mc.greeting;

import java.util.Scanner;

/**
 * @author mc
 * @version 1.0.0
 * @since 1.0
 */
public class SimpleGreeting {

	/**
	 * sparam args
	 */
	public static void main(String[] args) {
		// Decleare local method variables
		String name;
		// Create local variable which contains Scanner object instance to
		// capture user input from keyboard
		Scanner scanner = new Scanner(System.in);
		// Greet the user
		System.out.println("Welcome to the simple Greeting Application");
		// Request the user's name
		System.out.print("Could I please have your name? ");
		// Capture user's name inside local variable name
		name = scanner.nextLine();
		// Say farwell to user
		System.out.println("Thank you for using this application, farewell " + name + "!");
	}
}