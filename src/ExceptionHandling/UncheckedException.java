package ExceptionHandling;

public class UncheckedException {
    public static void main(String[] args) {
        try{
            int age = 12;
            int result = age/0;
        } catch (ArithmeticException e){
            System.out.println("An error occurred: "+ e.getMessage());

        }
    }
}
  //FileName: ExceptionHandlingSampleB.java
//public class UncheckedExceptionA {
   // public static void main(String[] args) {
        //int age = 12;
      //  int result = age/0;
//}
//}