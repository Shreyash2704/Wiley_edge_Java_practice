package Core_Java;

public class Counter{

	private static int count = 0;
	private final String name;
	
	public Counter(String name) {
		this.name = name;
	}
	public synchronized void increment() {
		count++;
	}
	public int getCount() {
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Counter c = new Counter("Shreyash");
		c.increment();
		System.out.println(c.name+""+c.count);
		
	}

}
