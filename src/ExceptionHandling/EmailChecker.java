package ExceptionHandling;

public class EmailChecker {
    public static void  validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || !email.contains(".")){
    throw  new InvalidEmailException("Invalid email format .");

        }
        System.out.println("Email is valid ");

    }

    public static void main(String[] args) {
        try{
            validateEmail("abcgmail.con");   //incorrect email
        }catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
