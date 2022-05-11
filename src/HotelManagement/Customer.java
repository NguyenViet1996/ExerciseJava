package HotelManagement;

public class Customer {

		private String name;
		private int age;
		private String identityCardNumber;
		private int amountDayRent;
		private Room room;
		private int totalPay;

		public Customer(String name, int age, String identityCardNumber, int amountDayRent, Room room) {
			  this.name = name;
				this.age = age;
				this.identityCardNumber = identityCardNumber;
				this.amountDayRent = amountDayRent;
				this.room = room;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public int getAge() {
				return age;
		}

		public void setAge(int age) {
				this.age = age;
		}

		public String getIdentityCardNumber() {
				return identityCardNumber;
		}

		public void setIdentityCardNumber(String identityCardNumber) {
				this.identityCardNumber = identityCardNumber;
		}

		public int getAmountDayRent() {
				return amountDayRent;
		}

		public void setAmountDayRent(int amountDayRent) {
				this.amountDayRent = amountDayRent;
		}

		public Room getRoom() {
				return room;
		}

		public void setRoom(Room room) {
				this.room = room;
		}

		public int getTotalPay() {
				return totalPay;
		}

		public void setTotalPay(int totalPay) {
				this.totalPay = totalPay;
		}

		@Override
		public String toString() {
				return "The name of customer : " +
						this.getName() + ", age : " +
						this.getAge() + ", card number : " +
						this.getIdentityCardNumber() + ", the amount of day renting : " +
						this.getAmountDayRent() + ", the type of room that customer select : " +
						this.getRoom().getNameOfRoom() + " , the total money that customer must pay : " +
						this.getTotalPay() + ".";
		}

}
