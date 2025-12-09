package ExceptionHandling;

public class TryCatchBlock {
    public static void main(String[] args) {
        try{
            int age = 12;
            int result = age/0;
        } catch (ArithmeticException e){
            //code that handles the exception
            System.out.println("An error occured:"+e.getMessage());
        }
    }
}
