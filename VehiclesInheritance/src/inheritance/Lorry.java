package inheritance;

public class Lorry extends Vehicle {
    private boolean trailerAttached;
    private int lorryCharge = 400;
    private int trailerCharge = 1000;
    private String lorryMessage = "Lorry";
    private String trailerMessage = "  Trailer surcharge added";
    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }

    public Lorry(boolean trailerAttached) {
        super();
        this.trailerAttached = trailerAttached;
    }
    public Lorry(String make, String model, int numDoors, String colour, boolean trailerAttached){
        super(make, model, numDoors, colour);
        this.trailerAttached = trailerAttached;
        setServiceCost(getServiceCost() + lorryCharge);
        setOutput(getOutput() + lorryMessage + "\n");
        if (trailerAttached) {
            setServiceCost(getServiceCost() + trailerCharge);
            setOutput(getOutput() + trailerMessage + "\n");
        }
        setOutput(getOutput()+ "  Total Cost: £");
    }

    @Override
    public void honkHorn() {

    }

    @Override
    public String toString() {
        return "Lorry{" +
                "trailerAttached=" + trailerAttached +
                ", lorryCharge=" + lorryCharge +
                ", trailerCharge=" + trailerCharge +
                ", lorryMessage='" + lorryMessage + '\'' +
                ", trailerMessage='" + trailerMessage + '\'' +
                '}';
    }

    @Override
    public void refuel(int fuel) {

    }
}
