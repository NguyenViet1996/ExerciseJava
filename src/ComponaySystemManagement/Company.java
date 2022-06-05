package ComponaySystemManagement;

import java.util.*;
import java.util.stream.Collectors;

public class Company {

    private String nameCompany;
    private List<Employee> listEmployee;

    public Company(String nameCompany){
        this.listEmployee = new ArrayList<>();
        this.nameCompany = nameCompany;

    }

    // add a new employee
    public void addNewEmployee(Employee employee){
        this.listEmployee.add(employee);
    }

    public void deleteEmployee(String typeEmployee){

    }

    public void showInforAllEmploye() {
        for (Employee employee : this.listEmployee) {
            System.out.println(employee);
        }
    }

    public void calculateSalaryAllEmployee() {
        double sumSalary = 0 ;
        for (Employee employee : this.listEmployee) {
            sumSalary += employee.caculateSalary();
        }
        System.out.println("The sum of all employee : " + sumSalary);
    }

    public void findEmployeeHaveHighestSalary() {
        List<Employee> newListEmployee = this.listEmployee.stream()
                .sorted(Comparator.comparingDouble(Employee::caculateSalary)).collect(Collectors.toList());
        System.out.println(newListEmployee.get(newListEmployee.size()-1));
    }

    public void findManagerHaveTheMostQuantityEmployee() {
        List<ManagerRoom> listManager = new ArrayList<>();
        for (Employee employee : this.listEmployee) {
            if (employee instanceof ManagerRoom) {
                listManager.add((ManagerRoom) employee);
            }
        }
        listManager = listManager.stream()
                .sorted(Comparator.comparingDouble(ManagerRoom::getQuantityEmployee)).collect(Collectors.toList());
        System.out.println(listManager.get(listManager.size()-1));
    }





}
