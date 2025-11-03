package SwapPractice;

public class SwapValue1 {
    public static void main(String[] args) {
        int a = 200;
        int b = 400;

        //using 3rd variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);


        //without 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a is" +a);
        System.out.println("value of b is" +b);


    }

}
