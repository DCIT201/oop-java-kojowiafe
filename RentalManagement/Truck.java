public class Truck extends Vehicle{

    private static final int ADDITIONAL_COST = 32;

    Truck (String vehicleID, String model, String color, int year, boolean isAvailableForRental, int rentalCost) {
        super(vehicleID, model, color, year, isAvailableForRental, rentalCost);
    }

    @Override
    int calculateRentalCost(int days) {
        return (ADDITIONAL_COST + getRentalCost()) * days;
    }

    @Override
    public String toString() {
        return "Name of truck: "+super.toString();
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
