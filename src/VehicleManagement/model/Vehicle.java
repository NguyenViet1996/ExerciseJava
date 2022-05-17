package VehicleManagement.model;

public class Vehicle {

     private final int id;
		 private final String manufacturer;
		 private final int yearOfManufacture;
		 private final double price;
		 private final String color;

     public Vehicle(int id,String manufacturer,int yearOfManufacture,double price,String color) {
				 this.id = id;
				 this.manufacturer = manufacturer;
				 this.yearOfManufacture = yearOfManufacture;
				 this.price = price;
				 this.color = color;
		 }

		public int getId() {
				return id;
		}

		public String getManufacturer() {
				return manufacturer;
		}

		public int getYearOfManufacture() {
				return yearOfManufacture;
		}

		public double getPrice() {
				return price;
		}

		public String getColor() {
				return color;
		}

}
