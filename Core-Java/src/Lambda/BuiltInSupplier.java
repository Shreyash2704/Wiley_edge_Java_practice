package Lambda;

import java.util.function.Supplier;

public class BuiltInSupplier {

	public static void main(String[] args) {
		Supplier<String> msg = () -> "Hello Shreyash";
		System.out.println(msg.get());

	}

}
