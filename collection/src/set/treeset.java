package set;
import java.util.*;

public class treeset {
public static void main(String[] args) {
	Set<String> ts=new TreeSet<String>();
	// using add() 
    ts.add("India"); 
    ts.add("Australia"); 
    ts.add("South Africa");
    ts.add("Australia");
    ts.add("Dubai");
    System.out.println(ts+"\n");
    
    System.out.println("automatically its assigns Ascending order..."+"\n");
    Iterator itr=ts.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next()+"\n");
    }

    System.out.println("Descending order..."+"\n");
    Iterator i=((TreeSet<String>) ts).descendingIterator(); // we are type casting because of Set<String> 
    while(i.hasNext()){
      System.out.println(i.next()+"\n");
    }
    
   System.out.println("TreeSet provides contains() method that true if elements is present in the set.\n"); 
    boolean iscontain = ts.contains("Ravi");
    System.out.println("Is contain Ravi: "+iscontain+"\n");
 
}
}
