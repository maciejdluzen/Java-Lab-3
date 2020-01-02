package Exercise2;

public abstract class Vehicle implements Identification {

    private String make;
    private String model;
    private String regNumber;

    public Vehicle(String make, String model, String regNumber) {
        this.make = make;
        this.model = model;
        this.regNumber = regNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}
