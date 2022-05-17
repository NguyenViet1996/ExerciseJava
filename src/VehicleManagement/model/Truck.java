package VehicleManagement.model;

public class Truck extends Vehicle {

		private final double tonnage;

		public Truck(int numberId, String manufacturer, int yearOfManufacture, double price, String color,double tonnage) {
				super(numberId, manufacturer, yearOfManufacture, price, color);
				this.tonnage = tonnage;
		}

		public double getTonnage() {
				return tonnage;
		}

		@Override
		public String toString() {
				return "The Truck { id : " +
						this.getId() + ", manufacturer : " +
						this.getManufacturer() + ", the year of manufacturing : " +
						this.getYearOfManufacture() + ", the tonnage : " +
						this.getTonnage() + ", the price : " +
						this.getPrice() + ", the color : " +
						this.getColor() + ", the tonnage : " +
						this.getTonnage() + "}";
		}

}
