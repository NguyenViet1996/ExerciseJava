package CompanyManagement.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerEmployee {

		private List<Employee> listEmployee;

		public ManagerEmployee() {
				this.listEmployee = new ArrayList<>();
		}

    public void addNewEmployee(Employee employee) {
				this.listEmployee.add(employee);
		}

		public  void updateInfoEmployee(int number) {
				for (Employee employee : this.listEmployee) {
						if (employee.getNumberEmployee() == number) {

						}
				}
		}

    public void deleteEmployee(int number) {
				this.listEmployee = this.listEmployee.stream().filter(employee -> employee.getNumberEmployee()!=number).collect(Collectors.toList());
		}



}
