import java.sql.SQLOutput;

// A class is a capsule for code
// A class is a template or blueprint
// Public is an "Access modifier"
public class Main { // top line is the signature
    // access modifier is public - this is the most visible
    // static means the method belongs to the class (the class does not need to be instantiated)
    // The opposite of a static method is an INSTANCE method
    // void - this method doesn't return anything
    // main - the name of the method and is the entry point
// Create method
// A method is a function that belongs to a class
    // Java is a typed language (we need datatypes for variables and paras)
    // There is one parameter(args). It is an array of string type (square bracket [ ] means ARRAY)
    public static void main(String[] args) {
        // println (print line) outputs strings to the standard output stream
        // The string Hello world is the only parameter passed to the method in this case
        System.out.println("Hello World");
    }
}
