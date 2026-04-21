import java.util.Scanner;

public class prbm4 {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("1");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("0");
        } else {
            System.out.println("-1");

        }
        input.close();
    }

}
