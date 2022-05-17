package VehicleManagement.model;

public class Bike extends Vehicle {

		public final double wattage;

		public Bike(int numberId, String manufacturer, int yearOfManufacture, double price, String color,double wattage) {
				super(numberId, manufacturer, yearOfManufacture, price, color);
				this.wattage = wattage;
		}

		public double getWattage() {
				return wattage;
		}

		@Override
		public String toString() {
				return "The bike { id : " +
						this.getId() + ", manufacturer : " +
						this.getManufacturer() + ", the year of manufacturing : " +
						this.getYearOfManufacture() + ", the wattage : " +
						this.getWattage() + ", the price : " +
						this.getPrice() + ", the color : " +
						this.getColor() + ", the wattage : " +
						this.getWattage() + "}";
		}

}
