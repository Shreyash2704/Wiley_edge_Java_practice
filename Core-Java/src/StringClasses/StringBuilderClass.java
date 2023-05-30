package StringClasses;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder logMessage = new StringBuilder();
		long timestamp = System.currentTimeMillis();
		
		logMessage
		.append("[")
		.append(timestamp)
		.append("]")
		.append("User 123456")
		.append(": Hello ")
		.append("\n");
		
		logMessage
		.append("[")
		.append(System.currentTimeMillis())
		.append("]")
		.append("User 123457")
		.append(": Heyyy ")
		.append("\n");
		
		System.out.println(logMessage);

	}

}
