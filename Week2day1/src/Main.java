public class Main {
    public static void main(String[] args) {
        Person p = new Person("Steve", 45, 160);
        System.out.println("Hello world!");
        System.out.println("p3" + p);
        pbv(p);
        System.out.println("p1 " + p);
        int k = 12;
        System.out.println(k);
        k++;
        System.out.println(k);
    }

    private static void pbv(Person handle) {
        handle = null;
        System.out.println(("p2 = " + handle));
    }

}
