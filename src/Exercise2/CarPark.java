package Exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CarPark {

    public static final int CAR_PARK_CAPACITY = 30;

    private List<Vehicle> allowedVehicles = new ArrayList<>(CAR_PARK_CAPACITY); // Lista przechowująca samochody uprawnione do parkowania na parkingu.

    private List<Vehicle> parkedVehicles = new ArrayList<>(); // Lista przechowująca numery rejestracyjne zaparkowanych samochodów

    public void addAllowedVehicle(Vehicle vehicle, List<Vehicle> allowedVehicles) {
        allowedVehicles.add(vehicle);
    }

    public void registerParkedVehicle(String regNumber, List<Vehicle> allowedVehicles, List<Vehicle> parkedVehicles) {
        for(Vehicle vehicle : allowedVehicles) {
            if(vehicle.getRegNumber().equals(regNumber)) {
                parkedVehicles.add(vehicle);
            }
        }
    }

    public void removeParkedVehicle(String regNumber, List<Vehicle> parkedVehicles) {
        parkedVehicles.removeIf(next -> next.getRegNumber().equals(regNumber));
    }

    public List<Vehicle> getAllowedVehicles() {
        return allowedVehicles;
    }

    public List<Vehicle> getParkedVehicles() {
        return parkedVehicles;
    }
}
