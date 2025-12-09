package ExceptionHandling;

import java.util.Scanner;

public class TryCatch1 {
         public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);

            try{
                System.out.println("enter a number ");
                int num = Sc.nextInt();
                System.out.println("You entered: " +num);
            }
            catch(Exception e){
                System.out.println("Invalid input! please enter a number ");

            }
        }

    }

