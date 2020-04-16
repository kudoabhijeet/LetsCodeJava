
import java.util.*;

public class Exp2_6 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] marks= new int[10];
		System.out.print("Enter Marks : (10 Students): ");
		for (int i =0;i<10;i++){
			marks[i]= scan.nextInt();
		}

		for (int i =0;i<10;i++){
			System.out.println(marks[i]);
		}

		// Sorting 
		Arrays.sort(marks);
		for (int i =0;i<10;i++){
			if (marks[i]>=40 && marks[i]<50){
				System.out.println(marks[i] + " " + "PASS");
			}
			else if (marks[i]>=51 && marks[i]<75){
				System.out.println(marks[i] + " " + "MERIT");
			}
			else if(marks[i]>=75){
				System.out.println(marks[i] + " " + "DISTINCTION");
			}

		}
		
		
	}
}