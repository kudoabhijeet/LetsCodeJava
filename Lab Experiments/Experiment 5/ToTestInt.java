import java.util.*;

interface test { 
    public int square(int i);
}
class Arithmetic implements test{
    public int square(int i){
        return i*i;
    }
}
class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        System.out.println(obj.square(2));
    }
}