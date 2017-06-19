package ocsf;

import java.io.Serializable;
import java.util.ArrayList;

import info.Lecture;
import info.Student;

public class Packet implements Serializable {
	
	/**
	 * -1 : Failure
	 * 0 : Read Student (�α��� �� ��)
	 * 1 : Write Student (������ ��)
	 * 2 : Read Lecture List
	 * 3 : Peep other's timetable
	 * 4 : Write Lecture List
	 */
	private int request;
	private Student std;
	private ArrayList<Lecture> lecList;
	
	/**
	 * ���� ��Ŷ
	 */
	public Packet() {
		request = -1;
	}
	
	/**
	 * request = 2
	 * @param req
	 */
	public Packet(int req) {
		request = req; 
	}
	
	/**
	 * request code = 0, 1, 3
	 * @param std
	 * @param req
	 */
	public Packet(Student std, int req) {
		this.std = std;
		request = req;
	}
	
	public Packet(ArrayList<Lecture> data) {
		this.lecList = data;
	}

	public Packet(ArrayList<Lecture> data, int req) {
		this.lecList = data;
		request = req;
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
