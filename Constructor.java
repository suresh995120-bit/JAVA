public class Constructor {
    int i;
    int j;

    Constructor() {
        System.out.println("This is a constructor");
    }

    Constructor(int i) {
        System.out.println("This is a parameterized constructor");
        this.i = i;
    }

    Constructor(int i, int j) {
        System.out.println("This is a parameterized constructor with two parameters");
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {

        Constructor t = new Constructor();
        Constructor a = new Constructor(25);
        Constructor b = new Constructor(25, 30);

        t.i = 10;
        t.j = 20;

        System.out.println(a.i);
        System.out.println(b.i);
        System.out.println(b.j);
    }
}