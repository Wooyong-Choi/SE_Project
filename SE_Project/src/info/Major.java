package info;

public enum Major {
	CSE("��ǻ���к�"),
	KR("������а�");
	
	private String name;
	
	Major(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}