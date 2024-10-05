import java.util.Scanner;
public class Open{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doorCode;
        System.out.println("enter a number");
        int n=scanner.nextInt();

        if (n>=0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }
}
