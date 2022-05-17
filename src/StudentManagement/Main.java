package StudentManagement;

import java.util.Scanner;

public class Main {

		private static final String YES = "yes";
		private static final String NO = "no";

		public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);
				ManagerStudent manager = new ManagerStudent();

				// insert new student
				insertNewStudent(manager,scanner);

				// view the student has age greater than 20
        manager.viewStudentHasAgeGreaterThanTwenty();

				// the amount of student that they have age is 23 and home town is Da Nang
        manager.acountQuantity();

		}

		private static void insertNewStudent(ManagerStudent manager,Scanner scanner) {
				while (true) {
						System.out.print("Enter the grade : ");
						String grade = scanner.nextLine();
						System.out.print("Enter the name : ");
						String name = scanner.nextLine();
						System.out.print("Enter the age : ");
						int age = Integer.parseInt(scanner.nextLine());
						System.out.print("Enter the home town : ");
						String homeTown = scanner.nextLine();
						manager.insert(new Student(grade, name, age, homeTown));
						System.out.print("Do you want to continue to add student ? ");
						String answer = scanner.nextLine();
						if (YES.equalsIgnoreCase(answer)) {
								System.out.println("Please enter the information : ");
						} else if (NO.equalsIgnoreCase(answer)) {
								break;
						}
				}

		}

}
