package Exception;

public class FinalBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			try {
				System.out.println(10/0);
			}catch(Exception e) {
				System.out.println(e.getMessage()+": error");
			}finally {
				System.out.println("Nested final");
			}
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
			
		}
		finally {
			//System.exit(0);
			//System.out.println(10/0);
			System.out.println("Close Connection");
		}
	}

}
