package multithreads;
/*
class demo3 extends Thread 
{ 
	public void run() 
	{ 
		System.out.println("Thread Running..."+"\n"); 
	} 
	public static void main(String[]args) 
	{ 
		demo3 p1 = new demo3(); 
		p1.start();
		System.out.println("max thread priority : " + p1.MAX_PRIORITY); 
		System.out.println("min thread priority : " + p1.MIN_PRIORITY);  
		System.out.println("normal thread priority : " + p1.NORM_PRIORITY); 
		
		demo3 p2 = new demo3();
		// Starting thread
		p2.start();
		// Setting priority
		p2.setPriority(2);
		// Getting priority
		int p = p2.getPriority();
		
		System.out.println("thread priority : " + p);  
		
			  }
			}
*/
/*
class demo3 extends Thread{
	 public void run(){
	  System.out.println("Name: "+Thread.currentThread().getName());
	  System.out.println("Daemon: "+Thread.currentThread().isDaemon());
	 }

	 public static void main(String[] args){
	  demo3 t1=new demo3();
	  demo3 t2=new demo3();
	  t1.start();
	  t1.setDaemon(false);//will throw exception here
	  t2.start();
	 }
	}
*/

public class demo3 extends Thread{
	 public void run(){
	  if(Thread.currentThread().isDaemon()){//checking for daemon thread
	   System.out.println("daemon thread work");
	  }
	  else{
	  System.out.println("user thread work");
	 }
	 }
	 public static void main(String[] args){
	  demo3 t1=new demo3();//creating thread
	  demo3 t2=new demo3();
	  demo3 t3=new demo3();

	  t1.setDaemon(true);//now t1 is daemon thread
	  
	  t1.start();//starting threads
	  t2.start();
	  t3.start();
	 }
	}
