package fileoperations;

import java.io.FileOutputStream;  
import java.util.Scanner;

public class createafile {

	public static void main(String[] args) {
	try{    
	                 FileOutputStream fout=new FileOutputStream("/home/smitha/Desktop/israr/testout.txt");    
	                 
	                 System.out.println("enter the text message:");
	                 String s="";
	                 Scanner sc=new Scanner(System.in);
	                 s=sc.nextLine();
	                 
	                 System.out.println(s+"\n");
	                 
	                 byte b[]=s.getBytes();//converting string into byte array    
	                 fout.write(b);    
	                 fout.close();    
	                 
	                 System.out.println("success...");    
	                }
	catch(Exception e)
	{System.out.println(e);}    
}
}