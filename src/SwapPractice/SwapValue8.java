package SwapPractice;

public class SwapValue8 {
    public static void main(String[] args) {
        int a = 3980;
        int b = 4000;

        //swap using 3rd variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);

        //swap value without 3rd variable
         a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("value of a is" +a);
        System.out.println("value of b is" +b);

    }
}
