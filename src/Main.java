import animals.*;
import devices.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human me = new Human();
        me.firstName = "Kamil";
        me.lastName = "Socha";
        System.out.println(me);

        Human you = new Human();
        you.firstName = "Zenek";
        you.lastName = "Wrzos";
        System.out.println(you);

        you.setSalary(2000.0);

        Animal dog = new Animal("dog");
        me.pet = dog;
        me.pet.name = "Azor";
        System.out.println(dog);
        me.pet.feed();
        //for(int i=0;i<14;i++){
            me.pet.takeForAWalk();

        me.salary();
        me.setSalary(101.0);

        Car Ibiza = new Car("ibiza", "seat", 2009);
        Car Renault = new Car("megane", "renault", 2005);
        me.setVehicle(Ibiza);
        me.setVehicle(Renault);
        me.getVehicle();

        System.out.println(new Car("ibiza", "seat", 2019).equals(Ibiza));
        System.out.println(Ibiza);
        System.out.println(Renault);

        Phone Huawei = new Phone("P20 Lite", "Huawei", 2018);
        Phone Nokia = new Phone("3310", "Nokia", 1410);
        me.getPhone();
        me.setPhone(Nokia);
        System.out.println(me.cash);
        Ibiza.turnOn();

        dog.sell(me, you, 1000.00);
        you.pet.takeForAWalk();
    }

}
