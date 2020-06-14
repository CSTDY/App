import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car auto;
    private Double Salary;

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

    public Car getVehicle() {
        return this.auto;
    }

    public void setVehicle(Car vehicle) {
        if (vehicle.value < this.Salary) {
            System.out.println("Właśnie kupiłeś samochód za gotówkę!");
            this.auto = vehicle;
        } else if (vehicle.value / 12.0 < this.Salary) {
            System.out.println("Gratuluję, kupiłeś samochód, niestety na kredyt");
            this.auto = vehicle;
        } else System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
    }

    public String toString() {
        return firstName + " " + lastName + " " + pet + " " + auto + " Wynagrodzenie: " + Salary;
    }
}
