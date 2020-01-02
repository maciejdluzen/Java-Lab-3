package Exercise2;

import java.util.List;

public class CarParkTest {

    public static void main(String[] args) {

     CarPark carPark = new CarPark();

     List<Vehicle> allowedVehicles = carPark.getAllowedVehicles();

     Vehicle vehicle1 = new Car("Toyota","C-HR", "DW12345");

     carPark.addAllowedVehicle(vehicle1, allowedVehicles);




     for(Vehicle vehicle : allowedVehicles) {
         System.out.println(vehicle.getRegNumber());
     }
    }
}
