package JavaThreads;


class Parent{
	public void m1() {
		System.out.println("Parent class");
	}
}
class T1 extends Thread{
	public void run() {
		System.out.println("by Thread Class");
	}
}

class T2 extends Parent implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From Runnable Interface");
	}
	
}
public class ThreadConcept {

	public static void main(String[] args) {
		T1 t1 = new T1();
		t1.start();
		
		T2 t2 = new T2();
		Thread trd = new Thread(t2);
		trd.start();
		

	}

}
