package VehicleManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerVehicle {

		private List<Vehicle> listVehicle;

		public ManagerVehicle() {
				this.listVehicle = new ArrayList<>();
		}

		public void addNewVehicle(Vehicle vehicle) {
				this.listVehicle.add(vehicle);
		}

    public void deleteVehicle(int numberId) {
        this.listVehicle = this.listVehicle.stream().filter(vehicle -> vehicle.getNumberId() != numberId).collect(Collectors.toList());
		}

		public void findVehicle(String manufacturer,String color) {
				this.listVehicle = this.listVehicle.stream().filter(vehicle -> vehicle.getManufacturer().equalsIgnoreCase(manufacturer)
						&& vehicle.getColor().equalsIgnoreCase(color)).collect(Collectors.toList());
		}

    public void viewListVehicle() {
				for (Vehicle vehicle : this.listVehicle) {
						System.out.println(vehicle);
				}
		}

}
