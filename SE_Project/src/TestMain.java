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
		
		
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP123", "����Ʈ������м���", 3, true));
		timeTable.addLecture(new Lecture(2, LectureKind.�������, "COMP456", "���м���", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�⺻�Ҿ�, "COMP789", "����â�ǰ��м���", 3, true));
		timeTable.addLecture(new Lecture(2, LectureKind.�������, "COMP575", "�̻����", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.�⺻�Ҿ�, "COMP247", "�����ǿ���͹�ȭ", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP788", "�����Ϸ�", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�⺻�Ҿ�, "COMP782", "�ǿ�ȭ��", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP774", "�˰���", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.��������, "COMP865", "�������α׷���", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.��������, "COMP452", "�ڷᱸ��", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.�������, "COMP571", "�������", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.�⺻�Ҿ�, "COMP758", "��������Ű�â��", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.��������, "COMP847", "����Ʈ�����", 3, true));
		timeTable.addLecture(new Lecture(1, LectureKind.�������, "COMP128", "����1", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP842", "��ȸ��", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP246", "��ǻ�͸�", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP567", "�����˻�", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.��������, "COMP982", "�ڹ����α׷���", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP157", "�ý������α׷���", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP284", "�����ͺ��̽�", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP111", "C++���α׷���", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP691", "�ΰ�����", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP666", "���ɷκ����а���", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.��������, "COMP963", "��ǻ���а���", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP741", "���丶Ÿ", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�⺻�Ҿ�, "COMP852", "���а�����۾���", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP963", "���̽����α׷���", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP951", "IT��������", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP753", "��Ʈ��ũ���α׷���", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP112", "�ȵ���̵����α׷���", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP278", "��ǻ�ͱ׷��Ƚ�", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�⺻�Ҿ�, "COMP792", "�ɸ���������", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�������, "COMP866", "���ʹ������ڽ���", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP451", "�ü��", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP355", "��ǻ�ͱ���", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�⺻�Ҿ�, "COMP995", "���ͺ��������", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP501", "��ǻ������", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.��������, "COMP043", "�����α׷���", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�⺻�Ҿ�, "COMP091", "�ǿ뿵��", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.�������, "COMP320", "ȭ��1", 3, false));
		timeTable.addLecture(new Lecture(1, LectureKind.�������, "COMP020", "���ʰ��й����н���", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP021", "���ռ���������Ʈ1", 4, true));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP022", "���ռ���������Ʈ2", 4, true));
		timeTable.addLecture(new Lecture(2, LectureKind.�⺻�Ҿ�, "COMP023", "��ȭ�������", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.�⺻�Ҿ�, "COMP024", "����������Ʈ�Ŵ�����Ʈ", 3, true));
		timeTable.addLecture(new Lecture(2, LectureKind.�⺻�Ҿ�, "COMP025", "�����ΰ����빮ȭ", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.�������, "COMP026", "������", 3, false));
		timeTable.addLecture(new Lecture(2, LectureKind.�⺻�Ҿ�, "COMP027", "���а�����۾���", 3, false));
		timeTable.addLecture(new Lecture(3, LectureKind.�⺻�Ҿ�, "COMP028", "�ɸ���������", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP029", "IT��������", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP030", "������Ʈ��ũ", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP031", "����Ʈ����Ư��", 2, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP032", "�����й̵���Ʈ", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP033", "���α׷��־���", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP034", "������ȣ��", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP035", "��ǻ�ͺ���", 3, false));
		timeTable.addLecture(new Lecture(4, LectureKind.��������, "COMP036", "��ǻ�Ͱ�������", 3, false));
		
		// ID, PW, �̸�, �г�, �й�
		
		// Student list
		ArrayList<Student> tempList = new ArrayList<Student>();
		
		tempList.add(makeStudent("1111", "1111", "���ؿ�", 3, "2012105320"));
		tempList.add(makeStudent("2222", "2222", "ȫ����", 3, "2010105321"));
		tempList.add(makeStudent("3333", "3333", "������", 3, "2012105654"));
		tempList.add(makeStudent("4444", "4444", "�ֿ��", 4, "2014105093"));
		tempList.add(makeStudent("5555", "5555", "Ȳ����", 4, "2014105105"));
		tempList.add(makeStudent("6666", "6666", "�赿��", 3, "2013105369"));
		tempList.add(makeStudent("7777", "7777", "���ϴ�", 3, "2012105845"));
		tempList.add(makeStudent("8888", "8888", "������", 4, "2011105456"));
		tempList.add(makeStudent("9999", "9999", "������", 3, "2013105852"));
		tempList.add(makeStudent("1212", "1212", "������", 4, "2014105123"));
		tempList.add(makeStudent("1313", "1313", "����ȣ", 4, "2012105124"));
		tempList.add(makeStudent("1414", "1414", "�̴�ȣ", 3, "2014105874"));
		tempList.add(makeStudent("1515", "1515", "�ں���", 4, "2011105951"));
		tempList.add(makeStudent("1616", "1616", "������", 3, "2011105236"));
		tempList.add(makeStudent("1717", "1717", "�ں���", 3, "2013105666"));

		
		
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
