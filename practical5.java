
class ComplexNumber {

    // Instance variables
    int real;
    int imaginary;

    // Constructor
    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber c) {

        int r = real + c.real;
        int i = imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class practical5 {
    public static void main(String[] args) {

        // Creating two complex number objects
        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(4, 2);

        // Adding both complex numbers
        ComplexNumber result = c1.add(c2);

        // Displaying the numbers
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum of Complex Numbers: ");
        result.display();
    }
}
