import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human me = new Human();
        me.firstName = "Kamil";
        me.lastName = "Socha";
        System.out.println(me);

        Animal dog = new Animal("dog");
        me.pet = dog;
        me.pet.name = "Azor";
        System.out.println(dog);
        me.pet.feed();
        for(int i=0;i<14;i++){
            me.pet.takeForAWalk();}

        me.salary();
        me.setSalary(101.0);

        Car Ibiza = new Car("ibiza", "seat", 2009);
        Car Renault = new Car("megane", "renault", 2005);
        me.getVehicle();
        me.setVehicle(Ibiza);
        me.setVehicle(Renault);

        System.out.println(new Car("ibiza", "seat", 2019).equals(Ibiza));
        System.out.println(Ibiza);
        System.out.println(Renault);

        Phone Huawei = new Phone("P20 Lite", "Huawei", 2018);
        Huawei.turnOn();

        Ibiza.turnOn();
    }

}
