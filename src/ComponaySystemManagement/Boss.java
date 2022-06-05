package ComponaySystemManagement;

public class Boss extends Employee{

    private final double rateInCompany;

    public Boss(int id, String name, String phoneNumber, int dayOfWork, double salaryOfDay, double rateInCompany) {
        super(id, name, phoneNumber, dayOfWork, salaryOfDay);
        this.rateInCompany = rateInCompany;
    }

    public double getRateInCompany() {
        return rateInCompany;
    }

    @Override
    public double caculateSalary() {
        return this.getSalaryOfDay()*this.getQuantityDayOfWork();
    }

    @Override
    public String toString() {
        return "Regular staff {" +
                "id : " + this.getId() +
                ", name : " + this.getName() +
                ", phone number : " + this.getPhoneNumber() +
                ", quantity day of work : " + this.getQuantityDayOfWork() +
                ", salary of day : " + this.getSalaryOfDay() +
                ", rate in company : " + this.getRateInCompany() +
                '}';
    }

}
