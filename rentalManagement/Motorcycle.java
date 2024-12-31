package rentalManagement;
public class Motorcycle extends Vehicle{

    private static final int ADDITIONAL_COST = 15;

    Motorcycle (String vehicleID, String model, String color, int year, boolean isAvailableForRental, int rentalCost) {
        super(vehicleID, model, color, year, isAvailableForRental, rentalCost);
    }

    @Override
    int calculateRentalCost(int days) {
        return (ADDITIONAL_COST + getRentalCost()) * days;
    }

    @Override
    public String toString() {
        return "Name of motorcycle: "+super.toString();
    }

    @Override
    String isAvailableForRental() {
        if (getAvailableForRental() == true) {
            return "yes";
        }
        return "No";
    }

    public String getInfo() {
        return "Name of car: "+super.getInfo();
    }
}
