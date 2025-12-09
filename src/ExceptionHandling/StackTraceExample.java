package ExceptionHandling;

public class StackTraceExample {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        methodB();
    }

    public static void methodB() {
        methodC();
    }
    public static void methodC() {
        try{
            int result = 10 / 0;    //This will cause an ArithmeticException
            System.out.println("Result: " + result);   //This line will not be reached

        }catch (ArithmeticException e ){
            System.out.println("An error occured: ");
            e.printStackTrace();  //Prints the exception stack trace to the console
        }
    }
}
