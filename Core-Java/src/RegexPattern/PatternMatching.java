package RegexPattern;

import java.util.regex.*;

public class PatternMatching {

	public static void main(String[] args) {
		String input = "The key to Learn is consistency";
		Pattern pattern = Pattern.compile("learn",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.find()) {
			System.out.println("Pattern fond between "+matcher.start()+" and "+matcher.end());
		}
		
		System.out.println(input.indexOf("learns"));

	}

}
