package SwapPractice;

public class SwapValue6 {
    public static void main(String[] args) {
        int a = 60;
        int b = 98;

        //using 3rd variable
        int temp = 0;
        a = b;
        b = temp;
        System.out.println("value of a is" + a);
        System.out.println("value of b is" +b);

        //without using 3rd variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);
    }
}
