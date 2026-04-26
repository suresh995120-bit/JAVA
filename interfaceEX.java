interface person {
    void talk();
}

class student implements person {
    public void talk() {
        System.out.println("student is talking");
    }
}

public class interfaceEX {

    public static void main(String[] args) {
        student s1 = new student();
        s1.talk();
    }
}