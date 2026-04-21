public class nestedif {
    public static void main(String[] args) {
        int age = 18;
        boolean haslicense = true;
        if (age >= 18) {
            if (haslicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You need a license to drive.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }
    }
}
