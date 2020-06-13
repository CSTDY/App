import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Car auto;
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
}
