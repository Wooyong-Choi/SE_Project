package info;

public enum LectureKind {
	�⺻�Ҿ�("�⺻�Ҿ�"),
	�������("�������"),
	��������("��������");
	
	private String name;
	
	LectureKind(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}
