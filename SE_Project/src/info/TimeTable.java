package info;

import java.io.Serializable;
import java.util.ArrayList;

public class TimeTable implements Serializable {
	
	private ArrayList<Lecture> lecList;
	
	public TimeTable() { lecList = new ArrayList<Lecture>(); }
	
	public TimeTable(ArrayList<Lecture> lec) {
		lecList = lec;
	}
	
	public int calTotalCredit() {
		int sum = 0;
		for (Lecture lec : lecList) {
			sum += lec.getCredit();
		}
		return sum;
	}
	
	public int calDesignCredit() {
		int sum = 0;
		for (Lecture lec : lecList) {
			if (lec.isDesign())
				sum += lec.getCredit();
		}
		return sum;
	}
	
	public int calMajorCredit() {
		int sum = 0;
		for (Lecture lec : lecList) {
			if (lec.getKind() == LectureKind.공학전공)
				sum += lec.getCredit();
		}
		return sum;
	}
	
	public int calLibArtCredit() {
		int sum = 0;
		for (Lecture lec : lecList) {
			if (lec.getKind() == LectureKind.기본소양)
				sum += lec.getCredit();
		}
		return sum;
	}
	
	public int calBaseCredit() {
		int sum = 0;
		for (Lecture lec : lecList) {
			if (lec.getKind() == LectureKind.전공기반)
				sum += lec.getCredit();
		}
		return sum;
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
