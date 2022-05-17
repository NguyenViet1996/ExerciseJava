package CompanyManagement.Employee;

public abstract class Employee {

		private int idEmployee;
		private String name;
		private String birthday;
		private String phone;
		private String email;
		private String typeOfEmployee;
//		private static int employee_count = 0;

		public Employee(int idEmployee, String name, String birthday, String phone, String email, String typeOfEmployee) {
				this.idEmployee = idEmployee;
				this.name = name;
				this.birthday = birthday;
				this.phone = phone;
				this.email = email;
				this.typeOfEmployee = typeOfEmployee;
		}

		public int getIdEmployee() {
				return idEmployee;
		}

		public void setIdEmployee(int idEmployee) {
				this.idEmployee = idEmployee;
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

		public String getTypeOfEmployee() {
				return typeOfEmployee;
		}

		public void setTypeOfEmployee(String typeOfEmployee) {
				this.typeOfEmployee = typeOfEmployee;
		}

		public abstract void showInfo();

}