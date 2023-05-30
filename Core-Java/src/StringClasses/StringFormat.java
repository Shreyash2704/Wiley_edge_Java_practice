package StringClasses;

import java.util.Arrays;
import java.util.List;

public class StringFormat {

	public static void main(String[] args) {
		String s = "Shreyash";
		float salary = 2000.34f;
		System.out.format("%s has %.2f salary per hour\n",s,salary);

		List<String> techStack = Arrays.asList("JAVA","PYTHON","C");
		for(String st:techStack) {
			System.out.format("%-10s - In Stock%n",st);
		}
	}

}
