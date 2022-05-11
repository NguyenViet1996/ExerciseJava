package EmployeeManagement;

public class Employee {

		private String name, gender,address;
		private int age;

		public Employee(String name,String gender,String address,int age) {
         this.name = name;
				 this.gender = gender;
				 this.address = address;
				 this.age = age;
		}

		public void setName(String name) {
				this.name = name;
		}

    public String getName() {
				return this.name;
		}

		public void setGender(String gender) {
				this.gender = gender;
		}

		public String getGender() {
				return this.gender;
		}

		public void setAddress(String address) {
				this.address = address;
		}

		public String getAddress() {
				return this.address;
		}

    public void setAge(int age) {
				this.age = age;
		}

		public int getAge() {
				return this.age;
		}

}
