package creatures;

import interfaces.salleable;

public abstract class Animal implements salleable, Feedable {
    final String species;
    private Double weight;
    public String name;
    static final Double DEFAULT_DOG_WEIGHT = 12.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.0;
    static final Double DEFAULT_HORSE_WEIGHT = 1000.0;
    static final Double DEFAULT_WEIGHT = 10.0;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "cat") {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else if (species == "horse") {
            this.weight = DEFAULT_HORSE_WEIGHT;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
    }


    public void feed() {
        if (this.weight == 0.0) {
            System.out.println("I'm dead bro");
        } else {
            this.weight++;
            System.out.println("Thanks for food bro my weight is: " + this.weight);
        }
    }

    public void takeForAWalk() {
        if (this.weight == 0.0) {
            System.out.println("I'm dead bro");
        } else {
            this.weight--;
            System.out.println("Thanks for walk bro my weight is: " + this.weight);
        }
    }


    @Override

    public String toString() {
        return "Spiece: " + species + ", Name: " + name + ", Weight: " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet.species.equals("dog")) {
            if ( price < buyer.cash) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("Dog is sold for " + price + "$");
            } else {
                System.out.println("Buyer don't have enough money");
            }
        } else if (seller.pet.species.equals("cat")) {
            if ( price < buyer.cash) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("Cat is sold for " + price + "$");
            } else {
                System.out.println("Buyer don't have enough money");
            }
        } else if (seller.pet.species.equals("horse")) {
            if ( price < buyer.cash) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.pet = seller.pet;
                seller.pet = null;
                System.out.println("Horse is sold for " + price + "$");
            } else {
                System.out.println("Buyer don't have enough money");
            }
        } else if (seller.pet.species.equals("human")) {
            System.out.println("You can't sell a man");
        } else {
            System.out.println("This pet is not for sale! Or seller dont have this pet");
        }
    }
}
