package EmployeeManagement;

import java.util.List;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {

				ManagerOfficer manager = new ManagerOfficer();
				Scanner scanner = new Scanner(System.in);

        // add new employee
				createListEmployee(manager,scanner);

				// Find employee follow the name of employee
				List<Employee> listFindEmployee = findEmployeeFollowName(manager,scanner);

				// view the information of employee that you want to find
				manager.viewInformationEmployee(listFindEmployee);

		}

		private static void createListEmployee(ManagerOfficer manager, Scanner scanner) {
				String name,gender,address;
				int age = 10;
				int flag = 0;
        while (true) {
						System.out.println("1: add a new engineer,2: add a new Officer,3: add a new worker");
						int enterOfAddNew = Integer.parseInt(scanner.nextLine());

						switch (enterOfAddNew) {
								case 1:
										System.out.println("Enter name :");
										name = scanner.nextLine();
										System.out.println("Enter gender : ");
										gender = scanner.nextLine();
										System.out.println("Enter address : ");
										address = scanner.nextLine();
										System.out.println("Enter age : ");
										age = Integer.parseInt(scanner.nextLine());
										System.out.println("Enter the branch");
										String branch = scanner.nextLine();
										manager.addNewEmployee(new Engineer(name,gender,address,age,branch));
										break;
								case 2 :
										System.out.println("Enter name :");
										name = scanner.nextLine();
										System.out.println("Enter gender : ");
										gender = scanner.nextLine();
										System.out.println("Enter address : ");
										address = scanner.nextLine();
										System.out.println("Enter age : ");
										age = Integer.parseInt(scanner.nextLine());
										System.out.println("Enter the job");
										String job = scanner.nextLine();
										manager.addNewEmployee(new Officer(name,gender,address,age,job));
										break;
								case 3 :
										System.out.println("Enter name :");
										name = scanner.nextLine();
										System.out.println("Enter gender : ");
										gender = scanner.nextLine();
										System.out.println("Enter address : ");
										address = scanner.nextLine();
										System.out.println("Enter age : ");
										age = Integer.parseInt(scanner.nextLine());
										System.out.println("Enter the job");
										String position = scanner.nextLine();
										manager.addNewEmployee(new Worker(name,gender,address,age,position));
										break;
								default:
										flag = 1;
										break;
						}
						if (flag == 1) {
								break;
						}
				}

		}

		private static List<Employee> findEmployeeFollowName(ManagerOfficer manager, Scanner scanner) {
				System.out.println("Enter the name of employee that you want to find");
				String nameOfEmployee = scanner.nextLine();
        return manager.filterEmployeeFlowName(nameOfEmployee);
		}

}
