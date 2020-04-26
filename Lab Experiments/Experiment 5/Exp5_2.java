import java.util.*;

interface A{
    public void meth1();
    public void meth2();

}
class MyClass implements A{
    public void meth1(){
        System.out.println("Method 1");
    }
    public void meth2(){
        System.out.println("Method 2");
    }
}
public class Exp5_2{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
    }
}