
import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        int a = 5;
        char c = 'A';
        double d = 3.14;
        int p;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println("Variable a is: " + a);
        System.out.println("Enter a number: ");
        Scanner v = new Scanner(System.in);
        p = v.nextInt();
        System.out.println("You entered: " + p);
        v.close();

    }
}
