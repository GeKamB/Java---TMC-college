import java.time.*; 
import java.time.temporal.*; 
 
 class Employee {
    private String name;
    private int employeeId;
    private double salary;
    private LocalDate hireDate;
 
    // Constructor
    public Employee(String name, int employeeId, double salary, LocalDate hireDate) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.hireDate = hireDate;
    }
 
    // Getters and setters
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getEmployeeId() {
        return employeeId;
    }
 
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
 
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public LocalDate getHireDate() {
        return hireDate;
    }
 
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
 
    // Function to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
 
    // Function to give a raise to the employee
    public void giveRaise(double percentage) {
        salary *= (1 + percentage / 100);
    }
 
    // Function to print employee information
    public void printEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
        System.out.println("Hire Date: " + hireDate);
    }
}
 
public class Main{
    // Main method for testing
    public static void main(String[] args) {
        // Creating an employee object
        Employee employee1 = new Employee("John Doe", 1001, 50000, LocalDate.of(2020,5,5));
 
        // Printing employee information
        employee1.printEmployeeInfo();
 
        // Calculating and printing annual salary
        System.out.println("Annual Salary: $" + employee1.calculateAnnualSalary());
 
        // Giving a raise of 10%
        employee1.giveRaise(10);
 
        // Printing updated salary
        System.out.println("Updated Salary after Raise: $" + employee1.getSalary());
 
    }
}