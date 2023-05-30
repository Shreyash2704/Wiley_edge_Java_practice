package Exception;

public class ExceptionPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void method() throws Exception {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Exception occur.");
	}

}
