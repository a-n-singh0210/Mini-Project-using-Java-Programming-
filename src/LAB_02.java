// Base Class
class Employee {
    protected String name;
    protected double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived Class 1
class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public void calculateSalary() {
        salary += salary * 0.50;
    }
}

// Derived Class 2
class InternEmployee extends Employee {

    InternEmployee(String name, double salary) {
        super(name, salary);
    }

    public void calculateSalary() {
        salary += salary * 0.25;
    }
}

// Only ONE public class
public class LAB_02 {
    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee("Aarushi", 40000);
        System.out.println("Before Hike (FullTime):");
        f1.displaySalary();
        f1.calculateSalary();
        System.out.println("After 50% Hike:");
        f1.displaySalary();

        System.out.println("------------------");

        InternEmployee i1 = new InternEmployee("Rahul", 20000);
        System.out.println("Before Hike (Intern):");
        i1.displaySalary();
        i1.calculateSalary();
        System.out.println("After 25% Hike:");
        i1.displaySalary();
    }
}
