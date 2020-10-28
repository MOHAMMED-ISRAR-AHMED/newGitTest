package maps;

import java.util.*;

public class linkedhashmap {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
	lhm.put(3, "three");
	lhm.put(1, "one");
	lhm.put(2, "two");
	lhm.put(2, "two"); // doesnt allows duplicates 
	
	System.out.println(lhm+"\n");
	
	// Using entrySet()
    System.out.println("Key/Value mappings: " + lhm.entrySet()+"\n");

    // Using keySet()
    System.out.println("Keys: " + lhm.keySet()+"\n");

    // Using values()
    System.out.println("Values: " + lhm.values()+"\n");
}
}
