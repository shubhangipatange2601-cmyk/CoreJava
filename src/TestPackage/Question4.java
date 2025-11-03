package TestPackage;

public class Question4 {
    public static void main(String[] args) {
        //number = 0 => zero num
        //number >0 => positive num
        //number <0 => negative num
        int a = 25;
        if (a == 0) {
            System.out.println(a + "number is zero");
        } else if (a > 0) {
            System.out.println(a + "number is positive");
        } else if (a < 0) {
            System.out.println(a + "number is negative");
        } else {
            System.out.println(a + "number is invalid");
        }

    }
}
