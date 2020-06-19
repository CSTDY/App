public abstract class Device {
    public final String model;
    public final String producer;
    public int yearOfProduction;
    public double value;

    public Device(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String toString() {
        return producer + " " + model + " " + value + " " + yearOfProduction;
    }

    abstract public void turnOn();
}