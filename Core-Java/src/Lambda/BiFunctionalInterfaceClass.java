package Lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BiFunctionalInterfaceClass {

	public static void main(String[] args) {
		//It is functional interface extends Function interface 
		//Accept and return same datatype.
		UnaryOperator<Integer> n = (a) -> {
			return a^2;
			};
		System.out.println(n.apply(10));

		//or
		
		UnaryOperator<Integer> n1 = a -> a^1;
		
		//Binary operator
		BinaryOperator<Integer> n2 = (a,b) -> a+b;
		System.out.println(n2.apply(10,5));
	}

}
