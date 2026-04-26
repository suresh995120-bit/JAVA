public class Methodoverload {
    void show(int a) {
        System.out.println("the value of a is 2" + a);
    }

    void show(char k) {
        System.out.println("the name is suresh " + k);
    }

    public static void main(String[] args) {
        Methodoverload m1 = new Methodoverload();
        m1.show(2);
        m1.show('k');
    }
}