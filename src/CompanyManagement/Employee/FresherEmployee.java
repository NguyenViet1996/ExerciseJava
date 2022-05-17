package CompanyManagement.Employee;

public class FresherEmployee extends Employee {

    private int graduationDate;
		private String education;

		public FresherEmployee(int numberEmployee, String name, String birthday, String phone, String email,
													 String typeOfEmployee,int graduationDate,String education) {
				super(numberEmployee, name, birthday, phone, email, typeOfEmployee);
				this.graduationDate = graduationDate;
				this.education = education;
		}

		public int getGraduationDate() {
				return graduationDate;
		}

		public void setGraduationDate(int graduationDate) {
				this.graduationDate = graduationDate;
		}

		public String getEducation() {
				return education;
		}

		public void setEducation(String education) {
				this.education = education;
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
						",the time of graduating : " + this.getGraduationDate() +
						", the education : " + this.getEducation() +
						"}"
				);
		}

		public void update(int idEmployee, String name, String birthday, String phone, String email, String typeOfEmployee,
											 int graduationDate,String education) {
				this.setIdEmployee(idEmployee);
				this.setName(name);
				this.setBirthday(birthday);
				this.setPhone(phone);
				this.setEmail(email);
				this.setTypeOfEmployee(typeOfEmployee);
				this.setGraduationDate(graduationDate);
				this.setEducation(education);
		}

}
