package Constructor;

public class IntroToConstructor {

    IntroToConstructor() {
        System.out.println("This is constructor ");
        return;
    }

    void IntroToConstructor() {
        System.out.println("This is method same as class name ");
    }

    void test() {
        System.out.println("This is test method ");
        return;
    }


    public static void main(String[] args) {
        IntroToConstructor obj = new IntroToConstructor();

    }
}