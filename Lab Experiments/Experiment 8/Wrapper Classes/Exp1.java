import java.util.*;
public class Exp1 {
    public static void main(String[] args) {
        int a =10;
        Integer i = Integer.valueOf(a);
        String str = Integer.toString(i);
        int s = Integer.parseInt(str);
        String str1 = String.valueOf(a);
        Integer j = Integer.valueOf(str1);
        int f = Integer.valueOf(j);
        System.out.println(a);
        System.out.println(str);
        System.out.println(s);
        System.out.println(str1);
        System.out.println(j);
        System.out.println(f);
    }   
}