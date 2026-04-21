public class methods {
    public static void main(String[] args) {
        methods m = new methods();
        m.helloworld();
        m.addnumbers(5, 10);
        int result = m.multiplynumbers(5, 10);
        System.out.println(result);

    }

    void helloworld() {
        System.out.println("Hello, World!");
    }

    void addnumbers(int a, int b) {
        System.out.println(a + b);
    }

    int multiplynumbers(int a, int b) {
        return a * b;
    }
}
