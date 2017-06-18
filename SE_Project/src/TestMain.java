import java.util.ArrayList;

import db.LectureDBAccessor;
import db.StudentDBAccessor;
import info.Lecture;
import info.LectureKind;
import info.Student;

public class TestMain {
	public static void main(String[] args) {
		
		// case 1
		Student temp = new Student("4321", "4321");
		temp.setName("abcc");
		temp.setNo("4321");
		temp.setAge(3);
		String[] a = {"1A", "1B"};
		String[] b = {"2A", "2B"};
		String[] c = {"3A", "3B"};
		temp.getOldLectureList().addLecture(new Lecture(LectureKind.공학전공, "COMP123", "소공", 3, true, a));
		temp.getOldLectureList().addLecture(new Lecture(LectureKind.기본소양, "COMP456", "소공", 2, false, b));
		temp.getOldLectureList().addLecture(new Lecture(LectureKind.전공기반, "COMP789", "소공", 2, false, c));
		
		// case 2
		Student temp2 = new Student("1234", "1234");
		temp2.setName("이름이름");
		temp2.setNo("1234");
		temp2.setAge(4);
		temp2.getOldLectureList().addLecture(new Lecture(LectureKind.공학전공, "COMP123", "소공", 3, true, a));
		temp2.getOldLectureList().addLecture(new Lecture(LectureKind.기본소양, "COMP456", "소공", 2, false, b));
		temp2.getOldLectureList().addLecture(new Lecture(LectureKind.전공기반, "COMP789", "소공", 2, false, c));
		
		StudentDBAccessor stdDB = new StudentDBAccessor();
		LectureDBAccessor lecDB = new LectureDBAccessor();
		ArrayList<Student> tempList = new ArrayList<Student>();

		tempList.add(temp);
		tempList.add(temp2);
		
		stdDB.writeFile(tempList);
		
		lecDB.writeFile(temp2.getOldLectureList().getLecList());
	}
}
