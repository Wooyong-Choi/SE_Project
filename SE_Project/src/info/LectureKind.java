package info;

public enum LectureKind {
	libArts("����"),
	Major("����");
	
	private String name;
	
	LectureKind(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}
