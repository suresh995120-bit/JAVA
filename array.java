import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("please enter the marks of a student " + (i + 1));
            arr[i] = s.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        s.close();
    }
}
