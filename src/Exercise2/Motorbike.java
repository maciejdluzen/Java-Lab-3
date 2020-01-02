package Exercise2;

public class Motorbike extends Vehicle {

    public Motorbike(String make, String model, String regNumber) {
        super(make, model, regNumber);
    }

    @Override
    public String registrationNumber() {
        return "Numer rejestracyjny motocykla: " + getRegNumber();
    }
}
