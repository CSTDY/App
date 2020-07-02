package creatures;

import pacage.Car;
import pacage.Phone;

import java.time.LocalDateTime;

public class Human extends Animal implements Sellable {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Car[] garage;
    private Double Salary;
    public Double cash;
    public Phone phone;

    public Human(String species) {
        super(species);
        this.garage = new Car[2];
    }

    public Human(String species, Integer garageSize) {
        super(species);
        this.garage = new Car[garageSize];
    }


    public void salary(){
        System.out.println("Dane o wypłacie zostały pobrane: " + LocalDateTime.now());
        System.out.println("Twoja wypłata: " + this.Salary);
    }
    public void setSalary(double x){
        if (x<=0){
            System.out.println("Okradanie swoich pracowników jest nieetyczne");
        }
        else {
            System.out.println("Dane zostały wysłane do systemu księgowego");
            System.out.println("Twój aneks czeka na odbiór u Pani Hani z kadr");
            System.out.println("ZUS i US otrzymały informację o twoim wynagrodzeniu!");
            this.Salary=x;
            System.out.println("Twoja wypłata wynosi: " + this.Salary);
        }
    }

    public Car getVehicle(Integer index) {
        return this.garage[index];
    }

    public void setVehicle(Car vehicle, Integer index) {
        if (vehicle.value < this.Salary) {
            System.out.println("Właśnie kupiłeś samochód za gotówkę!");
            this.garage[index] = vehicle;
        } else if (vehicle.value / 12.0 < this.Salary) {
            System.out.println("Gratuluję, kupiłeś samochód, niestety na kredyt");
            this.garage[index] = vehicle;
        } else System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
    }

    public String toString(Integer index) {
        return firstName + " " + lastName + " " + pet + " " + garage[index] + " Wynagrodzenie: " + Salary;
    }

    public Double CarsValue() {
        Double value = 0.0;
        for (Car car : garage) {
            if (car != null) {
                value += car.value;
            }
        }
        return value;
    }

    public boolean hasACar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAFreePlace() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                break;
            }
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    @Override
    public void feed(Integer foodWeight) {

    }
}
