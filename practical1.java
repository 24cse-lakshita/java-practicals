
class Student {

    // Instance variables
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    // Constructor
    Student(int r, String n, int m1, int m2, int m3) {
        rollNo = r;
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Method to calculate total marks
    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("--------------------------");
    }

}

// Main class
public class practical1 {
    public static void main(String[] args) {

        // Creating three student objects
        Student s1 = new Student(101, "Rahul", 85, 78, 90);
        Student s2 = new Student(102, "Priya", 88, 92, 80);
        Student s3 = new Student(103, "Aman", 75, 82, 86);

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
