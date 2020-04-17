// Exp-04 part 1 :Inheritance
import java.io.*;

//Super Class
class Fruit {
    private String  season = new String("Summers"); //Private Access Modifier
    int price = 80;
    void getprice(){
        System.out.println(price);
    }
}
//Sub Class
class Mango extends Fruit {
    String name = new String("Mango");
}

public class Exp4_1 extends Fruit {
	public static void main (String[] args) {
        Mango obj = new Mango();
        obj.getprice();
       // System.out.print(obj.season);

	}//main
}//test