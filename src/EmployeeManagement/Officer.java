package EmployeeManagement;

public class Officer extends Employee{

    private String job;

		public Officer(String name, String gender, String address, int age,String job) {
				super(name, gender, address, age);
				this.job = job;
		}

    public void setJob(String job) {
				this.job = job;
		}

		public String getJob() {
				return this.job;
		}

		@Override
		public String toString() {
				return "Officer {" +
						"Name : " + this.getName() +
						"Age : " + this.getAge() +
						"Gender : " + this.getGender() +
						"Address : " + this.getAddress() +
						"Job : " + this.getJob() +
						"}";
		}

}
