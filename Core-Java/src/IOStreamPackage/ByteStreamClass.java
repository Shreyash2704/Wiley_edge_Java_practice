package IOStreamPackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteStreamClass {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
//	  FileOutputStream fout = new FileOutputStream("C:\\Users\\Sahil\\Downloads\\code.txt");
//      BufferedOutputStream bof = new BufferedOutputStream(System.out);
//	  String s = "I am a programmer";
//	  byte[] b = s.getBytes();
//	  fout.write(b);
//	  
//	  try {
//		bof.write(b);
//		bof.flush();
//		bof.close();
//	  }catch(IOException e) {
//		  e.printStackTrace();
//	  }
		 FileInputStream file = new FileInputStream("C:\\Users\\Sahil\\Downloads\\code.txt");
		 BufferedInputStream bis = new BufferedInputStream(file);
		 int i;
		 
		 while((i = bis.read()) != -1) {
			 System.out.println((char)i);
			 
		 }
		 bis.close();
		 file.close();
	}
	  
	

}
