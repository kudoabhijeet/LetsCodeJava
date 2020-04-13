import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to : ");
        int n = scan.nextInt();
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("Factorial : " + fact);
        scan.close();
    }
}