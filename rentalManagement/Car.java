package rentalManagement;
public class Car extends Vehicle{

    private static final int ADDITIONAL_COST = 25;
        
    public Car (String vehicleID, String model, String color, int year, boolean isAvailableForRental, int rentalCost) {
        super(vehicleID, model, color, year, isAvailableForRental, rentalCost);
    }

    @Override
    int calculateRentalCost(int days) {
        return (ADDITIONAL_COST + getRentalCost()) * days;
    }

    @Override
    public String toString() {
        return "Name of car: "+super.toString();
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