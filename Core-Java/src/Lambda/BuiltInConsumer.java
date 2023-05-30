package Lambda;

import java.util.function.Consumer;

public class BuiltInConsumer {

	public static void main(String[] args) {
		Consumer<Integer> g = (Integer age) ->{
			if(age>18) {
				System.out.println("eligible");
			}
			else {
				System.out.println("not eligible");
			}
		};
		g.accept(20);
	}

}
