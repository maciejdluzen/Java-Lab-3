package Exercise2;

public class Bus extends Vehicle {

    public Bus(String make, String model, String regNumber) {
        super(make, model, regNumber);
    }

    @Override
    public String registrationNumber() {
        return "Bus reg";
    }
}
