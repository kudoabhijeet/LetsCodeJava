
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series : ");
        System.out.println(a);
        System.out.println(b);
        int c;
        for (int i =0; i<5;i++){
            c =a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}