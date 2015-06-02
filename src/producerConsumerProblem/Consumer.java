package producerConsumerProblem;

import java.*;

public class Consumer extends Thread {
	private Account account;
	
	public Consumer(Account account){
		this.account = account;
	}
	
	public void run(){
		int value = 0;
		for(int i=0;i<10;i++){
			
			value = account.get();
			System.out.println("Consumer got "+value+" from account");
			try{
				sleep((int)(Math.random()*100));
			}catch(InterruptedException e){
				System.out.println("Error !!");
			}
		}
	}
}
