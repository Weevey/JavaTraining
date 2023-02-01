package inheritance;

import abstraction.Refuelable;

public abstract class Vehicle implements Refuelable {

    private String make;
    private String model;
    private int numDoors = 4;
    private String colour;
    private int speed;
    private int fuel;
    public abstract void honkHorn(); // Every vehicle can make a noise, but we aren't saying what it is
    public String getOutput() {
        return output;
    }

    @Override
    public void refuel() {
        this.fuel = 30;
    }
    public void setOutput(String output) {
        this.output = output;
    }

    private String output = "Bill produced: \n  Vehicle type: ";
    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }

    private int serviceCost = 140;



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }
    public void brake() {
        this.speed = 0;
    }
    public Vehicle() {
        super();
    }

    public Vehicle(String make, String model, int numDoors, String colour) {
        super();
        this.make = make;
        this.model = model;
        this.numDoors = numDoors;
        this.colour = colour;

    }

    @Override
    public String toString() {

        return "Vehicle{" +
                    "Make='" + make + '\'' +
                    ", Model='" + model + '\'' +
                    ", Number of doors=" + numDoors +
                    ", Colour='" + colour + '\'' +
                    '}';

    }
}
