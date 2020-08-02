import devices.Car;

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

        Car Ibiza = new Car("ibiza", "seat");
        Car Renault = new Car("megane", "renault");
        me.getVehicle();
        me.setVehicle(Ibiza);
        me.setVehicle(Renault);

        System.out.println(new Car("ibiza", "seat").equals(Ibiza));
        System.out.println(Ibiza);
        System.out.println(Renault);
    }

}
