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

        Car Renault = new Car("megane", "renault", 2005);
        me.getVehicle();
        me.setVehicle(Renault);
        me.getVehicle();
        System.out.println(new Car("megane", "renault", 2005).equals(Renault));
        System.out.println(Renault);

        Phone Nokia = new Phone("3310", "Nokia", 1410);
        me.getPhone();
        me.setPhone(Nokia);
        System.out.println(me.cash);
        Renault.turnOn();
        System.out.println("My cash before trade: " + me.cash);
        System.out.println("Your cash before trade: " + you.cash);
        dog.sell(me, you, 1000.00);
        System.out.println("My cash after trade: " + me.cash);
        System.out.println("Your cash after trade: " + you.cash);
        you.pet.takeForAWalk();
        you.pet.takeForAWalk();
        me.getPhone().sell(me, you, 900.0);
        you.getPhone().turnOn();
        me.getVehicle().sell(me, you, 90.0);
        you.getVehicle().turnOn();

    }

}
