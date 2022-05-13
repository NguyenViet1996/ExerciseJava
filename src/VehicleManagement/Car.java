package VehicleManagement;

public class Car extends Vehicle{

		private int numberOfSeats;
		private String typeOfEngine;

		public Car(int numberId, String manufacturer, int yearOfManufacture, double price, String color, int numberOfSeats, String typeOfEngine) {
				super(numberId, manufacturer, yearOfManufacture, price, color);
				this.numberOfSeats = numberOfSeats;
				this.typeOfEngine = typeOfEngine;
		}

		public int getNumberOfSeats() {
				return numberOfSeats;
		}

		public void setNumberOfSeats(int numberOfSeats) {
				this.numberOfSeats = numberOfSeats;
		}

		public String getTypeOfEngine() {
				return typeOfEngine;
		}

		public void setTypeOfEngine(String typeOfEngine) {
				this.typeOfEngine = typeOfEngine;
		}

		@Override
		public String toString() {
				return "The car { id : " +
						this.getNumberId() + ", manufacturer : " +
						this.getManufacturer() + ", the year of manufacturing : " +
						this.getYearOfManufacture() + ", the number of seats : " +
						this.getNumberOfSeats() + ", the price : " +
						this.getPrice() + ", the color : " +
						this.getColor() + "}";
		}

}
