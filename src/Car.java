import java.io.File;

public class Car {
    final String model;
    final String producer;
    Double weight;
    String plate;
    File pic;

    public Car(String model, String producer) {
        this.model = model;
        this.producer=producer;
    }
}
