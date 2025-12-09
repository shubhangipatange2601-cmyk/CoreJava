package ExceptionHandling;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try{
            NumberChecker.checkNumber(-10);
        }
        catch (NegativeNumberException e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continuous normally ..");
    }

}
