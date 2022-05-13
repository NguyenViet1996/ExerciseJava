package VehicleManagement;

public class Bike extends Vehicle{

		public double wattage;

		public Bike(int numberId, String manufacturer, int yearOfManufacture, double price, String color,double wattage) {
				super(numberId, manufacturer, yearOfManufacture, price, color);
				this.wattage = wattage;
		}

		public double getWattage() {
				return wattage;
		}

		public void setWattage(double wattage) {
				this.wattage = wattage;
		}

		@Override
		public String toString() {
				return "The bike { id : " +
						this.getNumberId() + ", manufacturer : " +
						this.getManufacturer() + ", the year of manufacturing : " +
						this.getYearOfManufacture() + ", the wattage : " +
						this.getWattage() + ", the price : " +
						this.getPrice() + ", the color : " +
						this.getColor() + "}";
		}

}
