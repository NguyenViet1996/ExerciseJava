package VehicleManagement;

public class Truck extends Vehicle{

		private double tonnage;

		public Truck(int numberId, String manufacturer, int yearOfManufacture, double price, String color,double tonnage) {
				super(numberId, manufacturer, yearOfManufacture, price, color);
				this.tonnage = tonnage;
		}

		public double getTonnage() {
				return tonnage;
		}

		public void setTonnage(double tonnage) {
				this.tonnage = tonnage;
		}

		@Override
		public String toString() {
				return "The bike { id : " +
						this.getNumberId() + ", manufacturer : " +
						this.getManufacturer() + ", the year of manufacturing : " +
						this.getYearOfManufacture() + ", the tonnage : " +
						this.getTonnage() + ", the price : " +
						this.getPrice() + ", the color : " +
						this.getColor() + "}";
		}

}
