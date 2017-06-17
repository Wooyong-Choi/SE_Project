package info;

import java.util.ArrayList;

public class Student extends User {

	private String name;
	private int age;
	private String no;
	private College college;
	private Major major;
	private ArrayList<TimeTable> oldLectureList;
	private ArrayList<TimeTable> temporaryList;

	public Student(String ID, String PW) {
		super(ID, PW);
		// TODO Auto-generated constructor stub
	}
}
