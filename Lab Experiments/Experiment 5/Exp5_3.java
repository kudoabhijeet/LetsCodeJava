import java.util.*;
interface values {
    static float pi = 3.14f;
    public float compute(float a,float b);
}
class Rectangle implements values {
    public float compute(float a, float b){
        return a*b;
    }
}
class Circle implements values{
    public float compute(float a,float b){
        return pi*a*a;
    }
}
public class Exp5_3 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Circle obj1 = new Circle();
        System.out.println(obj.compute(2,4));
        System.out.println(obj1.compute(3,4));

    }
}