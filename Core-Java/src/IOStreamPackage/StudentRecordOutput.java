package IOStreamPackage;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import IOStreamPackage.Student; 

public class StudentRecordOutput {
	DataOutputStream dataOutput;
	StringBuilder sb = new StringBuilder();
	public StudentRecordOutput(String outputFile) throws IOException {
		
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
		
	}
	
	public void writer(Student student) throws IOException {
		//dataOutput.writeUTF(student.getName());
		sb.append(student.getName()+"\n");
		//dataOutput.writeBoolean(student.getGender());
		sb.append(student.getGender()+"\n");
		//dataOutput.writeInt(student.getAge());
		sb.append(student.getAge()+"\n");
		//dataOutput.writeFloat(student.getGrade());
		sb.append(student.getGrade()+"\n");
		sb.append("-------------"+"\n");
	}
	
	public void save() throws IOException {
		dataOutput.writeBytes(sb.toString());
		dataOutput.close();
	}
	
	
	public static void main(String[] args) {
		
		
		String outputfile = "C:\\Users\\Sahil\\Downloads\\code1.txt";
		
		List<Student> listStudent = new ArrayList<>(); 
		
		listStudent.add(new Student("venkat", true, 28, 90.1f));
		listStudent.add(new Student("Anmol", true, 21, 81.5f));
		listStudent.add(new Student("Shreya", false, 18, 91.1f));
		listStudent.add(new Student("Rishav", true, 19, 95.1f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputfile);
			
			for(Student student: listStudent) {
				outputWriter.writer(student);
			}
			
			outputWriter.save();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}