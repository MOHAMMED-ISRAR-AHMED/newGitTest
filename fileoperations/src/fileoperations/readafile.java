package fileoperations;

import java.io.*;

public class readafile {

  public static void main(String args[]) {

     try {
    	 	// to read a file
    	 FileInputStream input = new FileInputStream("/home/smitha/Desktop/israr/testout.txt");
    	
    	 // Returns the number of available bytes
         System.out.println("Available bytes at the beginning: " + input.available());

        System.out.println("Data in the file: ");

        // Reads the first byte
        int i = 0;

       while( (i=input.read()) != -1)  // to read till the end of the file
       {      
    	   System.out.print((char)i);
       }
           input.close();
        }

     catch(Exception e) {
        e.getStackTrace();
     }
  }
}