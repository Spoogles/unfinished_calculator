public class handleOps {
    public static void handleAddition()
    {
        System.out.println("You've opted for addition");
        System.out.println("Enter your first term: ");
        Main.inputChecker();
        double term1 = Main.scanner.nextDouble();
        System.out.println("Enter your second term: ");
        Main.inputChecker();
        double term2 = Main.scanner.nextDouble();
        double sum = Operations.add(term1, term2);
        System.out.println("The result of " + term1 + " plus " + term2 + " is " + sum);
        Main.pressEnterToContinue();
    }

    public static void handleSubtraction()
    {
        System.out.println("You've opted for subtraction");
        System.out.println("Enter your first term: ");
        Main.inputChecker();
        double term1 = Main.scanner.nextDouble();
        System.out.println("Enter your second term: ");
        Main.inputChecker();
        double term2 = Main.scanner.nextDouble();
        double difference = Operations.subtract(term1, term2);
        System.out.println("The result of " + term1 + " minus " + term2 + " is " + difference);
        Main.pressEnterToContinue();
    }

    public static void handleMultiplication()
    {
        System.out.println("You've opted for multiplication");
        System.out.println("Enter your first factor: ");
        Main.inputChecker();
        double factor1 = Main.scanner.nextDouble();
        System.out.println("Enter your second factor: ");
        Main.inputChecker();
        double factor2 = Main.scanner.nextDouble();
        double product = Operations.multiply(factor1, factor2);
        System.out.println("The result of " + factor1 + " times " + factor2 + " is " + product);
        Main.pressEnterToContinue();
    }
    public static void handleDivision()
    {
        System.out.println("You've opted for division");
        System.out.println("Enter your numerator: ");
        Main.inputChecker();
        double numerator = Main.scanner.nextDouble();
        System.out.println("Enter your denominator: ");
        Main.inputChecker();
        double denominator = Main.scanner.nextDouble();
        double quotient = Operations.divide(numerator, denominator);
        System.out.println("The result of " + numerator + " divided by " + denominator + " is " + quotient);
        Main.pressEnterToContinue();
    }

    public static void handleSqrt()
    {
        System.out.println("You've opted for square root");
        System.out.println("Enter your radicand: ");
        Main.inputChecker();
        double radicand = Main.scanner.nextDouble();
        double result = Operations.sqrt(radicand);
        System.out.println("The result of " + radicand + " squared " + " is " + result);
        Main.pressEnterToContinue();
    }


}
