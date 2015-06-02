package JavaSyncExample;

public class MainClass {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		Thread t1 = new CounterThread(counter);
		Thread t2 = new CounterThread(counter);
		
		t1.start();
		t2.start();
		
	}

}
