package Threading;

public class MultitaskingDemo {
    public static void main(String[] args) {
        try {

            Runtime.getRuntime().exec("notepad.exe");
            Runtime.getRuntime().exec("calc.exe");
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Java program also running");
    }
}
