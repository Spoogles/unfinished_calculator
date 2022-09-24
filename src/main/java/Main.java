import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        switchmethod();
    }


    public static void switchmethod(){
        boolean inuse = true;
        while (inuse)
        {
            System.out.println("Welcome to Calculator 3000!");
            System.out.println("Do you want to:\n(1) Add\n(2) Subtract");
            System.out.println("(3) Multiply\n(4) Divide\n(5) Square root\n(6) Exit");
            inputChecker();
            double input = scanner.nextDouble();
            int choice = (int) input;


            switch (choice)
            {
                case 1:
                    handleOps.handleAddition();
                    break;

                case 2:
                    handleOps.handleSubtraction();
                    break;

                case 3:
                    handleOps.handleMultiplication();
                    break;

                case 4:
                    handleOps.handleDivision();
                    break;

                case 5:
                    handleOps.handleSqrt();
                    break;

                case 6:
                    inuse = false;
                    System.out.println("You've selected to quit the calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid input, try again");
                    pressEnterToContinue();
                    break;
            }
        }
    }

    public static void pressEnterToContinue() {
        System.out.println("Press Enter to continue");
        try
        {
            System.in.read();
            scanner.nextLine();
        }
        catch (Exception e)
        {}
    }

    public static void inputChecker(){
        while (!scanner.hasNextDouble()) {
        System.out.println("Please write a number");
           scanner.next();
        }
    }
}