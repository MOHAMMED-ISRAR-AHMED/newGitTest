package maps;
import java.util.*;
import java.util.Map.Entry;

public class hashmap {
public static void main(String[] args) {
	HashMap<Integer,String> hp=new HashMap<Integer,String>(); // new generic style
	System.out.println("no insertion order but maintains the order"+"\n");
	hp.put(4, "vishal"); 
	hp.put(2, "vaibhav");
    hp.put(1, "sachin"); 
    hp.put(3, "akash"); 
    hp.put(5,"vaibhav"); // can have duplicate values
    hp.put(5,"vaibhav"); // but cant have duplicate key it should be unique
    System.out.println(hp+"\n");

    //Elements can traverse in any order  
    System.out.println("traversing"+"\n");
    for (Entry<Integer, String> e : hp.entrySet()) { 
        System.out.println(e.getKey() + " "+ e.getValue()+"\n"); 
    }
        HashMap<Integer,String> numbers = new HashMap<Integer,String>();
        numbers.put(1, "First");
        numbers.put(2, "Second");
        System.out.println("Original HashMap: " + numbers+"\n");

        // Using merge() Method
        numbers.merge(4, "First", (oldValue, newValue) -> oldValue + newValue);  //supports from jdk 1.8 onwards
        System.out.println("New HashMap of merge(): " + numbers+"\n");

     // Creating a hashmap of even numbers
        HashMap<Integer,String> evenNumbers = new HashMap<>();
        evenNumbers.put(2, "Two");
        evenNumbers.put(4, "Four");
        System.out.println("HashMap1: " + evenNumbers);

        // Creating a hash map from other hashmap
        HashMap<Integer,String> numbers1 = new HashMap<>(evenNumbers);
        numbers1.put(3, "Three");
        System.out.println("HashMap2: " + numbers1);}
}