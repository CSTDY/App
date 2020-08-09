package devices;

public class LPG extends Car {
    public LPG(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("You refuel your car");
    }
}
