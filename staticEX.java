class person {
    static String cityName;
    String name;
}

public class staticEX {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "Prasad";
        p1.cityName = "Hyderabad";

        person p2 = new person();
        p2.name = "Kakani";
        p2.cityName = "Hyderabad";

        System.out.println(p1.name);
        System.out.println(p1.cityName);

        System.out.println(p2.name);
        System.out.println(p2.cityName);
    }

}
