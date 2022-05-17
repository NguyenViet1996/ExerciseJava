package VehicleManagement.model;

public class Car extends Vehicle {

		private final int numberOfSeats;
		private final String typeOfEngine;

		public Car(int numberId, String manufacturer, int yearOfManufacture, double price, String color, int numberOfSeats, String typeOfEngine) {
				super(numberId, manufacturer, yearOfManufacture, price, color);
				this.numberOfSeats = numberOfSeats;
				this.typeOfEngine = typeOfEngine;
		}

		public int getNumberOfSeats() {
				return numberOfSeats;
		}

		public String getTypeOfEngine() {
				return typeOfEngine;
		}

		@Override
		public String toString() {
				return "The car { id : " +
						this.getId() + ", manufacturer : " +
						this.getManufacturer() + ", the year of manufacturing : " +
						this.getYearOfManufacture() + ", the number of seats : " +
						this.getNumberOfSeats() + ", the price : " +
						this.getPrice() + ", the color : " +
						this.getColor() + ", hte number of seats :" +
						this.getNumberOfSeats() + ", the type of engine: " +
						this.getTypeOfEngine() + "}";
		}

}
