package devices;

public abstract class Devices {
    public String model;
    public String producer;
    public Integer yearOfProduction;

    public abstract void turnOn();

    @Override

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }
}
