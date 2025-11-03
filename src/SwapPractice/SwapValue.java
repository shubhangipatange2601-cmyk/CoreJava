package SwapPractice;

public class SwapValue {
    public static void main(String[] args) {
        int a = 2000;
        int b = 3000;

        //using 3rd variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);

        //without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);
    }
}
