package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CarPark {

    public static final int CAR_PARK_CAPACITY = 30;

    private List<Vehicle> allowedVehicles = new ArrayList<>(CAR_PARK_CAPACITY); // Lista przechowująca samochody uprawnione do parkowania na parkingu.

    private List<String> parkedVehicles = new ArrayList<>(); // Lista przechowująca numery rejestracyjne zaparkowanych samochodów


    public void addAllowedVehicle(Vehicle vehicle, List<Vehicle> allowedVehicles) {
        allowedVehicles.add(vehicle);
    }

    public List<Vehicle> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<Vehicle> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }
}
