package JavaSyncExample;

public class Counter {
	
	protected long count = 0;
	
	public synchronized void add(long value) {
		this.count += value;
	}
	
	
}
