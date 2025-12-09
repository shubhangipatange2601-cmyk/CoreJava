package ExceptionHandling;

public class MethodStack {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        System.out.println("Inside the a() method ");
        a();
    }


    static void b() {
        System.out.println("Inside the b() method ");
        b();
    }

    static void c() {
        System.out.println("Inside the c() method ");
    }

    static void d() {
        System.out.println("Inside the d() fmethod ");
    }


}