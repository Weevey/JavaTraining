import abstraction.Refuelable;
import inheritance.Car;
import inheritance.Lorry;
import inheritance.Motorbike;
import inheritance.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle(); // Now Vehicle is abstract cannot be instantiated
//        Car c = new Car();
//        c.setMake("Landrover");
//        c.setColour("Red");
//        System.out.println(c.getMake() + " " + c.getColour() + " " + c.getNumDoors());
//        Vehicle[] garage= {v, c};
//        System.out.println(garage);
//        System.out.println(v);
        garage();
        System.out.println(recommendType(3100));
        // System.out.println(Refuelable.refuel(32));
    }
    public static void garage() {
        Car car1 = new Car("Landrover", "Freelander", 4, "red", "Estate");

        Motorbike bike1 = new Motorbike("Triumph","600",0,"Black",true);
        Lorry lorry1 = new Lorry("Volvo", "bigLorry", 2, "White", true);
        Motorbike bike2 = new Motorbike("BMW", "X200", 0,"Green", false);
        Lorry lorry2 = new Lorry("Peterbilt", "HugeOne", 2, "red", false);
        Vehicle[] garageContent = {car1, bike1, bike2, lorry1, lorry2};
//        for (Vehicle vehicle : garageContent) {
//            if (vehicle instanceof Car) {
//                System.out.println("This one is a car");
//            } else {
//                System.out.println(vehicle);
//            }
//        }

        for (Vehicle vehicle : garageContent) {
////            int totalCost = 120;
//            String vehType = "";
//            if (vehicle instanceof Car) {
////                totalCost += 100;
//                vehType = "Car";
//            } else if (vehicle instanceof Lorry) {
////                totalCost += 1000;
//                vehType = "Lorry";
//            } else if (vehicle instanceof Motorbike) {
////                totalCost += 80;
//                vehType = "Bike";
//                if (((Motorbike) vehicle).isHasSideCar()) {
////                    totalCost += 213;
//                    vehType += " with side car";
//                }
//            }

            //System.out.println(vehicle.getMake()+ " is a " + vehType + ". Total cost: £" + vehicle.getServiceCost());

            // All the above code is shrunk to the below line, with some additional bits in vehicle, car...

            System.out.println(vehicle.getOutput() + vehicle.getServiceCost() + "\n ================== \n");
        }
    }
    public static Vehicle recommendType(int loadSize) {
        if (loadSize > 1000) {
            return new Lorry(true);
        } else {
            return new Car();
        }
    }
}