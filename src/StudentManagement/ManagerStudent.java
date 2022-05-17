package StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class ManagerStudent {

    private final List<Student> listStudent;

		public ManagerStudent() {
				this.listStudent = new ArrayList<>();
		}

    public void insert(Student student) {
				this.listStudent.add(student);
		}

		public void viewStudentHasAgeGreaterThanTwenty() {
				System.out.println("The student has age is greater than 20 : ");
				for(Student student : this.listStudent) {
						if (student.getAge() > 20) {
								System.out.println(student);
						}
				}
		}

		public void acountQuantity() {
				int account = 0;
				for (Student student : this.listStudent) {
						if (student.getAge() == 23 && student.getHomeTown().equalsIgnoreCase("Da Nang")) {
								account++;
						}
				}
				System.out.println("The amount of student is 23 years old and comes from Da Nang : " + account);
		}

}
