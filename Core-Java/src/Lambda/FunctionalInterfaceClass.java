package Lambda;


/*
 * Function interface should have only one abstract class.
 */
@FunctionalInterface
interface Calc{
	int calculate(int val1,int val2);
	

}
public class FunctionalInterfaceClass {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c1 = (int val1,int val2) -> val1+val2;
		System.out.println("Result : "+ c1.calculate(54,56));
	}

}
