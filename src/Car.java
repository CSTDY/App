import java.io.File;

public class Car {
    final String model;
    final String producer;
    Double weight;
    String plate;
    File pic;
    Double value;

    public Car(String model, String producer) {
        this.model = model;
        this.producer=producer;
        if (this.model == "megane" && this.producer == "renault") {
            this.value = 3000.0;
        } else this.value = 10.0;
    }
}
