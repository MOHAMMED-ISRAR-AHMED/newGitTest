package multithreads;
				//	multi threading
						
class  hi {
	public void show() { 
		for(int i=0;i<=5;i++) {
			System.out.println("hi");
			try { Thread.sleep(1000);}
			catch (Exception e) {
				// TODO: handle exception
			}}}}

class hello {
	public void show() { 
		for(int i=0;i<=5;i++) {
			System.out.println("hello");
			try { Thread.sleep(1000);}
			catch (Exception e) {
				// TODO: handle exception
			}
			}}}

class demo1{
	public static void main(String[] args) {
		hi h1=new hi();
		hello h2=new hello();
		
		h1.show();
		h2.show();
	
	}
}

/*/
             // 1st way of  extending the class //
               
              
class  hi extends Thread {
	public void run() { 
		for(int i=0;i<=5;i++) {
			System.out.println("hi");
			try { Thread.sleep(5000);}
			catch (Exception e) {
				// TODO: handle exception
			}
			}}}

class hello extends Thread {
	public void run() { 
		for(int i=0;i<=5;i++) {
			System.out.println("hello");
			try { Thread.sleep(5000);}
			catch (Exception e) {
				// TODO: handle exception
			}
			}}}

class demo1{
	public static void main(String[] args) {
		hi h1=new hi();
		hello h2=new hello();
		
		h1.start();
		try { Thread.sleep(10);}
		catch (Exception e) {
			// TODO: handle exception
		}
		h2.start();  // it will call to run()
	
	}
} //*/