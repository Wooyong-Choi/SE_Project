import java.io.IOException;
import java.util.ArrayList;

import db.LectureDBAccessor;
import db.StudentDBAccessor;
import info.Lecture;
import info.LectureKind;
import info.Student;
import info.TimeTable;

public class TestMain {
	
	public static void main(String[] args) {
		
		TimeTable lecList = new TimeTable();
		
		lecList.addLecture(new Lecture(1, LectureKind.��������, "COMP123", "�Ұ�", 3, true));
		lecList.addLecture(new Lecture(1, LectureKind.�������, "COMP456", "����", 3, true));
		lecList.addLecture(new Lecture(1, LectureKind.�⺻�Ҿ�, "COMP789", "��â��", 3, true));
		
		
		
		// case 1
		Student temp = new Student("4321", "4321", "abcc", 3, "4321");
		temp.setOldLectureList(lecList);
		
		// case 2
		Student temp2 = new Student("1234", "1234", "abaa", 4, "1234");
		temp2.setOldLectureList(lecList);
		
		
		
		// Testcase generate
		StudentDBAccessor stdDB = new StudentDBAccessor();
		LectureDBAccessor lecDB = new LectureDBAccessor();
		
		ArrayList<Student> tempList = new ArrayList<Student>();

		tempList.add(temp);
		tempList.add(temp2);
		
		stdDB.writeFile(tempList);
		
		lecDB.writeFile(lecList.getLecList());
		
		System.out.println(stdDB.readFile());
		System.out.println(lecDB.readFile());
	}
}
