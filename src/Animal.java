import java.io.File;

public class Animal implements Sellable {
    final String species;
    Double weight;
    String name;
    File pic;
    Double price;
    static final Double DEFAULT_DOG_WEIGHT = 12.0;
    static final Double DEFAULT_CAT_WEIGHT = 2.0;
    static final Double DEFAULT_HORSE_WEIGHT = 1000.0;
    static final Double DEFAULT_WEIGHT = 10.0;

    public Animal(String species) {
        this.species = species;
        if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
            this.price = 30.0;
        } else if (species == "cat") {
            this.weight = DEFAULT_CAT_WEIGHT;
            this.price = 40.0;
        } else if (species == "horse") {
            this.weight = DEFAULT_HORSE_WEIGHT;
            this.price = 400.0;
        } else {
            this.weight = DEFAULT_WEIGHT;
            this.price = 10.0;
        }
    }


    public void feed() {
        if (this.weight == 0.0) {
            System.out.println("am dead bro");
        } else {
            this.weight++;
            System.out.println("thx for food bro my weight is: " + this.weight);
        }
    }

    public void takeForAWalk() {
        if (this.weight == 0.0) {
            System.out.println("am dead bro");
        } else {
            this.weight--;
            System.out.println("thx for walk bro my weight is: " + this.weight);
        }
    }

    public String toString() {
        return species + " " + weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("You can't trade humans!");
        } else {
            if (seller.pet == this) {
                if (buyer.cash != null && buyer.cash >= price) {
                    buyer.cash = buyer.cash - price;
                    seller.cash = seller.cash + price;
                    buyer.pet = seller.pet;
                    seller.pet = null;
                    System.out.println("You bought " + this);
                } else System.out.println("You can't buy that");
            } else System.out.println("Merchant doesn't have that item!");
        }
    }
}
