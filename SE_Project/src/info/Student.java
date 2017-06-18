package info;

import java.util.ArrayList;

public class Student extends User {

	private String name;
	private int year;
	private String no;
	private ArrayList<TimeTable> oldLectureList;
	private ArrayList<TimeTable> temporaryList;

	public Student(String ID, String PW) {
		super(ID, PW);
		// TODO Auto-generated constructor stub
	}

	
	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return year;
	}

	public void setAge(int age) {
		this.year = age;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public ArrayList<TimeTable> getOldLectureList() {
		return oldLectureList;
	}

	public void setOldLectureList(ArrayList<TimeTable> oldLectureList) {
		this.oldLectureList = oldLectureList;
	}

	public ArrayList<TimeTable> getTemporaryList() {
		return temporaryList;
	}

	public void setTemporaryList(ArrayList<TimeTable> temporaryList) {
		this.temporaryList = temporaryList;
	}
	
	
}
