package se.lexicon;

import java.util.Scanner;

public class App 
{

    public static void main( String[] args )
    {
        double num1, num2;
        int num3;
        double res = 0;
        char choice = 'Y';

        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input, use comma as decimal separator. ");
                return;
            }
            System.out.println("Select mathematical operation 1-4): ");
            System.out.println("1 = Addition: ");
            System.out.println("2 = Subtraction: ");
            System.out.println("3 = Multiplication: ");
            System.out.println("4 = Division: ");
            num3 = scanner.nextInt();
            switch (num3) {
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
                    res = (num1 / num2);
                    break;
                default:
                    System.out.println("Invalid input, only numbers 1 - 4 allowed.");
                    return;
            }

            System.out.println(res);
            System.out.println("Press \"Y\" to continue or any to exit: ");
            choice = scanner.next().charAt(0);
            }   while (choice == 'Y' || choice == 'y');

        scanner.close();
    }

}
