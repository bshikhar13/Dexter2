package producerConsumerProblem;

import java.*;

public class Producer extends Thread{
	
	private Account account;
	
	public Producer(Account account){
		this.account = account;
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			account.put(i);
			System.out.println("Producer put "+i+" in account");
			try{
				sleep((int)(Math.random()*100));
			}catch(InterruptedException e){
				System.out.println("Error !!");
			}
		}
	}
}
