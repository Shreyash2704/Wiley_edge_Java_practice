package Lambda;

public class LambdaClass {

	static String printThing(Printable thing) {
		return thing.print("Wiley");
	}
	public static void main(String[] args) {
		Product myp = new Product();
		
//		printThing(()->{
//			//System.out.println("Hello");
//			return "Hello";
//		});
//		
		
		Printable lambda = s -> {
			return s+" Edge";
			};
		System.out.println(printThing(lambda));
		
	}
	

}
