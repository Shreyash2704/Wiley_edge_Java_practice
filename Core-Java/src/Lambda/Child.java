package Lambda;

@FunctionalInterface
public interface Child extends Parent {
	//public void print();
	
	default void sayHi() {
		
	}
}
