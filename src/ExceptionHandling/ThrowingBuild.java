package ExceptionHandling;

public class ThrowingBuild  {
    public static void main(String[] args) {
        int age = 15;
        if(age<18) {
            throw new ArithmeticException("age must be 18 or above ");
        }

        System.out.println("You can vote ");
    }

}
