import java.io.File;

public class Animal {
    final String species;
    Double weight;
    String name;
    File pic;
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
}}
