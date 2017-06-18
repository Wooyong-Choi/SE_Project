package db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import info.Lecture;

public class LectureDBAccessor {

	private File file;
	
	public LectureDBAccessor() {
		file = new File("lecture.db");
	}
	
	public ArrayList<Lecture> readFile() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
			
			ArrayList<Lecture> list = (ArrayList<Lecture>) in.readObject();
			
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

	public void writeFile(ArrayList<Lecture> items) {
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
