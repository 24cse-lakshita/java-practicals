
class Demo {

    // Constructor
    Demo() {
        System.out.println("Object is created");
    }

    // Method
    void show() {
        System.out.println("Object is being used");
    }

    // Method called by garbage collector (not guaranteed)
    protected void finalize() {
        System.out.println("Garbage collector may clean this object");
    }
}

public class practical7 {
    public static void main(String[] args) {

        // Creating an object
        Demo d = new Demo();

        // Using the object
        d.show();

        // Removing the reference
        d = null;

        System.out.println("Object reference removed");

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage collection requested");
    }
}
