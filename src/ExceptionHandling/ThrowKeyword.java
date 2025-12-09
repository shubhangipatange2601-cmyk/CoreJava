package ExceptionHandling;

public class ThrowKeyword {
    public static void main(String[] args) {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);

    }

    void divide(){
        int a = 100,b = 0, c;
        c = a/b;
        System.out.println(c);   // exception object create
    }


}
