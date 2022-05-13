package CompanyManagement.Employee;

public class ExperienceEmployee extends Employee {

    private int explnYear;
		private String proSkill;

		public ExperienceEmployee(int numberEmployee, String name, String birthday, String phone, String email, String employee_type, int explnYear, String proSkill) {
				super(numberEmployee, name, birthday, phone, email, employee_type);
				this.explnYear = explnYear;
				this.proSkill = proSkill;
		}

		public int getExplnYear() {
				return explnYear;
		}

		public void setExplnYear(int explnYear) {
				this.explnYear = explnYear;
		}

		public String getProSkill() {
				return proSkill;
		}

		public void setProSkill(String proSkill) {
				this.proSkill = proSkill;
		}

		@Override
		public void showInfo() {
				System.out.println("the Experience Employee : { " +
						" number of employee : " + this.getNumberEmployee() +
						", full of name : " + this.getName() +
						", birthday : " + this.getBirthday() +
						", phone : " + this.getPhone() +
						", email : " + this.getEmail() +
						", type of employee : " + this.getEmployee_type() +
						",the number years of experience : " + this.getExplnYear() +
						", the personal skill : " + this.getProSkill() +
						"}"
						);

		}

}
