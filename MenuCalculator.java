import java.util.Scanner;

public class MenuCalculator {

    // Methods for operations
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return (double) a / b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("\nEnter first number: ");
            int x = sc.nextInt();

            System.out.print("Enter second number: ");
            int y = sc.nextInt();

            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(x, y));
                    break;
                case 2:
                    System.out.println("Result: " + sub(x, y));
                    break;
                case 3:
                    System.out.println("Result: " + mul(x, y));
                    break;
                case 4:
                    System.out.println("Result: " + div(x, y));
                    break;
                case 5:
                    keepRunning = false;
                    System.out.println("Exiting Calculator... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}