package Exercise2;

import java.util.List;

public class Car extends Vehicle {

    public Car(String make, String model, String regNumber) {
        super(make, model, regNumber);
    }

    @Override
    public String registrationNumber() {
        return "Numer rejestracyjny samochodu:" + getRegNumber();
    }
}
