package set;
import java.util.*;

public class linkedhashset {
public static void main(String[] args) {
	Set<String> s=new LinkedHashSet<String>();
	
	// Adding elements into the LinkedHashSet 
    // using add() 
    s.add("India"); 
    s.add("Australia"); 
    s.add("South Africa"); 

    Set<Integer> hsetNumbers = new HashSet<Integer>();
	 
	hsetNumbers.add(13);
	hsetNumbers.add(42);
	hsetNumbers.add(45);
	hsetNumbers.add(12);
	 
	for(Integer number : hsetNumbers){  // this how it the insertion order
	    System.out.println(number);
	}
    // Adding the duplicate 
    // element 
    s.add("India"); 

    // Displaying the LinkedHashSet 
    System.out.println(s); 
    
    LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
    // Adding elements
    hs.add(100);
    hs.add(200);
    hs.add(100);
    hs.add(300);
    // Traversing ArrayList
    for(Integer element : hs) {
      System.out.println(element); 
}
}
}