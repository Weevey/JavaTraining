import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Calculator();
        calcWindow();
    }

    private static void Calculator() {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Please choose your operand (+, -, /, *): ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "/":
                System.out.println((float)number1 / (float)number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Invalid operator chosen");
        }
    }

    public static void calcWindow() {
        // Create a frame for the window
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // build a button
//        JPanel panel = new JPanel();
//        frame.add(panel);
        JButton button1 = new JButton("1");
        button1.setBounds(50,50,25,25);
        frame.add(button1);
        button1.addActionListener(button1.getAction());
        JButton button2 = new JButton("2");
        button2.setBounds(80,50,25,25);
        frame.add(button2);
        JButton button3 = new JButton("3");
        button3.setBounds(110,50,25,25);
        frame.add(button3);
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(50,80,25,25);
        frame.add(buttonPlus);
        // Set button to call button action class sending value
        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(80,80,25,25);
        frame.add(buttonEquals);
        };
    //Create new class for button action
    
    public class EventClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("input1");
        }
    }

    private int input1(int i) {
        return 1;
    }
}