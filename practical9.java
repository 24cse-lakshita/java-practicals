
class Employee {

    // Instance variables
    String name;
    double salary;

    // Static variable to count employees
    static int count = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        count++;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class practical9 {
    public static void main(String[] args) {

        // Creating objects
        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 25000);

        Employee e3 = new Employee("Priya", 30000);

        // Displaying employee details
        e1.display();
        e2.display();
        e3.display();

        // Displaying total employee count
        Employee.displayCount();
    }
}
