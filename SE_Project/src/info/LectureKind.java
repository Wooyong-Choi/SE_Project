package info;

public enum LectureKind {
	libArts("교양"),
	Major("전공");
	
	private String name;
	
	LectureKind(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}
