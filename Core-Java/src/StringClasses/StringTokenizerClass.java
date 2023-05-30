package StringClasses;
import java.util.*;

public class StringTokenizerClass {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello,jdjedj,hbdhw",",");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

}
