package multithreads;
				//	multi threading by interface 2 way
						
class  Hi implements Runnable{
	public void run() { 
		for(int i=0;i<=5;i++) {
			System.out.println("hi");
			try { Thread.sleep(1000);}
			catch (Exception e) {
				// TODO: handle exception
			}}}}

class Hello implements Runnable{
	public void run() { 
		for(int i=0;i<=5;i++) {
			System.out.println("hello");
			try { Thread.sleep(1000);}
			catch (Exception e) {
				// TODO: handle exception
			}
			}}}

class demo2{
	public static void main(String[] args) {
		Runnable h1=new Hi();  //creating the reference of interface
		Runnable h2=new Hello();
		
		Thread t1=new Thread(h1);  //creating thread object & linking the runnable obj 
		Thread t2=new Thread(h2);
		
		t1.start();  //it will call the run()
		t2.start();
	
	}
}
