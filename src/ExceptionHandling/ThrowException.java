package ExceptionHandling;

public class ThrowException {
    public static void main(String[] args) throws ArithmeticException {
        halfAge(10, 2);
        halfAge(10, 0);
    }

    public static void halfAge(int num1,int num2) throws ArithmeticException{
        if(num2 == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
      int result = num1 / num2;
        System.out.println("Result: " + result);

    }

    }

