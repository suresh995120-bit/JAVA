public class prbm8 {
    public static String getSum(int a, int b) {
        int sum = a + b;
        return "The sum of " + a + " and " + b + " is: " + sum;
    }

    public static void main(String[] args) {
        prbm8 obj = new prbm8();
        System.out.println(prbm8.getSum(5, 10));
    }
}
