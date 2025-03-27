package dev.peaje;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private final String name;
    private final String city;
    private double totalCollected;
    private List<Vehicle> processedVehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.processedVehicles = new ArrayList<>(); 
    }
     public void processVehicle(Vehicle vehicle) {
        double toll = calculateToll(vehicle);
        totalCollected += toll;
        processedVehicles.add(vehicle);
    }
    public List<Vehicle> getProcessedVehicles() {
        return new ArrayList<>(processedVehicles);
    }
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Toll Station: ").append(name).append(" - ").append(city).append("\n");
        report.append("Processed Vehicles:\n");
        
        for (Vehicle vehicle : processedVehicles) {
            double toll = calculateToll(vehicle);
            report.append(vehicle.getLicensePlate())
                  .append(" (").append(vehicle.getType()).append("): $")
                  .append(toll).append("\n");
        }
        
        report.append("Total collected: $").append(totalCollected).append("\n");
        return report.toString();
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
