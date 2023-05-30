package StringClasses;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley");
		System.out.println(sb.toString().equals(sb1.toString()));
		String ss = sb.toString();
		System.out.println(ss.equals(sb1.toString()));
		
		sb.insert(5,"-Edge");
		System.out.println(sb.reverse());
		System.out.println(sb.delete(2,4));
		StringBuffer ss1 = new StringBuffer();
		ss1.append(sb);
		System.out.println(ss1.append("\n-java"));
	}

}
