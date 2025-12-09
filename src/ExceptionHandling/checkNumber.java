package ExceptionHandling;

 class NumberChecker {
    public static void checkNumber(int num) throws NegativeNumberException{
        if(num < 0) {
            throw new NegativeNumberException("Number cannot be negative!");
        }
        System.out.println("Number is valid: "+ num);



        }
    }

