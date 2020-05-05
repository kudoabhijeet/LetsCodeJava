import java.util.*;

public class Exp9_6 {
    public static void main(String[] args) {

        
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

        
        hash_map.put(10, "Element at 10");
        hash_map.put(11, "Element at 11");
        hash_map.put(19, "Element at 19");
        hash_map.put(15, "Element at 15");
        hash_map.put(3, "Element at 3");

        
        System.out.println("Mapped " + hash_map);

        // Checking for the key_element '20'
        System.out.println("Element at position '2' : " + hash_map.containsKey(2));
        System.out.println("'Element at 10' Present : " + hash_map.containsValue("Element at 10"));
        Set<Integer> keys = hash_map.keySet();
        System.out.println("Key :");
        for (Integer key : keys) {
            System.out.println(key);
        }
    }

}