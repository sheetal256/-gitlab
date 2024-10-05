
import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year: ");
        int year = scanner.nextInt();

        if((year%400==0)||(year%4==0) &&(year%100!=0))
        {
           System.out.println("leapyear"); 
        }
       else{
            System.out.println("not leap year");
        } 
    }
}


