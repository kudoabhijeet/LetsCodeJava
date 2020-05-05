import java.util.*;

public class Exp9_7 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("E1");
        list.add("E2");
        list.add("E3");
        HashSet<String> set = new HashSet(list);
        System.out.println("Elements : " + set);
        if (set.contains("E2")) {
            System.out.println("Yes");
        }

        if (set.contains("E0") == false) {
            System.out.println("No");
        }
        set.clear();
        System.out.println("Cleared!" + set);
    }
}