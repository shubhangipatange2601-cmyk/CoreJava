package SwapPractice;

public class SwapValue4 {
    public static void main(String[] args) {
        int a = 300;
        int b = 600;

        //swap values using 3rd variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is" + a );
        System.out.println("value of b is" + b);

        //Swap without 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);
    }
}
