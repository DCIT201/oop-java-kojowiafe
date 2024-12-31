public abstract class Vehicle {

    private String vehicleID;
    private String model;
    private String color;
    private int year;
    private boolean isAvailableForRental;
    private int rentalCost;
    
    public Vehicle (String vehicleID, String model, String color, int year, boolean isAvailableForRental, int rentalCost) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.color = color;
        this.year = year;
        this.isAvailableForRental = isAvailableForRental;
        this.rentalCost = rentalCost;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public boolean getAvailableForRental() {
        return isAvailableForRental;
    }

    public int getRentalCost() {
        return rentalCost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvailableForRental(boolean isAvailableForRental) {
        this.isAvailableForRental = isAvailableForRental;
    }

    public void setRentalCost(int rentalCost) {
        this.rentalCost = rentalCost;
    }


    abstract int calculateRentalCost(int days);

    abstract String isAvailableForRental();

    public String toString() {
        return getModel()+"\n"+"Color: "+getColor()+"\n"+"Year: "+getYear()+"\n"+"Available: "+getAvailableForRental()+"\n"+"Rental Cost: "+getRentalCost();
    }

    public String getInfo() {
        return getModel()+"\n"+"Color: "+getColor()+"\n"+"Year: "+getYear()+"\n"+"Available: "+isAvailableForRental()+"\n"+"Rental Cost: "+getRentalCost();
    }

}
