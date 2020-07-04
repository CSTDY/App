package devices;

import creatures.Human;
import creatures.Sellable;
import pacage.Application;

import java.net.URL;
import java.util.*;

public class Phone extends Device implements Sellable {
    String os;
    static final int serverAddress = 0;
    static final String protocol = "protocol";
    static final String version = "1.4";
    public List<Application> applications;

    public Phone(String model, String producer) {
        super(model, producer);
        if (this.model == "K310i" && this.producer == "Sony-Ericson") {
            this.value = 50.0;
        } else this.value = 10.0;
        applications = new LinkedList<>();
    }

    public void installAnApp(Application app, Human owner) throws Exception {
        if (app.getPrice() > 0) {
            if (owner.cash < app.getPrice()) {
                throw new Exception("not enough money");
            }
            owner.cash -= app.getPrice();
        }
        applications.add(app);
        System.out.println("Application " + app.getName() + " installed");
    }

    public void installAnApp(String name) {
        installAnApp(name, 0.0);
    }


    public void installAnApp(String AppName, double Version) {
        System.out.println("The app " + AppName + " was installed in version " + Version);
    }

    public void installAnApp(String AppName, String Version, int ServerAddress) {

    }

    public boolean isInstalled(Application app) {
        return applications.contains(app);
    }
    public boolean isInstalled(String appName) {
        for (Application application : applications) {
            if (application.getName().equals(appName)) {
                return true;
            }
        }
        return false;
    }


    public void installAnApp(String[] apps) {
        for (String app : apps) {
            installAnApp(app);
        }
    }
    public void installAnApp(URL url) {

    }


    @Override
    public void turnOn() {
        System.out.println("ON");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this) {
            if (buyer.cash != null && buyer.cash >= price) {
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                buyer.phone = seller.phone;
                seller.phone = null;
                System.out.println("Kupiłeś " + this);
            } else System.out.println("Nie możesz tego kupić");
        } else System.out.println("Sprzedawca  nie ma tego towaru na sprzedaż!");
    }
}
