import java.io.*;
import java.util.*;

abstract class Worker {
    String name = new String();
    int salary_rate;
    Worker (String n, int sr){
        name = n;
        salary_rate = sr;
    }   
    abstract int ComPay();
}
class DailyWorker extends Worker{
    int hours;
    DailyWorker(String n,int sr, int h){
        super(n,sr);
        hours =h;
    }
    int ComPay(){
        int days = hours/24;
        return salary_rate*days;
    }
}//DW
class SalariedWorker extends Worker{
    int hours;
    SalariedWorker(String n,int sr, int h){
        super(n,sr);
        hours = h;
    }
    int ComPay()
    {
        int t = hours/168;
        return t*salary_rate;
    }
}//SW
    class Exp4_3{
        public static void main(String[] args) {
            SalariedWorker obj = new SalariedWorker("NameSw",20,168);
            System.out.println("Salary Worker Salary :" +obj.ComPay());
            DailyWorker obj1 = new DailyWorker("NameDw",40,24);
            System.out.println("Daily Worker Salary :" +obj1.ComPay());

        }//main
    }//test
