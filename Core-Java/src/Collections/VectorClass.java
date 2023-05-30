package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
public class VectorClass {

	public static void main(String[] args) throws InterruptedException {
		int size = 10000000;
		
	    long startTime = System.currentTimeMillis();	
	    int b = 0;
		List<Integer> arr = new ArrayList<>();
		for(int i=0;i<size;i++) {
			arr.add(i);
			//b = i+1;
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
		long startTime1 = System.currentTimeMillis();
		List<Integer> arr1 = new Vector<>();
		for(int i=0;i<size;i++) {
			arr1.add(i);
			//b = i+1;
		}
		
		long endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-startTime1);
		
		List<Integer> threadlist = Collections.synchronizedList(new ArrayList<>());
		List<Integer> threadvector = new Vector<>();
		Thread t1 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				threadlist.add(i);
				//b = i+1;
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				threadlist.add(i);
				//b = i+1;
			}
		});
		startTime1 = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-startTime1);
		System.out.println(threadlist.size());
		
		Thread t3 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				threadvector.add(i);
				//b = i+1;
			}
		});
		
		Thread t4 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				threadvector.add(i);
				//b = i+1;
			}
		});
		startTime1 = System.currentTimeMillis();
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		endTime1 = System.currentTimeMillis();
		System.out.println(endTime1-startTime1);
		System.out.println(threadvector.size());
		
		Vector<Integer> nextFivePrimeNumbers = new Vector<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		
		Enumeration<Integer> en = nextFivePrimeNumbers.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
