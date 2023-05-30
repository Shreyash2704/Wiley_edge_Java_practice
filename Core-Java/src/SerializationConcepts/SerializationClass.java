package SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Books b1 = new Books(108,"Java Essentials");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Sahil\\Downloads\\books.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b1);
		fos.close();
		System.out.println("Tsak done");
	}

}
