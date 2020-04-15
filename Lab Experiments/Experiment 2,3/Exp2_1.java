import java.io.*;

public class Exp2_1 {
	public static void main (String[] args) {
		int first = Integer.parseInt(args[0]);
		int second= Integer.parseInt(args[1]);
		int third = Integer.parseInt(args[2]);

		// greatest of three 
		if(first > second && first > third){
			System.out.println("Greatest :" + first);
			}
		else if (second > third && second > first) {
			System.out.println("Greatest :" + second);
			}
		else if (third > second && third> first) {
			System.out.println("Greatest :" + third);
			}
		}//main
}//test