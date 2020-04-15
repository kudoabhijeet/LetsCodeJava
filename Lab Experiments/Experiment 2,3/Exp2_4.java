// Exp-02 part 4 :Command Line calc.

import java.io.*;
import java.util.Scanner;

public class Exp2_4 {
	public static void main (String[] args) {
		int first = Integer.parseInt(args[0]);
		int second= Integer.parseInt(args[2]);
		
		// string1.equals(string2) compares two variables if both are diff. primitve and object variable	
		// create menu
		/*System.out.println("Choose option :");
		System.out.println("1. Addition");
		System.out.println("2. Difference");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		*/
		/*Scanner scant = new Scanner(System.in);
		int n = scant.nextInt(); // menu option chosen
		*/
		String n = args[1];
		// if else 
		// Addition
		if (n.equals("+")){
		System.out.print("Addition :");
		System.out.println(first + second);
		}
		// Difference
		else if (n.equals("-")){
		System.out.print("Difference :");
		System.out.println(first - second);
		}
		// Product
		else if (n.equals("*")){
		System.out.print("Product :");
		System.out.println(first * second);
		}
		// Division
		else if (n.equals("/")){
		System.out.print("Division :");
		System.out.println(first / second);
		}

		else {
		System.out.println("Invalid Option!!"); // incorrect option chosen from user.	
		}
	
	}//main
}//test