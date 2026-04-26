class A {
    void show() {
        System.out.println(" this is show from class A");
    }
}

class B extends A {
    void show() {
        System.out.println(" this is show from class B");
    }
}

public class Methodoverride {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        B obj1 = new B();
        obj1.show();
    }
}
