package JavaThreads;

class Demo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class ThreadGroups {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Parent Group");
		ThreadGroup tgChild = new ThreadGroup(tg,"CHild Group");
		
		Thread t1 = new Thread(tg,new Demo(),"First");
		Thread t2 = new Thread(tgChild,new Demo(),"Second");
		Thread t3 = new Thread(tg,new Demo(),"Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Active group of threads: "+ tg.activeCount());
		System.out.println("Active group of threads: "+ tgChild.activeCount());
		
		
	}

}
