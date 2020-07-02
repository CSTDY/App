package pacage;

import creatures.Human;
import creatures.Sellable;

public abstract class Device implements Sellable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}