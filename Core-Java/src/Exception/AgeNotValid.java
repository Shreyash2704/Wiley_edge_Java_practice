package Exception;

public class AgeNotValid extends Exception {
	
	public String getMessage() {
		return "This age is not valid.";
	}
	public String toString() {
		return "age not applicable";
	}
}
