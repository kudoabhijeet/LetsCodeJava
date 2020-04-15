import java.io.*;

// Class Box
/** 
* 
* @author Abhijeet
*/
  /** 
* This is a program for adding two numbers in java. 
    * @param args 
*/
class Box {
    public int len;
    public int width;
    public int depth;
    // default constructor
/**
* This is the default constructor 
*/
    public Box (){
        len = 10;
        width = 10;
        depth = 10;
    }
 /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param len This is the first paramter to addNum method
   * @param width  This is the second parameter to addNum method
   */
    public void getVolume(int len, int width, int depth){
        System.out.print("Volume :");
        System.out.println(len*width*depth);
    }
}

public class Exp2_5 {
    
	public static void main (String args[]) {
		int first = Integer.parseInt(args[0]);
		int second= Integer.parseInt(args[1]);
		int third = Integer.parseInt(args[2]);
        Box myBox = new Box();
        myBox.getVolume(first,second,third);
		}//main
}//CLASS