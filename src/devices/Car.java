package devices;

import animals.Human;

public class Car extends Devices {
    Double weight;
    String plate;
    public Double value;

    public Car(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        if (this.model == "megane" && this.producer == "renault" && this.yearOfProduction == 2005) {
            this.value = 1000.0;
        } else this.value = 100.0;
    }

    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        return this.model.equals(otherCar.model) &&
                this.producer.equals(otherCar.producer);
    }


    @Override
    public void turnOn() {
        System.out.println("You turn on your car");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getVehicle() == null) {
            System.out.println("Seller don't have this car");
        } else {
            if (price < buyer.cash) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.setVehicle(seller.getVehicle());
                seller.removeVehicle();
                System.out.println("Car is sold for " + price + "$");
            } else {
                System.out.println("Buyer don't have enough money");
            }
        }
    }
}
