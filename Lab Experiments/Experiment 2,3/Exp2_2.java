// Exp-02 part 1 :Sum of two variable using Command line arguments

import java.io.*;

public class Exp2_2 {
	public static void main (String[] args) {
		int first = Integer.parseInt(args[0]);
		int second= Integer.parseInt(args[1]);

		// sum of both command line arguments
		System.out.print("Sum : ");
		System.out.println(first + second);	
	}//main
}//test