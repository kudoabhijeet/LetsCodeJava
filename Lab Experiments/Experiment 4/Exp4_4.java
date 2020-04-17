import java.io.*;
import java.util.*;
abstract class TrunkCalls {
    int charges;
    TrunkCalls(int c){
        charges =c;
    }
    abstract int getCharges();
}
class ordinary extends TrunkCalls{
    int minutes;
    ordinary(int c, int m){
        super(c);
        minutes=m;
    }
    int getCharges(){
        return charges*minutes;
    }
}
class urgent extends TrunkCalls{
    int minutes;
    urgent(int c, int m){
        super(c);
        minutes=m;
    }
    int getCharges(){
        return charges*minutes;
    }
}
class lightning extends TrunkCalls{
    int minutes;
    lightning(int c, int m){
        super(c);
        minutes=m;
    }
    int getCharges(){
        return charges*minutes;
    }
}
class Exp4_4{
    public static void main(String[] args) {
        ordinary obj = new ordinary(20,16);
        System.out.println("Ordinary Charges :" +obj.getCharges());
        urgent obj1 = new urgent(40,24);
        System.out.println("Urgent Charges :" +obj1.getCharges());

    }//main
}//test
