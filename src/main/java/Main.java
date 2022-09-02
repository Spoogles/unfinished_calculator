import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        boolean inuse = true;
        while (inuse) {
            System.out.println("Welcome to Calculator 3000!");
            System.out.println("Do you want to:\n(1) Add\n(2) Subtract");
            System.out.println("(3) Multiply\n(4) Divide\n(5) Square root\n(6) Exit");

            inputChecker();
            int input = scanner.nextInt();

            int choice = input;
            switch (choice) {
                case 4:
                    handleDivision();
                    break;
                case 6:
                    inuse = false;
                    System.out.println("You've selected to quit the calculator. Goodbye!");
                    break;
            }
        }

    }


    public static void handleAddition() {

    }


    public static void handleDivision() {
        System.out.println("You've opted for division");
        System.out.println("Enter your numerator: ");
        inputChecker();
        int numerator = scanner.nextInt();
        System.out.println("Enter your denominator: ");
        inputChecker();
        int denominator = scanner.nextInt();
        double quotient = Operations.divide(numerator, denominator);
        System.out.println("The result of " + numerator + " divided by " + denominator + " is " + quotient);
        pressEnterToContinue();
    }


    private static void pressEnterToContinue() {
        System.out.println("Press Enter key to continue");
        try {
            System.in.read();
            scanner.nextLine();
        } catch (Exception e) {
        }
    }
    private static void inputChecker(){
        while (!scanner.hasNextInt()) {
            System.out.println("Please write a number");
            scanner.next();
        }
    }
}