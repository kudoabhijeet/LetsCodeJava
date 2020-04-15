// Exp-02 part 1 :Fibonacci Series using loop

import java.io.*;

public class Exp2_3 {
	public static void main (String[] args) {
		int n =10;
		int first = 0;
		int second=  1;
		int upd = 0;
		System.out.println(first);
		System.out.println(second);

		// for loop 
		for (int i=0;i<n-2;i++){
			upd = first + second;
			System.out.println(upd);
		// update variable
			first = second;	
			second = upd;
		}	
	}//main
}//test