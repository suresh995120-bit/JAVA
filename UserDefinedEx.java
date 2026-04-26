// Custom Exception Class
class Suresh extends Exception {
    public Suresh(String message) {
        super(message);
    }
}

// Main Class
public class UserDefinedEx {

    void vote(int age) throws Suresh {
        if (age < 18) {
            throw new Suresh("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        UserDefinedEx obj = new UserDefinedEx();

        try {
            obj.vote(17);
        } catch (Suresh e) {
            System.out.println(e.getMessage());
        }
    }
}