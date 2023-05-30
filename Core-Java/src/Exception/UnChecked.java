package Exception;
import java.util.*;
class StringNotFound extends RuntimeException{
	public StringNotFound(String message) {
		super(message);
	}
}
public class UnChecked {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("Shreyash");
		
		if(!s.contains("Venkata")) {
			try {
				throw new StringNotFound("Wrong String");
			}catch(StringNotFound e) {
				e.printStackTrace();
			}
		}

	}

}
