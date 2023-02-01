package abstraction;

public interface Refuelable {
    int maxFuel = 40; // Implicitly public FINAL
    void refuel(); // no access modifier or body - by default public abstract. No attributes
    void refuel(int fuel); // overloaded
}
