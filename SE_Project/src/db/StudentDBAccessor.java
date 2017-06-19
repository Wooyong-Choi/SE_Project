package db;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import info.Student;

public class StudentDBAccessor {
	
	private File file;
	
	public StudentDBAccessor() {
		file = new File("student.db");
	}
	
	public ArrayList<Student> readFile() {
		try {			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			ArrayList<Student> list = (ArrayList<Student>) in.readObject();
			in.close();
			
			return list;
			
		} catch (FileNotFoundException e) {
			// ������ ���� ����
			try {
				file.createNewFile();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	public void writeFile(ArrayList<Student> items) {
		try {		
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(items);
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
