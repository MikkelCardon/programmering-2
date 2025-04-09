package opgave03.models;

public class Main {
    public static void main(String[] args) {
        BagClass<String> bagClass = new BagClass<>();
        bagClass.add("Hello");
        bagClass.add("World");
        bagClass.add("Hello");
        bagClass.add("Test");

        System.out.println(bagClass.getCount("Hello"));

        bagClass.remove("World");
        System.out.println(bagClass.getCount("World"));

        for (String aClass : bagClass) {
            System.out.println(aClass);
        }
    }
}
