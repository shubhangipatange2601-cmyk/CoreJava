package Test;
public class SwapArray1 {
    public static void main(String[] args) {
        int a = 200;
        int b = 300;

        //Using 3rd variable
        int temp= a;
        a = b;
        b = temp;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);

        //without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }
}
