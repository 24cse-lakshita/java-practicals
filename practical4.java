
class Calculator {

    // Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adding two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class practical4 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of two numbers: " + c.add(10, 20));

        System.out.println("Addition of three numbers: " + c.add(10, 20, 30));

        System.out.println("Addition of decimal numbers: " + c.add(5.5, 4.5));
    }
}
