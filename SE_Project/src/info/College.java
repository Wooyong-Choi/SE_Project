package info;

public enum College {
	IT("IT����"),
	LibArt("�ι�����");
	
	private String name;
	
	College(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}
