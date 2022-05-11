package EmployeeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {

    private final List<Employee> listEmployee ;

		public ManagerOfficer() {
        this.listEmployee = new ArrayList<>();
		}

    public void addNewEmployee(Employee e) {
			  this.listEmployee.add(e);
		}

		public List<Employee> filterEmployeeFlowName(String nameEmployee) {
        return this.listEmployee.stream().filter(employee -> employee.getName().contains(nameEmployee)).collect(Collectors.toList());
		}

    public void viewInformationEmployee(List<Employee> e) {
				for(Employee i : e) {
						System.out.println(i);
				}

		}

}
