package ExceptionHandling;

public class TryCatch {
     public static void main(String[] args) {
            try{
                int a = 100,b=0,c;    //Risky code
                c=a/b;
                System.out.println(c);
            }
            catch (ArithmeticException e){    //Handling code
                System.out.println(e);
            }
        }
    }

