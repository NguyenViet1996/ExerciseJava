package CompanyManagement.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManagerEmployee {

		private List<Employee> listEmployee;

		public ManagerEmployee() {
				this.listEmployee = new ArrayList<>();
		}

    public void insert(Employee employee) {
				this.listEmployee.add(employee);
		}

		public void delete(int id) {
				this.listEmployee = this.listEmployee.stream().filter(employee -> employee.getIdEmployee()!=id).collect(Collectors.toList());
		}

		public void update(int id, Scanner scanner) {
				Optional<Employee> foundEmployee = this.listEmployee.stream().filter(employee -> employee.getIdEmployee() == id).findFirst();
//        if (foundEmployee.isPresent()) {
//						System.out.println("The employee that you want to update is " + found);
//
//				}
		}

}
