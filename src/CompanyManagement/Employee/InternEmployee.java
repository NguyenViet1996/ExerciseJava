package CompanyManagement.Employee;

public class InternEmployee extends Employee {

    private String majors;
		public String semester;
		public String nameOfUniversity;

		public InternEmployee(int numberEmployee, String name, String birthday, String phone, String email,
													String typeOfEmployee, String majors, String semester, String nameOfUniversity) {
				super(numberEmployee, name, birthday, phone, email, typeOfEmployee);
				this.majors = majors;
				this.semester =semester;
				this.nameOfUniversity = nameOfUniversity;
		}

		public String getMajors() {
				return majors;
		}

		public void setMajors(String majors) {
				this.majors = majors;
		}

		public String getSemester() {
				return semester;
		}

		public void setSemester(String semester) {
				this.semester = semester;
		}

		public String getNameOfUniversity() {
				return nameOfUniversity;
		}

		public void setNameOfUniversity(String nameOfUniversity) {
				this.nameOfUniversity = nameOfUniversity;
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
						",the majors: " + this.getMajors() +
						", the semester : " + this.getSemester() +
						", the name of university: " + this.getNameOfUniversity() +
						"}"
				);

		}

		public void update(int idEmployee, String name, String birthday, String phone, String email, String typeOfEmployee,
											 String majors, String semester, String nameOfUniversity) {
				this.setIdEmployee(idEmployee);
				this.setName(name);
				this.setBirthday(birthday);
				this.setPhone(phone);
				this.setEmail(email);
				this.setTypeOfEmployee(typeOfEmployee);
				this.setMajors(majors);
				this.setSemester(semester);
				this.setNameOfUniversity(nameOfUniversity);
		}

}
