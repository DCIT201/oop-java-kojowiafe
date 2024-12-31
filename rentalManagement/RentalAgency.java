package rentalManagement;
import java.util.*;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addNewVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Vehicle rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : fleet) {
            if (vehicle.getVehicleID().equals(vehicleId) && vehicle.getAvailableForRental()) {
                vehicle.setAvailableForRental(false);
                customer.addRental(vehicle);
                return vehicle;
            }
        }
        throw new IllegalStateException("Vehicle not available");
    }

    public void returnVehicle(Vehicle vehicle) { vehicle.setAvailableForRental(true); }

    public List<Vehicle> generateFleetReport() { return Collections.unmodifiableList(fleet); }
}