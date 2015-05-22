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

	}

}
