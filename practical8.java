
class Product {

    // Instance variables
    String productName;
    double price;
    int quantity;

    // No-argument constructor
    Product() {
        productName = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Constructor with product name
    Product(String name) {
        productName = name;
        price = 0;
        quantity = 0;
    }

    // Constructor with product name and price
    Product(String name, double p) {
        productName = name;
        price = p;
        quantity = 0;
    }

    // Constructor with all three values
    Product(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    // Method to calculate total cost
    double calculateTotal() {
        return price * quantity;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
        System.out.println("------------------------");
    }
}

public class practical8 {
    public static void main(String[] args) {

        // Using no-argument constructor
        Product p1 = new Product();

        // Using constructor with product name
        Product p2 = new Product("Laptop");

        // Using constructor with name and price
        Product p3 = new Product("Mobile", 15000);

        // Using constructor with all three values
        Product p4 = new Product("Headphones", 2000, 3);

        // Displaying all product details
        System.out.println("Product 1:");
        p1.display();

        System.out.println("Product 2:");
        p2.display();

        System.out.println("Product 3:");
        p3.display();

        System.out.println("Product 4:");
        p4.display();
    }
}
