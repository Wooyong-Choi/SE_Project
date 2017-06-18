package ocsf;

import java.io.Serializable;
import java.util.ArrayList;

public class Packet implements Serializable {
	
	private String ID;
	private String PW;
	
	private ArrayList<Serializable> data;

	
	// Getter & Setter

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPW() {
		return PW;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public ArrayList<Serializable> getData() {
		return data;
	}

	public void setData(ArrayList<Serializable> data) {
		this.data = data;
	}
	
	
}
