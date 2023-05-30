package IOStreamPackage;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Students{
	String name;
	String gender;
	int age;
	int grade;
	
	public Students(String n, String g, int a, int gr) {
		this.name = n;
		this.gender = g;
		this.age = a;
		this.grade = gr;
	}
	
	public void savedata() throws IOException{
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Sahil\\Downloads\\code1.txt");
	    DataOutputStream dout = new DataOutputStream(fout);
	    
        StringBuilder sb = new StringBuilder();
		 
		 FileInputStream file = new FileInputStream("C:\\Users\\Sahil\\Downloads\\code1.txt");
		 BufferedInputStream bis = new BufferedInputStream(file);
		 int i;
		 System.out.println("Data:");
		 while((i = bis.read()) != -1) {
			 System.out.print((char)i);
			 
		 }
		 bis.close();
		 file.close();
		 
	    
	    sb.append(this.name+"\n");
	    sb.append(this.gender+"\n");
	    sb.append(this.age+"\n");
	    sb.append(this.grade+"\n");
	    sb.append("----------------");
	    System.out.println(sb);
	    
	    dout.writeBytes(sb.toString());
	    dout.close();
	    fout.close();
	    
	    
	}
	public void showData() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Sahil\\Downloads\\code1.txt");
		 BufferedInputStream bis = new BufferedInputStream(file);
		 int i;
		 System.out.println("Data:");
		 while((i = bis.read()) != -1) {
			 System.out.print((char)i);
			 
		 }
		 bis.close();
		 file.close();
	}
}
public class FormClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileOutputStream fout = new FileOutputStream("C:\\Users\\Sahil\\Downloads\\code1.txt");
	    //DataOutputStream dout = new DataOutputStream(fout);
	    
	    Students st = new Students("Shreyash", "Male", 12, 50);
	    st.savedata();
	    Students st2 = new Students("Sahil", "Female", 22, 110);
	    st2.savedata();
	    st.showData();
	    
	}

}
