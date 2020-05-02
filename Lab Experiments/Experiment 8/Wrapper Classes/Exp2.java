public class Exp2 {
    public static void main(String[] args) {
        float a = 1.8;
        FLoat i = Float.valueOf(a);
        String str = Float.toString(i);
        float j = Float.parseFloat(str);   
        String str1 = String.valueOf(j);
        Float j = Float.valueOf(str1);
        float f = Float.valueOf(j);
        System.out.println(a);
        System.out.println(i);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(j);
        System.out.println(f);
}