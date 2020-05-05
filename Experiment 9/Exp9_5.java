import java.util.*;

public class Exp9_5 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add("Element1");// Adding object in arraylist
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");
        // Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.reverse(list);
        System.out.print("Reversed:\n ");
        Iterator itr1 = list.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());

        }
        ArrayList<String> arrayListClone = (ArrayList<String>) list.clone();

        System.out.println(arrayListClone);
    }
}