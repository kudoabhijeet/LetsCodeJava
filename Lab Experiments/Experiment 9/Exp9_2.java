class EvenNo extends Thread{
    public void run(){
         for(int i=0;i<10;i++){
            if(i%2 == 0)
            System.out.println(i + " " + "Even Number");
         }
     }
 }
 class OddNo extends Thread{
    public void run(){
         
         for(int i=0;i<10;i++){
            if(i%2 != 0)
            System.out.println(i + " " + "Odd Number");
         }
     }
}
public class Exp9_2 {
     public static void main(String[] args) {
         EvenNo e=new EvenNo();
         OddNo o=new OddNo();
         e.start();
         o.start();
     }
     
 }