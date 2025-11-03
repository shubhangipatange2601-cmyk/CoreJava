package SwapPractice;

public class Swapvalue2 {

     public static void main(String[] args) {
            int a = 60;
            int b = 30;

            //using 3rd variable
            int temp = a;
            a = b;
            b = temp;
            a = a - b;
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


