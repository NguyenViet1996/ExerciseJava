package CaculateSalary;

import java.util.Scanner;

public class Main {

		public static final String Yes = "co";
		public static final String No = "khong";

		public static void main(String[] args) {

       ManagerTeacher manager = new ManagerTeacher();
       Scanner scanner = new Scanner(System.in);

			 // add a new teacher to list
			 createListTeacher(manager,scanner);

				// delete teacher flow number of teacher
				deleteTeacherFollowNumber(manager,scanner);

				// caculate the salary
				manager.calculateSalary();

       // show the information of teacher
        manager.viewInforTeacher();

		}

		private static void createListTeacher(ManagerTeacher manager, Scanner scanner) {

				while(true) {
						System.out.println("Vui long nhap thong tin nhan vien");
						System.out.println("Nhap ten : ");
						String name = scanner.nextLine();
						System.out.println("Nhap que quan : ");
						String homeTown = scanner.nextLine();
						System.out.println("Nhap tuoi : ");
						int age = Integer.parseInt(scanner.nextLine());
						System.out.println("Nhap ma so nhan vien: ");
						int numberEmployee = Integer.parseInt(scanner.nextLine());
						System.out.println("Nhap luong co ban : ");
						float salaryGross = Float.parseFloat(scanner.nextLine());
						System.out.println("Nhap so tien thuong: ");
						float bonus = Float.parseFloat(scanner.nextLine());
						System.out.println("Nhap so tien phat : ");
						float fine = Float.parseFloat(scanner.nextLine());
            manager.addNewTeacher(new Teacher(name,homeTown,age,numberEmployee,salaryGross,bonus,fine));

						System.out.println("Ban co muon tiep tuc them thong tin giao vien vao danh sach ? ");
						String answer = scanner.nextLine();
            if (Yes.equalsIgnoreCase(answer)) {
								System.out.println("Vui long tiep tuc :");
						} else if (No.equalsIgnoreCase(answer)) {
								break;
						}
				}

		}

		private static void deleteTeacherFollowNumber(ManagerTeacher manager,Scanner scanner) {
				System.out.println("Vui long nhap ma nhan vien ban muon xoa : ");
				int number = Integer.parseInt(scanner.nextLine());
				 manager.deleteTeacherFollowNumberTeacher(number);

		}

}
