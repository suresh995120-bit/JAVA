import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("please enter element for " + i + " row and " + j + " column");
                arr[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        s.close();

    }

}
