
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing the doc...");
    }

    public void scan() {
        System.out.println("Scanning the doc...");
    }
}

public class practical3{
    public static void main(String[] args) {

        AllInOnePrinter p = new AllInOnePrinter();

        p.print();
        p.scan();
    }
}
