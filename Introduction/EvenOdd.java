import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even!");
        }
        else {
            System.out.println("Odd!");
        }
    }

}