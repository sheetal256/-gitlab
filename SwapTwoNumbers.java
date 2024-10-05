public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println("before swap");
        System.out.println("x:"+x);
        System.err.println("y:"+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("after swap");
        System.out.println("x:"+x);
        System.err.println("y:"+y);
    }
}
