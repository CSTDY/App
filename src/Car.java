import java.io.File;
import java.util.Objects;

public class Car extends Device implements  Sellable{
    Double weight;
    String plate;
    File pic;

    public Car(String model, String producer) {
        super(model, producer);
        if (this.model == "megane" && this.producer == "renault") {
            this.value = 3000.0;
        }
        if (this.model == "Ibiza" && this.producer == "Seat") {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.auto == this) {
            if (buyer.cash != null && buyer.cash >= price) {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.auto = seller.auto;
                seller.auto = null;
                System.out.println("Kupiłeś " + this);
            } else System.out.println("Nie możesz tego kupić");
        } else System.out.println("Sprzedawca  nie ma tego towaru na sprzedaż!");
    }
}
