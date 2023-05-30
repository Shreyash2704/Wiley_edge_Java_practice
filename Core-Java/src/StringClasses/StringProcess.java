package StringClasses;

public class StringProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 = "Wiley";
//		String s2 = "Wiley";
//		
//		String s3 = new String("Wiley");
//		String s4 = new String("Wiley");
//		
//		System.out.println(s1 == s2);
//		System.out.println(s3 == s4);
//		System.out.println(s1 == s3);
		String s1 = "Java";
		String s2 = "Java2";
		String st = new String("Jello");
		String s3 = s1.concat(s2);
		String s4 = " jsjjs   ";
		
		System.out.println(st.replace('J', 'j'));
		String s5[] = s3.split("");
		
		
		System.out.println(s4);
		System.out.println(s4.trim());
	}

}
