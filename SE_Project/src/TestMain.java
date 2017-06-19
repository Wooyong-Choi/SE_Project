import java.util.ArrayList;
import java.util.Random;

import db.LectureDBAccessor;
import db.StudentDBAccessor;
import info.Lecture;
import info.LectureKind;
import info.Student;
import info.TimeTable;

public class TestMain {

	static TimeTable timeTable = new TimeTable();

	public static void main(String[] args) {
		
		
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP123", "소프트웨어공학설계", 3, true));
		timeTable.addLecture(new Lecture(2, LectureKind.전공기반, "COMP456", "공학수학", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.기본소양, "COMP789", "기초창의공학설계", 3, true));
		timeTable.addLecture(new Lecture(2, LectureKind.전공기반, "COMP575", "이산수학", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.기본소양, "COMP247", "서양의역사와문화", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP788", "컼파일러", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.기본소양, "COMP782", "실용화법", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP774", "알고리즘", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.공학전공, "COMP865", "기초프로그래잉", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.공학전공, "COMP452", "자료구조", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.전공기반, "COMP571", "선형대수", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.기본소양, "COMP758", "기업가정신과창업", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.공학전공, "COMP847", "소프트웨어설계", 3, true));
		timeTable.addLecture(new Lecture(1, LectureKind.전공기반, "COMP128", "수학1", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP842", "논리회로", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP246", "컴퓨터망", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP567", "정보검색", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.공학전공, "COMP982", "자바프로그래밍", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP157", "시스템프로그래밍", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP284", "데이터베이스", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP111", "C++프로그래밍", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP691", "인공지능", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP666", "지능로봇공학개론", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.공학전공, "COMP963", "컴퓨터학개론", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP741", "오토마타", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.기본소양, "COMP852", "과학과기술글쓰기", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP963", "파이썬프로그래밍", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP951", "IT지적재산권", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP753", "네트워크프로그래밍", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP112", "안드로이드프로그래밍", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP278", "컴퓨터그래픽스", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.기본소양, "COMP792", "심리학의이해", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.전공기반, "COMP866", "기초물리전자실험", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP451", "운영체제", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP355", "컴퓨터구조", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.기본소양, "COMP995", "논리와비판적사고", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP501", "컴퓨터윤리", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.공학전공, "COMP043", "웬프로그래밍", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.기본소양, "COMP091", "실용영어", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.전공기반, "COMP320", "화학1", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.전공기반, "COMP020", "기초공학물리학실험", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP021", "종합설계프로젝트1", 4, true));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP022", "종합설계프로젝트2", 4, true));
		timeTable.addLecture(new Lecture(2, LectureKind.기본소양, "COMP023", "문화기술개론", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.기본소양, "COMP024", "공학프로젝트매니지먼트", 3, true));
		timeTable.addLecture(new Lecture(2, LectureKind.기본소양, "COMP025", "디자인과현대문화", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.전공기반, "COMP026", "생물학", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.기본소양, "COMP027", "과학과기술글쓰기", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.기본소양, "COMP028", "심리학의이해", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP029", "IT지식재산권", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP030", "무선네트워크", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP031", "소프트웨어특강", 2, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP032", "디지털미디어아트", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP033", "프로그래밍언어론", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP034", "정보보호론", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP035", "컴퓨터비전", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.공학전공, "COMP036", "컴퓨터게임제작", 3, false));
		
		// ID, PW, 이름, 학년, 학번
		
		// Student list
		ArrayList<Student> tempList = new ArrayList<Student>();
		
		tempList.add(makeStudent("1111", "1111", "나준엽", 3, "2012105320"));
		tempList.add(makeStudent("2222", "2222", "홍지완", 3, "2010105321"));
		tempList.add(makeStudent("3333", "3333", "박찬원", 3, "2012105654"));
		tempList.add(makeStudent("4444", "4444", "최우용", 4, "2014105093"));
		tempList.add(makeStudent("5555", "5555", "황도은", 4, "2014105105"));
		tempList.add(makeStudent("6666", "6666", "김동률", 3, "2013105369"));
		tempList.add(makeStudent("7777", "7777", "이하늬", 3, "2012105845"));
		tempList.add(makeStudent("8888", "8888", "전지현", 4, "2011105456"));
		tempList.add(makeStudent("9999", "9999", "이지은", 3, "2013105852"));
		tempList.add(makeStudent("1212", "1212", "이은주", 4, "2014105123"));
		tempList.add(makeStudent("1313", "1313", "김진호", 4, "2012105124"));
		tempList.add(makeStudent("1414", "1414", "이대호", 3, "2014105874"));
		tempList.add(makeStudent("1515", "1515", "박보영", 4, "2011105951"));
		tempList.add(makeStudent("1616", "1616", "연우진", 3, "2011105236"));
		tempList.add(makeStudent("1717", "1717", "박보검", 3, "2013105666"));

		
		
		// Testcase generate
		StudentDBAccessor stdDB = new StudentDBAccessor();
		LectureDBAccessor lecDB = new LectureDBAccessor();
		
		stdDB.writeFile(tempList);
		lecDB.writeFile(timeTable.getLecList());
		
		System.out.println(stdDB.readFile());
		System.out.println(lecDB.readFile());
	}
	
	public static Student makeStudent(String ID, String PW, String name, int year, String no) {

		Student temp = new Student(ID, PW, name, year, no);
		
		Random a = new Random();
		boolean[] mark = new boolean[40];
		
		for (int i = 0; i < 30; i++) {
			int rnd = Math.abs(a.nextInt()) % 40;
			if (mark[rnd] == false) {
				temp.getOldLectureList().getLecList().add(timeTable.getLecList().get(rnd));
				mark[rnd] = true;
			} else {
				i--;
				continue;
			}
		}
		
		return temp;
	}
	
	public static void setTempTimeTable(Student std) {
		
		Random a = new Random();
		boolean[] mark = new boolean[40];
		
		for (int i = 0; i < 5; i++) {
			int rnd = Math.abs(a.nextInt()) % 40;
			if (mark[rnd] == false) {
				std.getOldLectureList().getLecList().add(timeTable.getLecList().get(rnd));
				mark[rnd] = true;
			} else {
				i--;
				continue;
			}
		}
	}
}
