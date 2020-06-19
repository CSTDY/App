import java.io.File;

public class Phone extends Device {
    String os;

    public Phone(String model, String producer) {
        super(model, producer);
        if (this.model == "K310i" && this.producer == "Sony-Ericson") {
            this.value = 50.0;
        } else this.value = 10.0;
    }

    @Override
    public void turnOn() {
        System.out.println("ON");
    }
}
