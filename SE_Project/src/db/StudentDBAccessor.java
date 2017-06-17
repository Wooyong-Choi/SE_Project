package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;

import info.Student;

public class StudentDBAccessor extends DBAccessor {

	public StudentDBAccessor() {
		file = new File("student.db");
	}
	
	@Override
	public ArrayList<Serializable> readFile() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			
			ArrayList<Serializable> list = (ArrayList<Serializable>) in.readObject();
			
			in.close();
			
			return list;
			
		} catch (FileNotFoundException e) {
			// 없으면 파일 생성
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

	@Override
	public void writeFile(ArrayList<Serializable> items) {
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
