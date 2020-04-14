import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = scan.nextInt();
        int rev = 0;
        while(num!=0){
            int mod = num %10;
            rev = rev*10+mod;
            num=num/10;
        }  
        System.out.print("Reversed to :" + rev);
        scan.close();
    }
}