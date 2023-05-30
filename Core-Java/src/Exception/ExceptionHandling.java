package Exception;
import java.lang.*;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First Statement");
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println(arr[1]);
			System.out.println(arr[5]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("Final statement");
	}

}
