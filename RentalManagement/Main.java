public class Main {

    public static void main(String[] args) {

        // Vehicle car = new Car("Red", "Toyota", 2019, false, 5500);
        Vehicle car = new Car("CAR001", "Toyota", "Red", 2019, false, 30000);
        Vehicle motorcycle = new Motorcycle("MOT001", "Harley", "Black", 2017, true, 10000);
        Vehicle truck = new Truck("TRK001", "Ford", "Blue", 2018, false, 30000);
        


        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle: "+vehicle.getModel()+" "+vehicle.getColor()+" "+vehicle.getYear());
            System.out.println("Rental Cost: $"+vehicle.calculateRentalCost(10));
            System.out.println("Available: "+vehicle.isAvailableForRental());
            System.out.println();
        }

    }
}