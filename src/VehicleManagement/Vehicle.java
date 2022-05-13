package VehicleManagement;

public class Vehicle {

     private int numberId;
		 private String manufacturer;
		 private int yearOfManufacture;
		 private double price;
		 private String color;

     public Vehicle(int numberId,String manufacturer,int yearOfManufacture,double price,String color) {
				 this.numberId = numberId;
				 this.manufacturer = manufacturer;
				 this.yearOfManufacture = yearOfManufacture;
				 this.price = price;
				 this.color = color;
		 }

		public int getNumberId() {
				return numberId;
		}

		public void setNumberId(int numberId) {
				this.numberId = numberId;
		}

		public String getManufacturer() {
				return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
				this.manufacturer = manufacturer;
		}

		public int getYearOfManufacture() {
				return yearOfManufacture;
		}

		public void setYearOfManufacture(int yearOfManufacture) {
				this.yearOfManufacture = yearOfManufacture;
		}

		public double getPrice() {
				return price;
		}

		public void setPrice(double price) {
				this.price = price;
		}

		public String getColor() {
				return color;
		}

		public void setColor(String color) {
				this.color = color;
		}

}
