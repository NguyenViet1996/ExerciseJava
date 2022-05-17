package StudentManagement;

public class Student {

		private String grade;
		private int age;
		private String name;
		private String homeTown;

		public Student(String grade, String name, int age, String homeTown) {
				this.grade = grade;
				this.age = age;
				this.name = name;
				this.homeTown = homeTown;
		}

		public String getGrade() {
				return grade;
		}

		public void setGrade(String grade) {
				this.grade = grade;
		}

		public int getAge() {
				return age;
		}

		public void setAge(int age) {
				this.age = age;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public String getHomeTown() {
				return homeTown;
		}

		public void setHomeTown(String homeTown) {
				this.homeTown = homeTown;
		}

		@Override
		public String toString() {
				return "Student{" +
						"grade='" + grade + '\'' +
						", age=" + age +
						", name='" + name + '\'' +
						", homeTown='" + homeTown + '\'' +
						'}';
		}

}
