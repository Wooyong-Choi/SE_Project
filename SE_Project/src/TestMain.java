import java.util.ArrayList;

import db.StudentDBAccessor;
import info.Student;

public class TestMain {
	public static void main(String[] args) {
		
		Student temp = new Student("1234", "1234");
		temp.setName("이름이름");
		temp.setNo("1234");
		temp.setAge(4);
		
		StudentDBAccessor stdDB = new StudentDBAccessor();
		ArrayList<Student> tempList = new ArrayList<Student>();
		
		tempList.add(temp);
		
		stdDB.writeFile(tempList);
	}
}
