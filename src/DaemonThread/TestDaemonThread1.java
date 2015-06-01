package DaemonThread;

public class TestDaemonThread1 extends Thread{
	
	public void run(){  
		
		if(Thread.currentThread().isDaemon()){								//checking for daemon thread  
			System.out.println("daemon thread work");  
		}else{  
			System.out.println("user thread work");  
		}  
		 }  
		
	
}
