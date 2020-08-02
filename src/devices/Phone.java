package devices;

public class Phone extends Devices{

    public Phone(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public void turnOn() {
        System.out.println("You turn on your phone");
    }
}
