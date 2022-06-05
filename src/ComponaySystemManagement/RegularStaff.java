package ComponaySystemManagement;

public class RegularStaff extends Employee {

    private final String nameManager;

    public RegularStaff(int id, String name, String phoneNumber, int quantityDayOfWork, double salaryOfDay, String nameManager) {
        super(id, name, phoneNumber, quantityDayOfWork, salaryOfDay);
        this.nameManager = nameManager;
    }

    public String getNameManager() {
        return nameManager;
    }

    @Override
    public double caculateSalary() {
        return this.getSalaryOfDay() * this.getQuantityDayOfWork();
    }

    @Override
    public String toString() {
        return "Regular staff {" +
                "id : " + this.getId() +
                ", name : " + this.getName() +
                ", phone number : " + this.getPhoneNumber() +
                ", quantity day of work : " + this.getQuantityDayOfWork() +
                ", salary of day : " + this.getSalaryOfDay() +
                ", manager : " + this.getNameManager() +
                '}';
    }

}
