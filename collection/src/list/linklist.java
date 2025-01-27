package list;

import java.io.*;
import java.util.*;

public class linklist {
	public static void main(String[] args) {
		List<String> l1=new LinkedList<String>();
		List<String> l2=new LinkedList<String>();
		
		// adding elements
		l1.add("delhi");
		l1.add("dubai");
		l1.add("newyork");
		System.out.println(l1+"\n");
		
		//traversing
		for(String element:l1)
		System.out.println(element+"\n");
		
		//size 
		System.out.println("total elements:"+l1.size()+"\n");
		
		//sorting
		Collections.sort(l1);
		System.out.println(l1+"\n");
		
		l2.add("usa"+"\nkuwait");
		l1.addAll(l2);
		System.out.println(l1+"\n");
		
		//removing elements
		l1.remove(2);
		l1.remove("delhi");
		System.out.println(l1+"\n");
		
		//adding elements to specfic index
		
		l1.add(0, "bangalore");
		System.out.println(l1);
	}
}