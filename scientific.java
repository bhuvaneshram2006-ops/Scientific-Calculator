import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double num1, num2;

        do {
            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Logarithm");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = sc.nextDouble();
                    num2 = sc.nextDouble();
                    if (num2 != 0)
                        System.out.println("Result = " + (num1 / num2));
                    else
                        System.out.println("Cannot divide by zero.");
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Square Root = " + Math.sqrt(num1));
                    break;

                case 6:
                    System.out.print("Enter base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();
                    System.out.println("Result = " + Math.pow(num1, num2));
                    break;

                case 7:
                    System.out.print("Enter angle (degrees): ");
                    num1 = sc.nextDouble();
                    System.out.println("Sin = " + Math.sin(Math.toRadians(num1)));
                    break;

                case 8:
                    System.out.print("Enter angle (degrees): ");
                    num1 = sc.nextDouble();
                    System.out.println("Cos = " + Math.cos(Math.toRadians(num1)));
                    break;

                case 9:
                    System.out.print("Enter angle (degrees): ");
                    num1 = sc.nextDouble();
                    System.out.println("Tan = " + Math.tan(Math.toRadians(num1)));
                    break;

                case 10:
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 > 0)
                        System.out.println("Log = " + Math.log10(num1));
                    else
                        System.out.println("Logarithm undefined for zero or negative numbers.");
                    break;

                case 11:
                    System.out.println("Thank you for using Scientific Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 11);

        sc.close();
    }
}