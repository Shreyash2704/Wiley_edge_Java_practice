package SerializationConcepts;

import java.io.Serializable;

public class Books implements Serializable {
	int id;
	String name;
	public Books(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
