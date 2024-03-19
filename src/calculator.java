import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation: ");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            choice = scanner.next().charAt(0);
            double result = 0;

            switch (choice) {
                case '1':
                    result = num1 + num2;
                    break;
                case '2':
                    result = num1 - num2;
                    break;
                case '3':
                    result = num1 * num2;
                    break;
                case '4':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                case '5':
                    System.out.println("Exiting calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a valid operation.");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.println("Do you want to continue? (Y/N)");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("Exiting calculator. Goodbye!");
        scanner.close();
    }
}
