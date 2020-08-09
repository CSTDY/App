package devices;

import creatures.*;

public class Phone extends Devices{

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPhone() == null) {
            System.out.println("Seller don't have this phone");
        } else {
            if ( price < buyer.cash) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.setPhone(seller.getPhone());
                seller.removePhone();
                System.out.println("Phone is sold for " + price + "$");
            } else {
                System.out.println("Buyer don't have enough money");
            }
        }
    }
}
