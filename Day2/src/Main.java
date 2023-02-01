import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // call the sayHello method
//        sayHello("Steve");
//        sayHello("StAve");
       // driveVehicles();
//        dataTypesPractice();
//        compoundPostscripts();
        castingPractice();
//        exerciseOne();
        //objectReferences();
    }

    private static void exerciseOne() {
        int x = 3, y = 5;
        if (x >= 0)
            if (y < x)
                System.out.println("Y is less than x");
        else
            System.out.println("x is negative");
        int z = 15, a = 24;
        if (z%2 == 0 && a%2 == 0)
            System.out.println("x and y are even");
        else
            System.out.println("x or y is odd");
    }

    private static void castingPractice() {
        long biggishNumber = 123456789;
        System.out.println(biggishNumber);
        int storedAsInt = (int)biggishNumber; // cast as an int
        System.out.println(storedAsInt);
        short storedAsShort = (short)biggishNumber; // cast as a short
        System.out.println(storedAsShort);
    }

    private static void compoundPostscripts() {
        int x = 5;
        int y = 10;
        int z;
        z = 25;
        System.out.println(x);
        // compound assignment
        x *= y;
        System.out.println(x);
        z++;
        System.out.println(z);
        z--;
        System.out.println(z);
        --z;
        System.out.println(z);
        z++;
        System.out.println(z);
        z = 5;
        x = z++;
        z = 5;
        y = ++z;
        System.out.println(x);
        System.out.println(y);
    }

    private static void dataTypesPractice() { // Use Refactor - Extract as method to create a method from some code!
        // int is a primitve type
        // String is a reference type();
        int age = 31;
        boolean isHungary = true;
        String name = "Steve";
        char favLetter = 'd';
        long aLong = 42L;
        char[] chars = {'a', 'b'};
        float average = 2.5f;
        double largeAverage = 456877.23456;
        short mum = 43;
        int sizeOf = 200;
        int big = sizeOf * sizeOf * sizeOf;
        long bigger = big+big + big;
        boolean max = big > bigger;
    }

    public static void sayHello(String name) {
        String greeting = "Hello " + name; // Concatenation (operator overloading)
        System.out.println(greeting);
    }
    public static void driveVehicles() {
        // Instantiate a vehicle object
        // Use the 'new' keyword to do this
        Vehicle vehicle1 = new Vehicle("Green");
        // Drive the vehicle object
        // Instantiate a second vehicle object
        Vehicle vehicle2 = new Vehicle("Gold");
        // Drive the second one
        vehicle1.setColor("Yellow");
        vehicle2.setColor("Red");
        Vehicle vehicle3 = new Vehicle();
        vehicle1.setMake("Ferrari");
        vehicle1.setModel("F40");
        vehicle1.setSpeed(129);
        vehicle2.setMake("Landrover");
        vehicle2.setModel("Freelander2");
        String veh1 = vehicle1.drive("left");
        String veh2 = vehicle2.drive("right");
        String veh3 = vehicle3.drive("left");
        System.out.println(veh2);
        System.out.println(veh1);
        System.out.println(veh3);
        System.out.println(vehicle1.getSpeed() + vehicle1.getModel() + vehicle1.getMake());
        Vehicle v4 = new Vehicle();
        System.out.println(v4.getModel());
    }

    public static void flowControl() {
        int speed = 50;
        switch( speed ) {
            case 30:
                System.out.println("Speed good");
            case 50:
                System.out.println("Speed bad");
            default:
                System.out.println("Nothing to report");
        }
    }
    public static void objectReferences() {
        // Instantiate vehicle called V1
        Vehicle v1 = new Vehicle("Blue");
        // Instantiate a vehicle called v2
        Vehicle v2 = new Vehicle();
        // v1 should be silver
        v1.setColor("Silver");
        // v2 should be pink
        v2.setColor("Pink");
        Vehicle v3 = v2;
        System.out.println(v3.getColor());
        v2.setColor("Red");
        v3.setColor("Orange");
        System.out.println(v3.getColor());
        System.out.println(v3.getSpeed());
    }
}