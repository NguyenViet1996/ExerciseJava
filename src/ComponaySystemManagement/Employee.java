package ComponaySystemManagement;

public abstract class Employee {

    private int id;
    private String name;
    private String phoneNumber;
    private int quantityDayOfWork;
    private double salaryOfDay;

    public Employee(int id, String name, String phoneNumber, int dayOfWork, double salaryOfDay) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.quantityDayOfWork = dayOfWork;
        this.salaryOfDay = salaryOfDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getQuantityDayOfWork() {
        return quantityDayOfWork;
    }

    public void setQuantityDayOfWork(int quantityDayOfWork) {
        this.quantityDayOfWork = quantityDayOfWork;
    }

    public double getSalaryOfDay() {
        return salaryOfDay;
    }

    public void setSalaryOfDay(double salaryOfDay) {
        this.salaryOfDay = salaryOfDay;
    }

    public abstract double caculateSalary();
}
