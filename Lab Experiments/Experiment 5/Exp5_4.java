import java.util.*;

interface newInt {
    public float division(float a,float b);
    public float modulus(float a, float b);
}
class TestClass implements newInt{
    public float division(float a,float b) {
        return a / b;
    }    
    public float modulus(float a,float b) {
        return a % b;
    }
}

public class Exp5_4 {
    public static void main( String[] args) {
        TestClass obj = new TestClass();
        System.out.println(obj.division(4,2));
        System.out.println(obj.modulus(5,2));
    }
}