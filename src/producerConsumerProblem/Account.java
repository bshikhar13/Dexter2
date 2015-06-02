package producerConsumerProblem;

public class Account {
	
	private boolean available = false;
	private int ammount ; 
	
	public synchronized int get(){
		while(available == false){
			try{
				wait();
			}catch(InterruptedException e){
				
			}
		}
		
		available = false;
		notifyAll();
		return ammount;
	}
	
	public synchronized void put(int ammount) {
		while(available == true){
			try{
				wait();
			}catch(InterruptedException e){
				
			}
		}
		this.ammount = ammount;
		available = true;
		notifyAll();
	}
}
