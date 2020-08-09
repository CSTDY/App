package devices;

import creatures.*;

import java.net.URL;

public class Phone extends Devices{

    static final String DEFAULT_SERVER_ADDRESS = "https://moodle2.e-wsb.pl/mod/assign/view.php?id=3007641";
    static final String DEFAULT_VERSION = "v.1.8";
    static final String DEFAULT_APP_NAME = "PassApp";
    public Double value;
    public Phone(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        if (this.model == "3310" && this.producer == "Nokia") {
            this.value = 300.0;
        } else this.value = 100.0;
    }

    public void installAnnApp(String appName) {
        if (appName.equals("")) {
            appName = DEFAULT_APP_NAME;
            System.out.println(appName + " in version: " + DEFAULT_VERSION + " is installed from " + DEFAULT_SERVER_ADDRESS);
        } else {
            System.out.println(appName + " in version: " + DEFAULT_VERSION + " is installed from " + DEFAULT_SERVER_ADDRESS);
        }
    }
    public void installAnnApp(String appName, String version) {
        if (appName.equals("")) {
            appName = DEFAULT_APP_NAME;
            if (version.equals("")) {
                version = DEFAULT_VERSION;
                System.out.println(appName + "in version: " + version + " is installed from " + DEFAULT_SERVER_ADDRESS);
            } else {
                System.out.println(appName + "in version: " + version + " is installed from " + DEFAULT_SERVER_ADDRESS);
            }
        } else {
            if (version.equals("")) {
                version = DEFAULT_VERSION;
                System.out.println(appName + "in version: " + version + " is installed from " + DEFAULT_SERVER_ADDRESS);
            } else {
                System.out.println(appName + "in version: " + version + " is installed from " + DEFAULT_SERVER_ADDRESS);
            }
        }
    }
    public void installAnnApp(String appName, String version, String serverAddress) {
        if (appName.equals("")) {
            appName = DEFAULT_APP_NAME;
            if (version.equals("")) {
                version = DEFAULT_VERSION;
                if (serverAddress.equals("")) {
                    serverAddress = DEFAULT_SERVER_ADDRESS;
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                } else {
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                }
            } else {
                if (serverAddress.equals("")) {
                    serverAddress = DEFAULT_SERVER_ADDRESS;
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                } else {
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                }
            }
        } else {
            if (version.equals("")) {
                version = DEFAULT_VERSION;
                if (serverAddress.equals("")) {
                    serverAddress = DEFAULT_SERVER_ADDRESS;
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                } else {
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                }
            } else {
                if (serverAddress.equals("")) {
                    serverAddress = DEFAULT_SERVER_ADDRESS;
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                } else {
                    System.out.println(appName + "in version: " + version + " is installed from " + serverAddress);
                }
            }
        }
    }
    public void installAnnApp(String[] appListToInstall) {
        for (int i = 0; i < appListToInstall.length; i++) {
            if (appListToInstall[i].equals("")) {
                System.out.println(DEFAULT_APP_NAME + " in version: " + DEFAULT_VERSION + " is installed from " + DEFAULT_SERVER_ADDRESS);
            } else {
                System.out.println(appListToInstall[i] + " in version: " + DEFAULT_VERSION + " is installed from " + DEFAULT_SERVER_ADDRESS);
            }
        }
    }
    public void installAnnApp(URL appURL) {
        if (appURL.equals("")) {
            System.out.println(DEFAULT_APP_NAME + " in version: " + DEFAULT_VERSION + " is installed from " + DEFAULT_SERVER_ADDRESS);
        } else {
            System.out.println("App from: " + appURL + " is installed");
        }
    }
    @Override
    public void turnOn() {
        System.out.println("You turn on your phone");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getPhone() == null) {
            System.out.println("Seller don't have this phone");
        } else {
            if ( price < buyer.cash) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.setPhone(seller.getPhone());
                seller.removePhone();
                System.out.println("Phone is sold for " + price + "$");
            } else {
                System.out.println("Buyer don't have enough money");
            }
        }
    }
}
