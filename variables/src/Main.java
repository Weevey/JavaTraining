import java.io.BufferedReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // nameNumInput();
        // enumsPractice();
        // loopsPractice();
        conditionals();
    }

    public static void enumsPractice() {
        Drink robsonDrink = Drink.HotChocolate;
        Drink steveRsDrink = Drink.Rum;
        Drink steveAsDrink = Drink.Tea;
//        System.out.print("Choose a drink: ");
//        Scanner scanner = new Scanner(System.in);
//        String drinkChoice = scanner.nextLine();
//        Drink choiceOf = Drink.drinkChoice;
        switch (steveAsDrink){
            case Gin:
                System.out.println("No!!!!");
                break;
            case Cider:
                System.out.println("Yes, two please!!!");
                break;
            case Tea:
            case Coffee:
                System.out.println("Would you like milk?");
                break;
            default:
                System.out.println("Choose a valid drink");
                break;
        }
    }
    private static void nameNumInput() {
        String firstName = "Steve", lastName = "Ayres";
        String name = firstName + " " + lastName;
        System.out.println(name);
        int num1 = 23, num2 = 47;
        System.out.println(num1 + num2);
        float result = (float)num1 / (float)num2;
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);
        System.out.print("Enter your full name: ");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        System.out.println("Hello " + fullName);
        System.out.print("Enter a number: ");
        Scanner number1 = new Scanner(System.in);
        int userNum1 = number1.nextInt();
        System.out.print("Enter another number: ");
        Scanner number2 = new Scanner(System.in);
        int userNum2 = number2.nextInt();
        int userSum = userNum1 + userNum2;
        System.out.println("The sum of those numbers is " + userSum);
    }
    public static void loopsPractice() {
        boolean isRaining = true;
        boolean armHurts = true;

        while (isRaining) {
            System.out.println("Take your brolly");
            System.out.println("Put your coat on");

            if (armHurts) {
                break;
            }
        }
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++ ) {
                System.out.println(i + " x " + j +" = " + j*i);
            }
        }
    }
    public static void conditionals() {
        int x = 10;
        while (x>0) {
            System.out.println(x--);
        }
        System.out.println("We have lift off!");
        int y = 10;
        while (y>0) {
            System.out.println("y is " + y);
            y--;
        }
        int sum =0;
        for (int i = 0; i<10; sum += i++) {
  mo          System.out.println("sum is " + sum);
        }
    }

}