package ExceptionHandling;

public class CustomException {
    public static void checkAge(int age) throws AgeInvalidException{
        if (age<18) {
            //Using "throw"
            throw new AgeInvalidException("Age is below 18.Not eligible.");
        }else{
            System.out.println("Age is valid. you are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);    //Passing invalid age triggers exception
        } catch (AgeInvalidException e){
            System.out.println("custom Exception occured: " + e.getMessage());
            e.printStackTrace();

        }
    }
}
