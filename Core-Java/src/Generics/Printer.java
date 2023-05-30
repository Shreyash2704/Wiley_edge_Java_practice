package Generics;

public class Printer<T> {
    T val;
	public Printer(T val) {
		super();
		this.val = val;
	}
	public void print() {
		System.out.println(val);
	}

}
