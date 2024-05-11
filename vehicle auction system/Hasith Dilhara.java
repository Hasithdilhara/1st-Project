/**
 * This program is a vehicle auction system where the auctioneer can list vehicles with the starting bid
 * and the auction duration, and the buyers can bid their offer to any number of listed vehicles.
 * 
 * The system allows for two different logins for the auctioneer and the bidder (buyer).
 * 
 * The auctioneer can add a new vehicle to the auction and change existing vehicles in the auction.
 * 
 * The bidder can view details of the available vehicles in the auction and place a bid for a listed vehicle.
 * 
 * After the auction ends, the highest bidder is notified to pay and get his/her vehicle.
 */

// Import necessary Java libraries
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Define the Vehicle class
class Vehicle {
    private String make;
    private String model;
    private int year;
    private double startingBid;
    private int auctionDuration;

    // Constructor for Vehicle class
    public Vehicle(String make, String model, int year, double startingBid, int auctionDuration) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.startingBid = startingBid;
        this.auctionDuration = auctionDuration;
    }

    // Getters for Vehicle class
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getStartingBid() {
        return startingBid;
    }

    public int getAuctionDuration() {
        return auctionDuration;
    }
}

// Define the Auctioneer class
class Auctioneer {
    private String username;
    private String password;

    // Constructor for Auctioneer class
    public Auctioneer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for Auctioneer class
    public String getUsername() {
        return username;
    }

    // Method for adding a new vehicle to the auction
    public void addVehicle(List<Vehicle> vehicles) {
        Scanner scanner = new Scanner(System.in);

        // Get vehicle details from the user
        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();
        System.out.println("Enter vehicle year: ");
        int year = scanner.nextInt();
        System.out.println("Enter starting bid: ");
        double startingBid = scanner.nextDouble();
        System.out.println("Enter auction duration (in minutes): ");
        int auctionDuration = scanner.nextInt();

        // Create new vehicle object and add it to the list of vehicles
        Vehicle vehicle = new Vehicle(make, model, year, startingBid, auctionDuration);
        vehicles.add(vehicle);

        System.out.println("Vehicle added to the auction.");
    }

    // Method for changing an existing vehicle in the auction
    public void changeVehicle(List<Vehicle> vehicles) {
        Scanner scanner = new Scanner(System.in);

        // Get vehicle details from the user
        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();

        // Find the vehicle in the list of vehicles
        boolean found = false;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                found = true;

                // Get the new vehicle details from the user
                System.out.println("Enter new starting bid: ");
                double startingBid = scanner.nextDouble();
                System.out.println("Enter new auction duration (in minutes): ");
                int auctionDuration = scanner.nextInt();
    }

// Define the Bidder class
class Bidder {
private String username;
private String password;
}

// Define the main class
public class VehicleAuctionSystem {
public static void main(String[] args) {
// Create a list of vehicles and add some initial vehicles to it
List<Vehicle> vehicles = new ArrayList<>();
Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2015, 5000, 60);
Vehicle vehicle2 = new Vehicle("Honda", "Accord", 2016, 6000, 90);
Vehicle vehicle3 = new Vehicle("Nissan", "Altima", 2017, 7000, 120);
vehicles.add(vehicle1);
vehicles.add(vehicle2);
vehicles.add(vehicle3);
   }
}
// Create an auctioneer account
Auctioneer auctioneer = new Auctioneer("auctioneer", "password");

// Create a bidder account
Bidder bidder = new Bidder("bidder", "password");

Scanner scanner = new Scanner(System.in);

// Login screen
System.out.println("Welcome to the Vehicle Auction System!");
System.out.println("Please login as an auctioneer or a bidder.");

// Loop for login attempts
while (true) {
System.out.println("Enter 'a' for auctioneer or 'b' for bidder: ");
String loginType = scanner.nextLine();

}


   

           









