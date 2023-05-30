package JavaThreads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WeddingCard extends Thread{
	public void run() {
		System.out.println("Thread name: "+Thread.currentThread().getName());
	}
}

public class RishavWedddingCard {

	public static void main(String[] args) {
		//ExecutorService executor = Executors.newFixedThreadPool(4);
		//ExecutorService executor = Executors.newCachedThreadPool();
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(4);
		
//		for(int i=0;i<100;i++) {
//			executor.execute(new WeddingCard());
//		}
		
		 executor.schedule(new WeddingCard(),3,TimeUnit.SECONDS);
	}

}
