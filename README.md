# Toll System (Sistema de Peaje)

A Java application that models a toll collection system, built with Maven using TDD (Test-Driven Development) with JUnit 5 and Hamcrest.

## Features

- Different toll rates for vehicles:
  - Cars: $100
  - Motorcycles: $50
  - Trucks: $50 per axle
- Track processed vehicles
- Generate reports with collected totals

## UML Diagram


![image](https://github.com/user-attachments/assets/4dec323c-c4af-4295-bc61-8fab23e8faa2)


## Requirements

- Java 11+
- Maven 3.6+

## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/Emagmunioz/peaje.git
   mvn clean install
   mvn test
# Example Usage
// Create a toll station
TollStation station = new TollStation("North Gate", "Medellin");

// Process vehicles
station.processVehicle(new Vehicle("CAR123", VehicleType.CAR));
station.processVehicle(new Vehicle("MOTO456", VehicleType.MOTORCYCLE));
station.processVehicle(new Vehicle("TRK789", VehicleType.TRUCK, 3));

// Generate report
System.out.println(station.generateReport());

# Test Coverage

![image](https://github.com/user-attachments/assets/874bc53f-e1bf-4732-99a9-7c92cfe2184b)

# License

MIT License

