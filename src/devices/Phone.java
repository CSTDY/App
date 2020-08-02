package devices;
import interfaces.*;

public class Phone extends Devices implements salleable{

    public Double value;
    public Phone(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        if (this.model == "3310" && this.producer == "Nokia") {
            this.value = 300.0;
        } else this.value = 100.0;
    }
    @Override
    public void turnOn() {
        System.out.println("You turn on your phone");
    }
}
