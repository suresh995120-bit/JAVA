abstract class vehicle {

    // abstract method (no body)
    abstract void start();

    // another abstract method
    abstract public void getnofwheels();
}

class Car extends vehicle {

    // implementing start()
    public void start() {
        System.out.println("starting vehicle");
    }

    // implementing getnofwheels()
    public void getnofwheels() {
        System.out.println("number of wheels is 4");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.start();
        c1.getnofwheels();
    }
}
