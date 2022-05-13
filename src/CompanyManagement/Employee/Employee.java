package CompanyManagement.Employee;

public abstract class Employee {

		private int numberEmployee;
		private String name;
		private String birthday;
		private String phone;
		private String email;
		private String employee_type;
		private static int employee_count = 0;

		public Employee(int numberEmployee,String name, String birthday, String phone, String email, String employee_type) {
				this.numberEmployee = numberEmployee;
				this.name = name;
				this.birthday = birthday;
				this.phone = phone;
				this.email = email;
				this.employee_type = employee_type;
		}

		public int getNumberEmployee() {
				return numberEmployee;
		}

		public void setNumberEmployee(int numberEmployee) {
				this.numberEmployee = numberEmployee;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public String getBirthday() {
				return birthday;
		}

		public void setBirthday(String birthday) {
				this.birthday = birthday;
		}

		public String getPhone() {
				return phone;
		}

		public void setPhone(String phone) {
				this.phone = phone;
		}

		public String getEmail() {
				return email;
		}

		public void setEmail(String email) {
				this.email = email;
		}

		public String getEmployee_type() {
				return employee_type;
		}

		public void setEmployee_type(String employee_type) {
				this.employee_type = employee_type;
		}

    public abstract void showInfo();

}
