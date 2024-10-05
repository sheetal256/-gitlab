import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        while(n!=0){
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
            if(n==rev)
            {
                System.out.println("given number is palindrome"+ rev);
            }
            else{
                System.out.println("not palindrome");
            }
        }
    }

}