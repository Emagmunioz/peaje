package dev.peaje;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
    public class TollStationTest {
    private TollStation tollStation;
        
    
 @org.junit.jupiter.api.Test
 public void testTollStationCreation() {
     assertThat(tollStation.getName(), is("North Station"));
     assertThat(tollStation.getCity(), is("Medellin"));
     assertThat(tollStation.getTotalCollected(), is(0.0));
}
 @Test
public void testCalculateCarToll() {
    Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
    double toll = tollStation.calculateToll(car);
    assertThat(toll, is(100.0));
}
@Test
public void testCalculateMotorcycleToll() {
    Vehicle motorcycle = new Vehicle("XYZ789", VehicleType.MOTORCYCLE);
    double toll = tollStation.calculateToll(motorcycle);
    assertThat(toll, is(50.0));
}
@Test
public void testCalculateTruckToll() {
    Vehicle truck = new Vehicle("TRK456", VehicleType.TRUCK, 3);
    double toll = tollStation.calculateToll(truck);
    assertThat(toll, is(150.0));
}
@Test
public void testProcessVehicle() {
    Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
    tollStation.processVehicle(car);
    assertThat(tollStation.getTotalCollected(), is(100.0));
    
    Vehicle motorcycle = new Vehicle("XYZ789", VehicleType.MOTORCYCLE);
    tollStation.processVehicle(motorcycle);
    assertThat(tollStation.getTotalCollected(), is(150.0));
}
@Test
public void testGetProcessedVehicles() {
    Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
    Vehicle truck = new Vehicle("TRK456", VehicleType.TRUCK, 3);
    
    tollStation.processVehicle(car);
    tollStation.processVehicle(truck);
    
    assertThat(tollStation.getProcessedVehicles().size(), is(2));
    assertThat(tollStation.getProcessedVehicles(), hasItems(car, truck));
}
@Test
public void testGenerateReport() {
    Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
    Vehicle motorcycle = new Vehicle("XYZ789", VehicleType.MOTORCYCLE);
    Vehicle truck = new Vehicle("TRK456", VehicleType.TRUCK, 3);
    
    tollStation.processVehicle(car);
    tollStation.processVehicle(motorcycle);
    tollStation.processVehicle(truck);
    
    String report = tollStation.generateReport();
    
    assertThat(report, containsString("Toll Station: North Station - Medellin"));
    assertThat(report, containsString("ABC123 (CAR): $100.0"));
    assertThat(report, containsString("XYZ789 (MOTORCYCLE): $50.0"));
    assertThat(report, containsString("TRK456 (TRUCK): $150.0"));
    assertThat(report, containsString("Total collected: $300.0"));
}

    }


