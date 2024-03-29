import java.time.LocalDate;
class NewEmployee {
    String name;
    String id;
    float salary;
    LocalDate hireDate;
    
    

    public NewEmployee(String name, String id, float salary, LocalDate hireDate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hireDate = hireDate;
        
    }
    public void displayInfo(){
        System.out.println("NAME: " + name);
        System.out.println("ID: " + id);
        System.out.println("SALARY: " + salary);
        System.out.println("HIRE DATE: " + hireDate);
    }



}

public class Employee {
    public static void main(String[] Args) {
        NewEmployee employee1 = new NewEmployee("Jan Kowalski", "a0001", 2000, LocalDate.of(2020, 12, 12));
        employee1.displayInfo();

    }

}
