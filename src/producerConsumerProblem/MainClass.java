package producerConsumerProblem;

public class MainClass {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		Producer p1 = new Producer(a1);
		Consumer c1 =new Consumer(a1);
		p1.start();
		c1.start();
	}

}
