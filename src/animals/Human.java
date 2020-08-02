package animals;

import devices.*;

import java.time.LocalDateTime;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    private Car auto;
    private Phone phone;
    private Double Salary;
    public Double cash;

    public void salary(){
        System.out.println("Your data about your salary was taken: " + LocalDateTime.now());
        System.out.println("Your salary: " + this.Salary);
    }
    public void setSalary(double x){
        if (x<=0){
            System.out.println("You can't steal your emploees");
        }
        else {
            System.out.println("Your data has been sent to accounting system.");
            System.out.println("Your annex is waiting at Mrs. Hania from the HR department.");
            System.out.println("ZUS and US have received informations about your salary.");
            this.Salary=x;
            this.cash = this.Salary;
            System.out.println("Your salary: " + this.Salary);
        }
    }

    public Car getVehicle() {
        return this.auto;
    }

    public void setVehicle(Car vehicle) {
        if (vehicle.value < this.Salary) {
            System.out.println("You bought a car for cash.");
            this.auto = vehicle;
            this.cash -= vehicle.value;
        } else if (vehicle.value / 12.0 < this.Salary) {
            System.out.println("You bought car on credit.");
            this.auto = vehicle;
        } else System.out.println("Sign up to university or go for a pay raise.");
    }

    public Phone getPhone() { return this.phone; }

    public void setPhone(Phone phone) {
        if (phone.value < this.Salary) {
            System.out.println("You bought a phone for cash.");
            this.phone = phone;
            this.cash -= phone.value;
        } else if (phone.value / 12.0 < this.Salary) {
            System.out.println("You bought phone on credit.");
            this.phone = phone;
        } else System.out.println("Sign up to university or go for a pay raise.");
    }

    @Override

    public String toString() {
        return firstName + " " + lastName;
    }
}
