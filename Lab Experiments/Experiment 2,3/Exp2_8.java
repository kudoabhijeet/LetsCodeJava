import java.util.*;
import java.lang.*;

public class Exp2_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr= new double[10];
        double sq,sum=0;
		System.out.print("Enter Elements: ");
		for (int i =0;i<10;i++){
			arr[i]= scan.nextInt();
        }
        for (int i =0;i<10;i++){
            sq = Math.pow(arr[i], 2);
            System.out.println(sq);
            sum+=sq;
        }   
        System.out.println("Sum :" + sum);
    }
}