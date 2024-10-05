class poly{
    public int add(int a, int b){
        return a+b;
    }
    //overload method for add 3 integers
    public int add(int a,int b,int c){
        return a + b + c;
    }
    //overload method for add 2 doubles
    public double add(double a,double b){
        return a + b;
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        poly p = new poly();
        System.out.println("sum of the integers : " + p.add(10,20));
        System.out.println("sum of the integers : " + p.add(10,20,30));
        System.out.println("sum of the integers : " + p.add(10.5,20.5));

    }
}
