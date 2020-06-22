package pacage;

import creatures.Animal;
import creatures.Human;
import creatures.Pet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human me = new Human("creatures.Human");
        me.firstName = "Kamil";
        me.lastName = "Socha";
        me.cash = 10000.0;
        Human you = new Human("creatures.Human");
        you.firstName = "Krystian";
        you.lastName = "Krostek";
        you.cash = 10000.0;

        Pet dog = new Pet("dog");
        me.pet = dog;
        me.pet.feed();
        for(int i=0;i<14;i++){
            me.pet.takeForAWalk();}

        me.salary();
        me.setSalary(4000.0);

        Car Ibiza = new Car("ibiza", "seat");
        Car Renault = new Car("megane", "renault");
        Phone Sony_Ericson = new Phone("K310i", "Sony-Ericson");
        me.getVehicle();
        me.setVehicle(Ibiza);
        me.setVehicle(Renault);
        if(Ibiza.equals(Renault)) System.out.println("Cena samochodów jest taka sama");
        else System.out.println("Ceny samochodów są różne");
        System.out.println(me);
        System.out.println(Sony_Ericson);
        System.out.println(dog);
        System.out.println(Ibiza);
        System.out.println(Renault);

        try {
            Ibiza.sell(me, you, 2000.0);
        }
        catch(Exception e){
            System.out.println("Coś poszło nie tak");
        }
        try {
            Renault.sell(me, you, 4000.0);
        }
        catch(Exception e){
            System.out.println("Coś poszło nie tak");
        }
    }

}
