package Constructor;

public class DefaultValues {
    int age;
    boolean isItGoingToRain;
    short s;
    long l;
    String name;
    char c;
    double dd;

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default value of  int is "+obj.age);
        System.out.println("Default value of  boolean is "+obj.isItGoingToRain);
        System.out.println("Default value of  short is "+obj.s);
        System.out.println("Default value of  long is "+obj.l);
        System.out.println("Default value of  String is "+obj.name);
        System.out.println("Default value of  char is "+obj.c);
        System.out.println("Default value of  double is "+obj.dd);

    }
}
