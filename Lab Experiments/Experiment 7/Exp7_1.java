import java.util.*;

public class Exp7_1 {
    public static void main(String[] args) {
        int arr[]= new int[10];
        try {
            arr[11]= 100;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Bound Exception!");
        }
        System.out.println("Out of try block");
    }
}