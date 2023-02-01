package inheritance;

public class Car extends Vehicle {
    @Override
    public void honkHorn() {

    }

    public Car() {
        super();
    }

    public String getBootType() {
        return BootType;
    }

    public void setBootType(String bootType) {
        BootType = bootType;
    }

    private String BootType;


    public int getCarAddtionalCost() {
        return carAddtionalCost;
    }


    public void setCarAddtionalCost(int carAddtionalCost) {
        this.carAddtionalCost = carAddtionalCost;
    }

    private int carAddtionalCost = 100;
    private String carMessage = "Car\n";

    public Car(String make, String model, int numDoors, String colour, String bootType) {
        super(make, model, numDoors, colour);
        this.BootType = bootType;
        setServiceCost(getServiceCost() + getCarAddtionalCost());
        setOutput(getOutput() + carMessage + "  Total Cost: £");
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make = " + getMake() +
                ", Model = " + getModel()+
                ", numDoors  = " + getNumDoors() +
                ", BootType='" + BootType + '\'' +
                '}';
    }

    @Override
    public void refuel(int fuel) {

    }
}
