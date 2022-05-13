package CompanyManagement.Employee;

public class InternEmployee extends Employee {

    private String majors;
		public String semester;
		public String university_name;

		public InternEmployee(int numberEmployee, String name, String birthday, String phone, String email, String employee_type, String majors, String semester, String university_name) {
				super(numberEmployee, name, birthday, phone, email, employee_type);
				this.majors = majors;
				this.semester =semester;
				this.university_name = university_name;
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

		public String getUniversity_name() {
				return university_name;
		}

		public void setUniversity_name(String university_name) {
				this.university_name = university_name;
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
						",the majors: " + this.getMajors() +
						", the semester : " + this.getSemester() +
						", the name of university: " + this.getUniversity_name() +
						"}"
				);

		}

}
