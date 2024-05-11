import java.util.List;
import java.util.Scanner;

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

}
// Create an auctioneer account
Auctioneer auctioneer = new Auctioneer("auctioneer", "password");