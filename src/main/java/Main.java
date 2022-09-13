

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

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
                    handleAddition();
                    break;

                case 2:
                    handleSubtraction();
                    break;

                case 3:
                    handleMultiplication();
                    break;

                case 4:
                    handleDivision();
                    break;

                case 5:
                    handleSqrt();
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




    public static void handleAddition()
    {
        System.out.println("You've opted for addition");
        System.out.println("Enter your first term: ");
        inputChecker();
        double term1 = scanner.nextDouble();
        System.out.println("Enter your second term: ");
        inputChecker();
        double term2 = scanner.nextDouble();
        double sum = Operations.add(term1, term2);
        System.out.println("The result of " + term1 + " plus " + term2 + " is " + sum);
        pressEnterToContinue();
    }

    public static void handleSubtraction()
    {
        System.out.println("You've opted for subtraction");
        System.out.println("Enter your first term: ");
        inputChecker();
        double term1 = scanner.nextDouble();
        System.out.println("Enter your second term: ");
        inputChecker();
        double term2 = scanner.nextDouble();
        double difference = Operations.subtract(term1, term2);
        System.out.println("The result of " + term1 + " minus " + term2 + " is " + difference);
        pressEnterToContinue();
    }

    public static void handleMultiplication()
    {
        System.out.println("You've opted for multiplication");
        System.out.println("Enter your first factor: ");
        inputChecker();
        double factor1 = scanner.nextDouble();
        System.out.println("Enter your second factor: ");
        inputChecker();
        double factor2 = scanner.nextDouble();
        double product = Operations.multiply(factor1, factor2);
        System.out.println("The result of " + factor1 + " times " + factor2 + " is " + product);
        pressEnterToContinue();
    }
    public static void handleDivision()
    {
        System.out.println("You've opted for division");
        System.out.println("Enter your numerator: ");
        inputChecker();
        double numerator = scanner.nextDouble();
        System.out.println("Enter your denominator: ");
        inputChecker();
        double denominator = scanner.nextDouble();
        double quotient = Operations.divide(numerator, denominator);
        System.out.println("The result of " + numerator + " divided by " + denominator + " is " + quotient);
        pressEnterToContinue();
    }

    public static void handleSqrt()
    {
        System.out.println("You've opted for square root");
        System.out.println("Enter your radicand: ");
        inputChecker();
        double radicand = scanner.nextDouble();
        double result = Operations.sqrt(radicand);
        System.out.println("The result of " + radicand + " squared " + " is " + result);
        pressEnterToContinue();
    }


    private static void pressEnterToContinue()
    {
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