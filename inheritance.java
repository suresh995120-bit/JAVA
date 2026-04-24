class vehicle {
    int noWheels;
    String mode;

    public void start() {
        System.out.println("starting car");
    }

    public void stop() {
        System.out.println("stopping car");
    }
}

class car extends vehicle {
    int mileage;

    public void applybreak() {
        System.out.println("Applying breakes");
    }
}

public class inheritance {
    public static void main(String[] args) {
        car c1 = new car();
        c1.noWheels = 4;
        System.out.println("np of wheels" + c1.noWheels);
        c1.start();
    }
}
