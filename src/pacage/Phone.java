package pacage;

import creatures.Human;
import creatures.Sellable;

public class Phone extends Device implements Sellable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this) {
            if (buyer.cash != null && buyer.cash >= price) {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.phone = seller.phone;
                seller.phone = null;
                System.out.println("Kupiłeś " + this);
            } else System.out.println("Nie możesz tego kupić");
        } else System.out.println("Sprzedawca  nie ma tego towaru na sprzedaż!");
    }
}
