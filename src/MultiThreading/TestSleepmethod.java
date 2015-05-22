package MultiThreading;

public class TestSleepmethod extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++){
			
			try {
				Thread.sleep(253);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			
			System.out.println("Counter is : "+i);
			
		}
		
	}
	
}
