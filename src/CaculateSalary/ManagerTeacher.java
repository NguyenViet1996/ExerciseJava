package CaculateSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerTeacher {

		private  List<Teacher> listTeacher;

		public ManagerTeacher() {
				this.listTeacher = new ArrayList<>();
		}

		public void addNewTeacher(Teacher teacher) {
				this.listTeacher.add(teacher);
		}

		public void deleteTeacherFollowNumberTeacher(int numberTeacher) {
				this.listTeacher = this.listTeacher.stream().filter(teacher -> teacher.getNumberEmploy() != numberTeacher).collect(Collectors.toList());
		}

		public void calculateSalary() {
				for (Teacher teacher : this.listTeacher) {
						teacher.setSalaryNet(teacher.getSalarayGross() + teacher.getBonusAmount() - teacher.getFineAmount());
				}
		}

		public void viewInforTeacher() {
        for (Teacher teacher : this.listTeacher) {
						System.out.println(teacher);
				}
		}

}
