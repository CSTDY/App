package pacage;

import creatures.Human;
import creatures.Sellable;

import java.io.File;
import java.util.Objects;
import java.util.ArrayList;

public abstract class Car extends Device implements Sellable {
    Double weight;
    String plate;
    File pic;
    ArrayList<Human> CarOwners = new ArrayList<Human>();

    Human lastCarOwner = CarOwners.get(CarOwners.size() - 1);
    public Car(String model, String producer, Integer yearOfProduction) {
        super(model, producer);
        this.yearOfProduction = yearOfProduction;
        if (this.model == "megane" && this.producer == "renault") {
            this.value = 3000.0;
        }
        if (this.model == "Ibiza" && this.producer == "Seat") {
            this.value = 3000.0;
        } else this.value = 10.0;
    }

    public Car(String model, String producer) {
        super(model, producer);
    }

    public boolean equals(Car other) {
        return Objects.equals(value, other.value);
    }

    public String toString() {
        return producer + " " + model + " " + value;
    }

    public abstract void refuel();

    public void numOfCarOwners(String name) {
        if (CarOwners.contains(name)) {
            System.out.println("Ta osoba była właścicielem samochdu");
        } else {
            System.out.println("Tej osobie nie ma na liście właścicieli");
        }
    }

    public void checkTransactions(String seller, String buyer) {
        if (CarOwners.contains(seller) && CarOwners.contains(buyer)) {
            if (CarOwners.indexOf(seller) == CarOwners.indexOf(buyer) + 1) {
                System.out.println("Transakcja między " + seller + " a " + buyer + " miała miejśce");
            } else {
                System.out.println("Nie było takiej transakcji!");
            }
        }
    }

    public void numOfCarTransactions() {

    }

    @Override
    public void turnOn() {
        System.out.println("ON");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!lastCarOwner.equals(seller)) {
            throw new Exception("Sprzedajacy nie jest ostatnim właścicielem samochodu! To sprawa dla reportera");
        }
        if (!seller.hasACar(this)) {
            throw new Exception("Sprzedający nie ma samochodu");
        }
        if (!buyer.hasAFreePlace()) {
            throw new Exception("Kupujący nie ma miejca w garażu");
        }
        if (buyer.cash < price) {
            throw new Exception("Nie masz tyle pieniędzy");
        }
        buyer.removeCar(this);
        seller.addCar(this);
        buyer.cash -= price;
        seller.cash += price;
        this.CarOwners.add(buyer);
        System.out.println("Transakcja zakończona");

    }
}
