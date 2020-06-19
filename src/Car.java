import java.io.File;
import java.util.Objects;

public class Car extends Device{
    Double weight;
    String plate;
    File pic;

    public Car(String model, String producer) {
        super(model, producer);
        if (this.model == "megane" && this.producer == "renault") {
            this.value = 3000.0;
        } else this.value = 10.0;
    }

    public boolean equals(Car other) {
        return Objects.equals(value, other.value);
    }

    public String toString() {
        return producer + " " + model + " " + value;
    }

    @Override
    public void turnOn() {
        System.out.println("ON");
    }
}
