package Exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CarPark {

    public static final int CAR_PARK_CAPACITY = 30;

    private List<Vehicle> allowedVehicles = new ArrayList<>(); // Lista przechowująca samochody uprawnione do parkowania na parkingu.

    private List<Vehicle> parkedVehicles = new ArrayList<>(CAR_PARK_CAPACITY); // Lista przechowująca numery rejestracyjne zaparkowanych samochodów

    // Metoda dodająca pojazdy mające pozwolenie na wjazd na teren parkingu:
    public void addAllowedVehicle(Vehicle vehicle, List<Vehicle> allowedVehicles) {
        allowedVehicles.add(vehicle);
    }

    // Rejestracja pojazdu wjeżdżającego na teren parkingu:
    public void registerParkedVehicle(String regNumber, List<Vehicle> allowedVehicles, List<Vehicle> parkedVehicles) {
        for(Vehicle vehicle : allowedVehicles) {
            if(vehicle.getRegNumber().equals(regNumber) && allowedVehicles.size() < CAR_PARK_CAPACITY) {
                parkedVehicles.add(vehicle);
            }
        }
    }

    // Usunięcie pojazdu wyjeżdżającego z terenu parkingu:
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
