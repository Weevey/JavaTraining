package inheritance;

public class Motorbike extends Vehicle{
    private boolean hasSideCar;
    private int bikeCharge = -20;
    private int sideCarCharge = 180;
    private String bikeMessage = "Bike";
    private String sideCarMessage = "  SideCar surcharge added";
    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public Motorbike(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }
    public Motorbike(String make, String model, int numDoors, String colour, boolean hasSideCar){
        super(make, model, numDoors, colour);
        this.hasSideCar = hasSideCar;
        setServiceCost(getServiceCost() + bikeCharge);
        setOutput(getOutput() +bikeMessage + "\n");
        if (hasSideCar) {
            setServiceCost(getServiceCost()+sideCarCharge);
            setOutput(getOutput() + sideCarMessage + "\n");
        }
        setOutput(getOutput() +  "  Total Cost: £");
    }

    @Override
    public void honkHorn() {

    }

    @Override
    public void refuel(int fuel) {

    }
}
