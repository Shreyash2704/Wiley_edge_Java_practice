package JavaThreads;

class Sheet{
	public synchronized void writeln(int k) {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(i+k);
			}
		}
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(i+k+99);
			}
		}
		for(int i=1;i<=10;i++) {
			System.out.println(i*k);
		}
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(i+k+99);
			}
		}
		for(int i=1;i<=10;i++) {
			System.out.println(i-k);
		}
	}
}

class Person1 extends Thread{
	Sheet st;
	public Person1(Sheet st) {
		super();
		this.st = st;
	}
	public void run() {
		st.writeln(10);
	}
}

class Person2 extends Thread{
	Sheet st;
	public Person2(Sheet st) {
		super();
		this.st = st;
	}
	public void run() {
		st.writeln(11);
	}
}

public class SynchronizatioClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheet st = new Sheet();
		Person1 t1 = new Person1(st);
		Person2 t2 = new Person2(st);
		Person2 t3 = new Person2(st);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
