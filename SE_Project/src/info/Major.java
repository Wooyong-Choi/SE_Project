package info;

public enum Major {
	CSE("컴퓨터학부"),
	KR("국어국문학과");
	
	private String name;
	
	Major(String str) {
		name = str;
	}
	
	public String toString() {
		return name;
	}
}
