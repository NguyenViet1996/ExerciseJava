package CompanyManagement.Employee;

public class ExperienceEmployee extends Employee {

    private int explnYear;
		private String proSkill;

		public ExperienceEmployee(int idEmployee, String name, String birthday, String phone, String email,
															String typeOfEmployee, int explnYear, String proSkill) {
				super(idEmployee, name, birthday, phone, email, typeOfEmployee);
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
						" number of employee : " + this.getIdEmployee() +
						", full of name : " + this.getName() +
						", birthday : " + this.getBirthday() +
						", phone : " + this.getPhone() +
						", email : " + this.getEmail() +
						", type of employee : " + this.getTypeOfEmployee() +
						",the number years of experience : " + this.getExplnYear() +
						", the personal skill : " + this.getProSkill() +
						"}"
						);

		}

		public void update(int idEmployee, String name, String birthday, String phone, String email, String typeOfEmployee,
											 int explnYear,  String proSkill) {
				this.setIdEmployee(idEmployee);
				this.setName(name);
				this.setBirthday(birthday);
				this.setPhone(phone);
				this.setEmail(email);
				this.setTypeOfEmployee(typeOfEmployee);
				this.setExplnYear(explnYear);
				this.setProSkill(proSkill);
		}

}
