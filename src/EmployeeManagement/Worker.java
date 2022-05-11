package EmployeeManagement;

public class Worker extends Employee {

		private String position;

		public Worker(String name, String gender, String address, int age, String position) {
				super(name, gender, address, age);
				this.position = position;
		}

		public void setPosition(String position) {
				this.position = position;
		}

    public String getPosition() {
				return this.position;
		}

		@Override
		public String toString() {
				return "Worker {" +
						"Name : " + this.getName() +
						"Age : " + this.getAge() +
						"Gender : " + this.getGender() +
						"Address : " + this.getAddress() +
						"The position : " + this.getPosition() +
						"}";
		}

}
