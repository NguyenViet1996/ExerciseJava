package CaculateSalary;

public class Teacher {

      private String name;
      private String homeTown;
      private int age;
      private int numberEmploy;
      private float salarayGross;
      private float bonusAmount;
      private float fineAmount;
      private float salaryNet;

      public Teacher(String name, String homeTown, int age, int numberEmployee, float salaryGross, float bonus, float fine) {
            this.name = name;
            this.homeTown = homeTown;
            this.age = age;
            this.numberEmploy = numberEmployee;
            this.salarayGross = salaryGross;
            this.bonusAmount = bonus;
            this.fineAmount = fine;
      }

      public float getSalarayGross() {
            return salarayGross;
      }

      public float getBonusAmount() {
            return bonusAmount;
      }

      public float getFineAmount() {
            return fineAmount;
      }

      public float getSalaryNet() {
            return salaryNet;
      }

      public void setSalaryNet(float salaryNet) {
            this.salaryNet = salaryNet;
      }

      public String getName() {
            return this.name;
      }

      public int getAge() {
            return age;
      }

      public String getHomeTown() {
            return this.homeTown;
      }

      public int getNumberEmploy() {
            return this.numberEmploy;
      }

      @Override
      public String toString() {
            return "Ten giao vien : " +
               this.getName() + " , tuoi : " +
                this.getAge() + " , que quan : " +
                this.getHomeTown() + ", ma nhan vien : " +
                this.getNumberEmploy() + " , luong thuc lanh : " +
                this.getSalaryNet() + ".";

      }

}
