package practicePrograms;

import java.util.ArrayList;
import java.util.List;

public class CheckElementInArraylist {

	
	public static void main(String[] args) {
		Student std1 = new Student(1,"prajna");
		Student std2 = new Student(2,"namratha");
		Student std3 = new Student(3,"karkal");
		Student std4 = new Student(4,"likitha");
		Student std5 = new Student(5,"std5");
		
		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(std1);
		studentList1.add(std2);
		studentList1.add(std3);
		studentList1.add(std4);
		
		
		List<Student> studentList2 = new ArrayList<>();
		studentList2.add(std1);
		studentList2.add(std3);
		studentList2.add(std4);
		studentList2.add(std5);
		
		if (studentList1.size() == studentList2.size()) {
			for (int i = 0; i < studentList2.size(); i++) {
				if (studentList1.contains(studentList2.get(i))) {
					System.out.println("studentList2 contains object"
							+ studentList2.get(i));
				}else{
					//ignore
				}
			}
		}
		

	}
	

}
