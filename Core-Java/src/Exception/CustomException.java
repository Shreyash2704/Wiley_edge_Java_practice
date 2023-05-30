package Exception;

public class CustomException {

	public static void getAge(int age) throws AgeNotValid {
		if(age < 18) {
			throw new AgeNotValid();
		}
		else {
			System.out.println("Age is valid");
		}
	}
	public static void main(String[] args){
		try {
			getAge(10);
		} catch (AgeNotValid e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

}
