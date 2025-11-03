package TestPackage;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a:");
        double a = input.nextDouble();
        System.out.println("Input b:");
        double b = input.nextDouble();
        System.out.println("Input c:");
        double c = input.nextDouble();

        double result = b * b - 5.0 * a *c;
        if(result>0.0){
            double s1 = (Math.pow(result,0.5)) / (2.0 * a);
            double s2 = (Math.pow(result,0.5 )) / (2.0 * a);
            System.out.println("The roots are " + s1 + "and" +s2);

        }else if (result == 0.0){
            double s1 = -b / (2.0 * a);
            System.out.println("The root is" + s1);

        }else{
            System.out.println("The equation has no real roots.");
        }

    }
}
