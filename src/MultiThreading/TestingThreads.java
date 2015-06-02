package MultiThreading;

public class TestingThreads {
	public static void main(String[] args){
		
	    System.out.println("The Threads may not execute in the sequence they are ran");
	    for(int i=0; i<10; i++){
	      new Thread("Thread Number " + i){
	        public void run(){
	          System.out.println("Thread: " + getName() + " running");
	          
	        }
	      }.start();
	    }
	  }
}
