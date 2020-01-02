package Exercise2;

import java.util.List;

public class CarParkTest {

    public static void main(String[] args) {

     CarPark carPark = new CarPark();

     List<Vehicle> allowedVehicles = carPark.getAllowedVehicles();
     List<Vehicle> parkedVehicles = carPark.getParkedVehicles();

     Vehicle vehicle1 = new Car("Toyota","C-HR", "DW12345");
     Vehicle vehicle2 = new Motorbike("Yamaha", "MT-07", "DWR45342");

     carPark.addAllowedVehicle(vehicle1, allowedVehicles);
     carPark.addAllowedVehicle(vehicle2, allowedVehicles);

     carPark.registerParkedVehicle("DW12345", allowedVehicles, parkedVehicles);
     carPark.registerParkedVehicle("DWR45342", allowedVehicles, parkedVehicles);
     carPark.removeParkedVehicle("DW12345", parkedVehicles);

     System.out.println("Wszystkie samochody mające pozwolenie na parkowanie na parkingu: ");
     for(Vehicle vehicle : allowedVehicles) {
         System.out.println(vehicle.registrationNumber());
     }

     System.out.println("Wszystkie obecnie zaparkowane pojazdy: ");
     for(Vehicle vehicle : parkedVehicles) {
         System.out.println(vehicle.registrationNumber());
     }
     }
}
