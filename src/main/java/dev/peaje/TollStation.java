package dev.peaje;

public class TollStation {
    private final String name;
    private final String city;
    private double totalCollected;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getTotalCollected() {
        return totalCollected;
    }
    public double calculateToll(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case CAR:
                return 100;
            case MOTORCYCLE:
                return 50;
            case TRUCK:
                return 50 * vehicle.getAxles();
            default:
                return 0;
        }
    }

}
