public class Main {

    public static void main(String[] args) {
	// write your code here
        Human me = new Human();
        me.firstName = "Kamil";
        me.lastName = "Socha";

        Animal dog = new Animal("dog");
        me.pet = dog;
        me.pet.feed();
        for(int i=0;i<14;i++){
            me.pet.takeForAWalk();}

        me.salary();
        me.setSalary(11.0);

        Car Ibiza = new Car("ibiza", "seat");
        Car Renault = new Car("megane", "renault");
        me.getVehicle();
        me.setVehicle(Ibiza);
        me.setVehicle(Renault);
    }

}
