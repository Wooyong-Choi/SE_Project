package info;

import java.io.Serializable;
import java.util.ArrayList;

public class Lecture implements Serializable {
	private LectureKind kind;
	private College openCol;
	private String no;
	private String name;
	private int credit;
	private ArrayList<String> time;
	

	// Constructor
	public Lecture() { }
	
	public Lecture(LectureKind kd, College open, String n, String nm, int cdt, ArrayList<String> t) {
		kind = kd;
		openCol = open;
		no = n;
		name = nm;
		credit = cdt;
		time = t;
	}
	
	
	// Getter & Setter
	public LectureKind getKind() {
		return kind;
	}

	public void setKind(LectureKind kind) {
		this.kind = kind;
	}

	public College getOpenCol() {
		return openCol;
	}

	public void setOpenCol(College openCol) {
		this.openCol = openCol;
	}

	public String getNum() {
		return no;
	}

	public void setNum(String num) {
		this.no = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public ArrayList<String> getTime() {
		return time;
	}

	public void setTime(ArrayList<String> time) {
		this.time = time;
	}
}
