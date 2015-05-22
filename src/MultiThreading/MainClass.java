package MultiThreading;

public class MainClass {

	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.start();
		
		TestSleepmethod t2 = new TestSleepmethod();
		TestSleepmethod t3 = new TestSleepmethod();
		
		System.out.println("\nTesting ThreadSleep Method\n");
		
		t2.start();
		t3.start();
		
		TestJoinMethod tjm1=new TestJoinMethod();  
		TestJoinMethod tjm2=new TestJoinMethod();  
		TestJoinMethod tjm3=new TestJoinMethod();  
		
		tjm1.start();  
		 
		try{  
		  tjm1.join();  
		 }catch(Exception e){
			 System.out.println(e);
		}  
		
		  
		 tjm2.start();  
		 tjm3.start();  
	}

}
