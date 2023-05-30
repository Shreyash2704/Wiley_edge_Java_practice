package Lambda;

interface Sayable{
	void say();
}

class Info{
	Info(String msg){
		System.out.println("your Message :- "+msg);
	}
}

interface getInfo{
	Info getMsg(String str);
}
public class MethodReference {

	//Method reference to a interface 
	//1.Static method
	//2.instance method
	//3.constructor
	public static void saySomething() {
		System.out.println("hello,this is static method");
	}
	
	public static void processSomething() {
		System.out.println("processing...");
	}
	public void hello() {
		System.out.println("Helo from helllo");
	}
	
	public static void main(String[] args) {
		//static reference
		Sayable sayable = MethodReference::saySomething;
		sayable.say();

		//Thread t1 = new Thread(MethodReference::processSomething);
		//t1.start();
		
		//object reference
		MethodReference mt = new MethodReference();
		Sayable isv = mt::hello;
		isv.say();
		
		//Thread t2 = new Thread(new MethodReference()::hello);
		//t2.start();
 		
		//Constructor
		getInfo info = Info::new;
		info.getMsg("Alert!...");
		
	}

}
