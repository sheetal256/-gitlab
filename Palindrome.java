import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equalsIgnoreCase(reversed))
        {
            System.out.println(input + " is a palindrome.");
        }
        else{
            System.out.println(input + " is not a palindrome.");
        }
        scanner.close();
    }
}
