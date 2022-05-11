package EmployeeManagement;

public class Engineer extends Employee{

		private String trainingBranch;

		public Engineer(String name, String gender, String address, int age,String trainingBranch) {
				super(name, gender, address, age);
				this.trainingBranch = trainingBranch;
		}

		public void setTrainingBranch(String trainingBranch) {
				this.trainingBranch = trainingBranch;
		}

    public String getTrainingBranch() {
				return this.trainingBranch;
		}

		@Override
		public String toString() {
				return  "Engineer {" +
						"Name" + this.getName() +
						"," + "Age : " + this.getAge() +
						"," + "Address : " + this.getAddress() +
						"," + "Gender : " + this.getGender() +
						"," + "The branch : " + this.getTrainingBranch() +
						"}";
		}

}
