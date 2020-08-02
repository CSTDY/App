import devices.Car;

import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car auto;
    private Double Salary;

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
            System.out.println("ZUS and US have recived informations about your salary.");
            this.Salary=x;
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
        } else if (vehicle.value / 12.0 < this.Salary) {
            System.out.println("You bought car on credit.");
            this.auto = vehicle;
        } else System.out.println("Sign up to university or go for a pay raise.");
    }

    @Override

    public String toString() {
        return firstName + " " + lastName;
    }
}
