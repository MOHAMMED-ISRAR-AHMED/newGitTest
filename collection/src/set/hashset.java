package set;
import java.util.*;

public class hashset {
public static void main(String[] args) {

	Set<String> s=new HashSet<String>();
	s.add("city");
	s.add("state");
	s.add("city");  // does not allows to store duplicates
	s.add("district");
	System.out.println(s+"\n");
	
	System.out.println("this how it does not maintains the insertion order\n");
	Set<Integer> hsetNumbers = new HashSet<Integer>();
	 
	hsetNumbers.add(13);
	hsetNumbers.add(42);
	hsetNumbers.add(45);
	hsetNumbers.add(12);
	 
	for(Integer number : hsetNumbers){  // this how it does not maintains the insertion order
	    System.out.println(number);
	}
	
	System.out.println();
	System.out.println("converting hashset to linkedhashset but the insertion order is not proper because it is hashset\n");
	
	Set<Integer> hSetNumbers = new HashSet<Integer>();
	 
	hSetNumbers.add(13);
	hSetNumbers.add(42);
	hSetNumbers.add(45);
	hSetNumbers.add(12);
	 
	/*
	 * To convert HashSet to LinkedHashSet, use
	 * the copy constructor
	 */
	LinkedHashSet<Integer> lhSetNumbers = new LinkedHashSet<Integer>(hSetNumbers);
	 
	for(Integer number : lhSetNumbers){
	    System.out.println(number);
	}
	
	System.out.println();
	// Sorting HashSet using List 
    List<String> list = new ArrayList<String>(s); 
    Collections.sort(list); 

    // Print the sorted elements of the HashSet 
    System.out.println("HashSet elements "
                       + "in sorted order "
                       + "using List: "
                       + list+"\n"); 
    
    // Sorting HashSet using TreeSet 
    TreeSet<String> treeSet = new TreeSet<String>(s); 

    // Print the sorted elements of the HashSet 
    System.out.println("HashSet elements "
                       + "in sorted order "
                       + "using TreeSet: "
                       + treeSet+"\n"); 
    
    Set<Integer> setNumbers = new LinkedHashSet<Integer>();
	 
    System.out.println("using linkedlist we can maintain the insertion order");
	
    setNumbers.add(13);
	setNumbers.add(42);
	setNumbers.add(45);
	setNumbers.add(12);
	 
	for(Integer number : setNumbers){  // using linkedlist we can maintain the insertion order
	    System.out.println(number);
	}

}
}