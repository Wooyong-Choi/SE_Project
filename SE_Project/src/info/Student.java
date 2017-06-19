package info;

public class Student extends User {

	private String name;
	private int year;
	private String no;
	private TimeTable oldLectureList;
	private TimeTable temporaryList;

	public Student(String ID, String PW) {
		super(ID, PW);
		
		oldLectureList = new TimeTable();
		temporaryList = new TimeTable();
		// TODO Auto-generated constructor stub
	}

	public Student(String ID, String PW, String n, int y, String no) {
		super(ID, PW);
		
		name = n;
		year = y;
		this.no = no;
		
		oldLectureList = new TimeTable();
		temporaryList = new TimeTable();
		// TODO Auto-generated constructor stub
	}
	
	// Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public TimeTable getOldLectureList() {
		return oldLectureList;
	}

	public void setOldLectureList(TimeTable oldLectureList) {
		this.oldLectureList = oldLectureList;
	}

	public TimeTable getTemporaryList() {
		return temporaryList;
	}

	public void setTemporaryList(TimeTable temporaryList) {
		this.temporaryList = temporaryList;
	}
	
	
}
