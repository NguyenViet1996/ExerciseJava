package ComponaySystemManagement;

public class ManagerRoom extends  Employee{

    private final int quantityEmployee;

    public ManagerRoom(int id, String name, String phoneNumber, int dayOfWork, double salaryOfDay, int quantityEmployee) {
        super(id, name, phoneNumber, dayOfWork, salaryOfDay);
        this.quantityEmployee = quantityEmployee;
    }

    public int getQuantityEmployee() {
        return quantityEmployee;
    }

    @Override
    public double caculateSalary() {
        return this.getSalaryOfDay() * this.getQuantityDayOfWork() + 100 * this.getQuantityEmployee();
    }

    @Override
    public String toString() {
        return "Regular staff {" +
                "id : " + this.getId() +
                ", name : " + this.getName() +
                ", phone number : " + this.getPhoneNumber() +
                ", quantity day of work : " + this.getQuantityDayOfWork() +
                ", salary of day : " + this.getSalaryOfDay() +
                ", quantity employee : " + this.getQuantityEmployee() +
                '}';
    }

}
