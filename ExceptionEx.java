
public class ExceptionEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String s = "suresh";
        try {
            int c = a / b;
            System.out.println("the value of c is " + c);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("string index out of bounds");
        } catch (Exception e) {
            System.out.println("exception occured");
        }
    }
}
