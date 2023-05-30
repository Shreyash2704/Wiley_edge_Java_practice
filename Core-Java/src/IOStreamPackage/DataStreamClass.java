package IOStreamPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\Sahil\\Downloads\\code.txt");
	    DataInputStream din = new DataInputStream(fin);
	    int i;
	    while((i = din.read()) != -1) {
			 System.out.print((char)i);
			 
		 }
		 din.close();
		 fin.close();
		 
        FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\Sahil\\\\Downloads\\\\code1.txt");
	    DataOutputStream dos = new DataOutputStream(fout);
	    dos.writeBytes("My name is shreyash jhds");
	    dos.flush();
	    dos.close();
	    
	    FileInputStream fin_ = new FileInputStream("C:\\Users\\Sahil\\Downloads\\code1.txt");
	    DataInputStream din_ = new DataInputStream(fin_);
	    
	    int count = fin_.available();
	    byte[] ba = new byte[count];
	    
	    din_.read(ba);
	    for(byte b:ba) {
	    	System.out.print((char)b);
	    }
		 din_.close();
		 fin_.close();
	    
	}

}
