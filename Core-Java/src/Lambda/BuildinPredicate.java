package Lambda;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;

public class BuildinPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> checkLength = (String str) -> str.length() == 4;
		List<String> l = Arrays.asList("Java","Python","Angular","Jira");
		l.forEach(ele ->{
			if(checkLength.test(ele)) {
				System.out.println(ele);
			}
		});
	}

}
