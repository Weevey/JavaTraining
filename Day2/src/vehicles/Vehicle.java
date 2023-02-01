package vehicles;

// No explicit inheritance therefore we implicitly inherit from java.lang.object
// java.lang.objects has methods included (eg toString, equals etc)
public class Vehicle {
    // create a constructor
    // A special method that is called a instantiation
    // Name the same as the class
    // There is no return type, not even void
    public Vehicle(String color) {
        this.setColor(color);
        this.setModel("Focus");
    }
    // Parameterless constructor
    public Vehicle(){
        this.setColor("Black");
        this.setModel("Fiesta");
    }
    // The above constructors are OVERLOADED
    // Overloading is having the same method with different signatures

    // Instance variable (Each object instance can have it's own data / speed
    // Instance doesn't use a keyword
    // Instance is the opposite of Static
    private int speed = 0;
    private String model = "model-T";
    private String make = "Ford";
    private String color = "Black";
    // Getters and Setters
    // getters are used when we READ an instance variable
    // setters are used when we WRITE an instance variable
    // Model to be read only
    // color to be readable and writable
    public int getSpeed() {
        return speed;
    }
    public String getModel() {
        // Might want to convert the hidden value before I return it
        return model;
    }
    public String getColor() {
        return color.toUpperCase();
    }
    public String getMake() {
        return make;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String drive(String lane) {
        String currentColor = getColor();
        // String currentColor2 = this.color;
        String message = "The "+ currentColor + " vehicle which is a " + make + " " + model + " is driving in the " + lane + " lane at " + speed;
        return message;
    }
}
