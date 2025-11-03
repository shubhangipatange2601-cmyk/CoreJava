package SwapPractice;

public class swapValue3 {
    public static void main(String[] args) {
        int a = 200;
        int b = 198;

        //using 3rd variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is" +a );
        System.out.println("value of b is" +b );


        //without 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);
    }
}
