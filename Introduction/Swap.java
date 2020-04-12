// Java Program to Swap two Numbers

public class Swap {
    public static void main(String[] args) {
        int first = 100;
        int second = 200;
        int temp;
        System.out.println("Before Swapping");
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
        temp = first;
        first = second;
        second = temp;
        System.out.println("After Swapping");
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
    }
}