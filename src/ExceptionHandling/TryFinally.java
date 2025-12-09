package ExceptionHandling;

public class TryFinally {
    public static void main(String[] args) {
        try{
            int a = 100 / 10;
        }catch(ArithmeticException ae ){
            System.out.println("Got  Exception ");
            ae.printStackTrace();

        } finally{
            System.out.println("Finally block :: code will always gets executed " + "Whether exception occurs or not ");
        }
    }
}
