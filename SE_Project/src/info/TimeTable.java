package info;

import java.io.Serializable;
import java.util.ArrayList;

public class TimeTable implements Serializable {
	
	private ArrayList<Lecture> lecList;
	
	public TimeTable() { lecList = new ArrayList<Lecture>(); }
	
	public TimeTable(ArrayList<Lecture> lec) {
		lecList = lec;
	}
	
	public void addLecture(Lecture lec) {
		lecList.add(lec);
	}

	public ArrayList<Lecture> getLecList() {
		return lecList;
	}

	public void setLecList(ArrayList<Lecture> lecList) {
		this.lecList = lecList;
	}
	
	
}
