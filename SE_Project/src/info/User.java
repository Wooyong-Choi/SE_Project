package info;

import java.io.Serializable;

public class User implements Serializable {
	
	private String ID;
	private String Password;
	
	public User(String ID, String PW) {
		this.ID = ID;
		this.Password = PW;
	}
	
	
	// Getter & Setter
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
