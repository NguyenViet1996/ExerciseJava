package VehicleManagement.view;

import VehicleManagement.business.ManagerVehicle;
import VehicleManagement.model.Bike;
import VehicleManagement.model.Car;
import VehicleManagement.model.Truck;
import VehicleManagement.model.Vehicle;

import java.util.Optional;
import java.util.Scanner;

public class Main {

		private static final String CAR = "Car";
		private static final String BIKE = "Bike";
		private static final String TRUCK = "Truck";
		private static final String YES = "yes";
		private static final String NO = "no";

		public static void main(String[] args) {

				ManagerVehicle manager = new ManagerVehicle();
				Scanner scaner = new Scanner(System.in);

				// add a new vehicle
				addNewVehicleToList(manager,scaner);

        // delete vehicle
				deleteVehicleFromList(manager,scaner);

				// find the vehicle follow manufacturer and color
				findVehicleFromList(manager,scaner);

				// view the list of vehicle
				manager.viewListVehicle();

		}

		private static void addNewVehicleToList(ManagerVehicle manager,Scanner scanner) {

				while(true) {
						System.out.print("Please enter the id of vehicle that you want : ");
						int number = Integer.parseInt(scanner.nextLine());
						System.out.print("Enter the name of manufacturer : ");
						String manufacturer = scanner.nextLine();
						System.out.print("Enter the year of manufacturing : ");
						int year = Integer.parseInt(scanner.nextLine());
						System.out.print("Enter the price : ");
						double price = Double.parseDouble(scanner.nextLine());
						System.out.print("Enter the color : ");
						String color = scanner.nextLine();
						System.out.print("Enter the name of vehicle : (Car/Bkie/Truck)");
						String name = scanner.nextLine();
						if (CAR.equalsIgnoreCase(name)) {
								System.out.print("Enter the number of seats : ");
								int numberSeats = Integer.parseInt(scanner.nextLine());
								System.out.print("Enter the type of Engine : ");
								String nameEngine = scanner.nextLine();
								manager.addNewVehicle(new Car(number,manufacturer,year,price,color,numberSeats,nameEngine));
						} else if (BIKE.equalsIgnoreCase(name)) {
								System.out.print("Enter the wattage : ");
								double wattage = Double.parseDouble(scanner.nextLine());
								manager.addNewVehicle(new Bike(number,manufacturer,year,price,color,wattage));
						} else if (TRUCK.equalsIgnoreCase(name)) {
								System.out.print("Enter the tonnage : ");
								double tonnage = Double.parseDouble(scanner.nextLine());
								manager.addNewVehicle(new Truck(number,manufacturer,year,price,color,tonnage));
						}
						System.out.print("Do you want to continue to add : ");
						String answer = scanner.nextLine();
						if (YES.equalsIgnoreCase(answer)) {
								System.out.print("Please to continue :");
						} else if (NO.equalsIgnoreCase(answer)) {
								break;
						}
				}

		}

		private static void deleteVehicleFromList(ManagerVehicle manager,Scanner scanner) {
				System.out.print("Enter the id of vehicle that you want to delete : ");
				int id = Integer.parseInt(scanner.nextLine());
				manager.deleteVehicle(id);
		}

		private static void findVehicleFromList(ManagerVehicle manager, Scanner scanner) {
				System.out.println("The Information vehicle that you want to find");
				System.out.print("Enter the manufacturer  of vehicle that you want to find : ");
				String nameOfManufacturer = scanner.nextLine();
				System.out.print("Enter the color of vehicle that you want to find : ");
				String color = scanner.nextLine();
				Optional<Vehicle> vehicle =  manager.findVehicle(nameOfManufacturer,color);
				System.out.println(vehicle.isPresent() ? vehicle.get() : "Do not find the vehicle that you want to find");
		}

}
