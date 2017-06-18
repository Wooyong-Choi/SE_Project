package info;

public enum LectureKind {
	기본소양("기본소양"),
	전공기반("전공기반"),
	공학전공("공학전공");
	
	private String name;
	
	LectureKind(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}
