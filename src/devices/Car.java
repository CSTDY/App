package devices;

public class Car {
    final String model;
    final String producer;
    Double weight;
    String plate;
    public Double value;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
        if (this.model == "megane" && this.producer == "renault") {
            this.value = 3000.0;
        } else this.value = 10.0;
    }

    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        return this.model.equals(otherCar.model) &&
                this.producer.equals(otherCar.producer);
    }

    @Override

    public String toString() {
        return producer + " " + model;
    }
}
