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