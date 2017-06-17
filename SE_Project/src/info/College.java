package info;

public enum College {
	IT("IT대학"),
	LibArt("인문대학");
	
	private String name;
	
	College(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}
