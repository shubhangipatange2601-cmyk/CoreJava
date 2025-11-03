package TestPackage;

public class Question9 {
    public static void main(String[] args) {
        //check the leap year
        int Year = 2016;
        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println(Year + "Is  a leap year");
                } else {
                    System.out.println(Year + "Is not a leap year");
                }
            } else {
                System.out.println(Year + "Is a leap year");
            }
        } else {
            System.out.println(Year + "Is not a leap year");
        }
    }
}









