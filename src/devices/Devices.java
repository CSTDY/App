package devices;
import animals.*;
import interfaces.*;

public abstract class Devices implements salleable{
    public String model;
    public String producer;
    public Integer yearOfProduction;

    public abstract void turnOn();

    @Override

    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
