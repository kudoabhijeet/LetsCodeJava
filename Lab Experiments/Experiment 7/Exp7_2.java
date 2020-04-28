import java.util.*;
public class Exp7_2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception!! Divide by Zero");
        }

    }

}