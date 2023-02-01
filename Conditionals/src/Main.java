import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Enter a number: ");
//        Scanner scanner = new Scanner(System.in);
//        int number1 = scanner.nextInt();
//        System.out.print("Enter a second number: ");
//        int number2 = scanner.nextInt();
//        if (number1 > number2)
//            System.out.println(number1);
//        else System.out.println(number2);
//        System.out.print("Gimme another: ");
//        int number3 = scanner.nextInt();
//        if (number3 % 2 == 0) {
//            System.out.println("It's even!");
//        }
//        else {
//            System.out.println("It's an odd one!");
//        }
//        //Scanner lightChoice = new Scanner(System.in);
//        System.out.print("Choose your favorite traffic light colour: ");
//        String choice = scanner.next();
//        switch (choice) {
//            case "red":
//                System.out.println("Red means stop!");
//                break;
//            case "amber":
//                System.out.println("Amber means think about stopping");
//                break;
//            case "green":
//                System.out.println("Green means go");
//                break;
//            default:
//                System.out.println("Not a colour!");
//
//        }
        System.out.print("Gimme a number between 1 and 12: ");
        Scanner scanMonth = new Scanner(System.in);
        int monthNum = scanMonth.nextInt();
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Not a number between 1 and 12");
        }
    }
}