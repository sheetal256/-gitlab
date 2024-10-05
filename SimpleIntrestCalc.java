import java.util.*;

public class SimpleIntrestCalc {
    public static void main(String[] args) {
        System.err.println("enter prinipal:");
        Scanner sc = new Scanner(System.in);
        int p =sc.nextInt();
        System.out.println("enter rate:");
        int r=sc.nextInt();
        System.out.println("enter time:");
        int t=sc.nextInt();
        int intrest=(p*r*t)/100;
        System.out.println("principal:"+p);
        System.out.println("rate:"+r);
        System.out.println("intrest:"+intrest);
    }
}
