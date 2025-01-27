package list;

import java.io.*; 
import java.util.*; 

class arraylist { 
	public static void main(String[] args) 
	{ 
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		System.out.println(list+"\n");

		//Traversing list through Iterator  
		  Iterator itr=list.iterator();//getting the Iterator  
		  while(itr.hasNext()){//check if iterator has the elements  
		   System.out.println(itr.next()+"\n");//printing the element and move to next  
		  }
		  
		list.remove("Ravi"); 
		list.add("fighter");
		System.out.println(list+"\n");
		
		System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  list.set(1,"Date");
		  
		for(String name:list)    
		    System.out.println(name+"\n");    
		
		List<String> list1=new ArrayList<String>();  
		  list1.add("Mango");  
		  list1.add("Apple");  
		  list1.add("Banana");  
		  list1.add("Grapes");  
		  
		  System.out.println("before Sorted fruits are..."+list1+"\n");
		  
		  //Sorting the list  
		  Collections.sort(list1);  
		  //Traversing list through the for-each loop  
		  for(String fruit:list1)  
		    System.out.println(fruit);  
		      
		 System.out.println("after Sorted fruits are...\n");
				
		list.clear();            // clear all letters elements  
		System.out.println(list);
		 
	} 
}