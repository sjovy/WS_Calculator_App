package se.lexicon;

import java.util.Scanner;

/*
Subdivided into several methods. No loop for continued use
Problem understanding Scanner method whe used in several methods
 */
public class Calculator_App
{

    public static void main( String[] args )
    {
        double[] numbers = {0, 1, 2};
        int operand;
        double res;

        numbers = Calculator_App.inputScan();
        res = Calculator_App.doMath(numbers[0], numbers[1], numbers[2]);

        System.out.println(res);

    }


    public static double[] inputScan()
    {
        double[] numbers = {0, 1, 2};

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number: ");
            numbers[0] = scanner.nextDouble();
            System.out.println("Enter second number: ");
            numbers[1] = scanner.nextDouble();

            Calculator_App.listItem();

            numbers[2] = scanner.nextDouble();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Invalid input, use comma as decimal separator. ");
            System.exit(0);
        }

        return numbers;
    }


    public static void listItem()
    {
        System.out.println("Select mathematical operation 1-4): ");
        System.out.println("1 = Addition: ");
        System.out.println("2 = Subtraction: ");
        System.out.println("3 = Multiplication: ");
        System.out.println("4 = Division: ");
    }


    public static double doMath(double num1, double num2, double operand)
    {
        double res = 0;
        if (operand % 1 != 0){
            System.out.println("Invalid input, operand needs to be an integer. ");
            System.exit(0);
        }
        switch ((int) operand) {
            case 1:
                res = (num1 + num2);
                break;
            case 2:
                res = (num1 - num2);
                break;
            case 3:
                res = (num1 * num2);
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Invalid. Can't divide by zero");
                    System.exit(0);
                }
                res = (num1 / num2);
                break;
            default:
                System.out.println("Invalid input, only numbers 1 - 4 allowed.");
                System.exit(0);
        }

        return res;
    }

}


