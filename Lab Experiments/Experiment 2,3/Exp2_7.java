import java.util.*;

public class Exp2_7 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int digit[]= new int[3];
		System.out.print("Enter a three digits:");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			 for (int k = 0; k < 3; k++) {
			  if (i != j && j != k && k != i) {
			   System.out.println(digit[i] + "" + digit[j] + ""
				 + digit[j]);
			  }
			 }
			}
		   }
		 scan.close();
	}//main
}