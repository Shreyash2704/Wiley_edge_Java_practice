package Exception;

public class ThrowClass {

	public static void m1() {
		try {
			m2();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void m2() throws InterruptedException {
		Thread t = new Thread();
		t.sleep(1000);
		System.out.println("helo");
	}
	public static void main(String[] args) {
		System.out.println("1st");
		m1();
	}

}
