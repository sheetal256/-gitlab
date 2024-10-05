import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("enter the first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.println("enter the second floating-pont number: ");
        float num2 = scanner.nextFloat();

        float product = num1 * num2;

        System.out.println("the product of " + num1 + " and " + num2 + " is: " + product);
        scanner.close();
    }
}