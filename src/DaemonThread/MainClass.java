package DaemonThread;

public class MainClass {
	
	public static void main(String[] args){  
		
		TestDaemonThread1 t1=new TestDaemonThread1();
		TestDaemonThread1 t2=new TestDaemonThread1();  
		TestDaemonThread1 t3=new TestDaemonThread1();  
		  
		t1.setDaemon(true);
		    
		t1.start();  
		t2.start();  
		t3.start();  
	}  
	
	
}
