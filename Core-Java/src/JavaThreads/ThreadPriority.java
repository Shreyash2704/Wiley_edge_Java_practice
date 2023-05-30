package JavaThreads;

class TPriority extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread-"+Thread.currentThread().getName()+"Thread piority:-"+Thread.currentThread().getPriority());
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) throws InterruptedException {
		TPriority tp1 = new TPriority();
		TPriority tp2 = new TPriority();
		tp1.start();
		tp1.join();
		tp2.start();

	}

}
