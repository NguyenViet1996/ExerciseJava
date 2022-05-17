package VehicleManagement.business;

import VehicleManagement.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ManagerVehicle {

		private List<Vehicle> listVehicle;

		public ManagerVehicle() {
				this.listVehicle = new ArrayList<>();
		}

		public void addNewVehicle(Vehicle vehicle) {
				this.listVehicle.add(vehicle);
		}

    public void deleteVehicle(int vehicleId) {
        this.listVehicle = this.listVehicle.stream().filter(vehicle -> vehicle.getId() != vehicleId).collect(Collectors.toList());
		}

		public Optional<Vehicle> findVehicle(String manufacturer,String color) {
				return  this.listVehicle.stream().filter(vehicle -> vehicle.getManufacturer().equalsIgnoreCase(manufacturer)
						&& vehicle.getColor().equalsIgnoreCase(color)).findFirst();
		}

    public void viewListVehicle() {
				System.out.println("The list of Vehicles");
				for (Vehicle vehicle : this.listVehicle) {
						System.out.println(vehicle);
				}
		}

}
