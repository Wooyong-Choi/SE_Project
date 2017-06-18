package ocsf;

import java.io.Serializable;
import java.util.ArrayList;

import info.Lecture;
import info.Student;

public class Packet implements Serializable {
	
	/**
	 * -1 : Failure
	 * 0 : Read Student
	 * 1 : Write Student
	 * 2 : Read Lecture List
	 */
	private int request;
	private Student std;
	private ArrayList<Lecture> lecList;
	
	public Packet() {
		request = -1;
	}
	
	public Packet(Student std, int req) {
		this.std = std;
		request = req;
	}
	
	public Packet(ArrayList<Lecture> data) {
		this.lecList = lecList;
	}

	

	// Getter & Setter
	

	public int getRequest() {
		return request;
	}

	public void setRequest(int request) {
		this.request = request;
	}
	public Student getStd() {
		return std;
	}


	public void setStd(Student std) {
		this.std = std;
	}

	public ArrayList<Lecture> getLecList() {
		return lecList;
	}

	public void setLecList(ArrayList<Lecture> lecList) {
		this.lecList = lecList;
	}
}
