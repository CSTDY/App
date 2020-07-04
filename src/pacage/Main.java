package pacage;

import creatures.Human;
import creatures.Pet;
import devices.Diesel;
import devices.LPG;
import devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code hereZ
        Human me = new Human("creatures.Human", 4);
        me.firstName = "Kamil";
        me.lastName = "Socha";
        me.cash = 10000.0;
        Human you = new Human("creatures.Human");
        you.firstName = "Krystian";
        you.lastName = "Krostek";
        you.cash = 10000.0;
        int index = 0;

        Pet dog = new Pet("dog");
        me.pet = dog;
        me.pet.feed();
        for(int i=0;i<14;i++){
            me.pet.takeForAWalk();}

        me.salary();
        me.setSalary(4000.0);

        LPG Ibiza = new LPG("ibiza", "seat");
        Diesel Renault = new Diesel("megane", "renault");
        Phone Sony_Erickson = new Phone("K310i", "Sony-Erickson");
        me.getVehicle(index);
        me.setVehicle(Ibiza, index);
        index ++;
        me.setVehicle(Renault, index);
        if(Ibiza.equals(Renault)) System.out.println("Cena samochodów jest taka sama");
        else System.out.println("Ceny samochodów są różne");
        System.out.println(me);
        System.out.println(Sony_Erickson);
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

        /*Ibiza.numOfCarOwners("Kamil Socha");
        Renault.checkTransactions("Kamil Socha", "Krystian Krostek");
*/
        Application facebook = new Application("facebook", "latest", 0.0);
        Application spotify = new Application("spotify", "2.3.41", 14.0);
        Application messenger = new Application("messenger", "latest", 0.0);

        me.phone.installAnApp(facebook, me);
        me.phone.installAnApp(spotify, me);
        System.out.println(me.phone.applications);

        System.out.println(me.phone.isInstalled(facebook));
        System.out.println(me.phone.isInstalled(messenger));
        System.out.println(me.phone.isInstalled("facebook"));
        System.out.println(me.phone.isInstalled("messenger"));
    }

}
