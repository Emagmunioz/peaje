package dev.peaje;

public class Vehicle {
    private final String licensePlate;
    private final VehicleType type;
    private final int axles;

    public Vehicle(String licensePlate, VehicleType type) {
        this(licensePlate, type, 0);
    }

    public Vehicle(String licensePlate, VehicleType type, int axles) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.axles = axles;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public int getAxles() {
        return axles;
    }
    

}
