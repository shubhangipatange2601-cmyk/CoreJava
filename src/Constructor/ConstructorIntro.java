package Constructor;

public class ConstructorIntro {
    ConstructorIntro(){
        System.out.println("This is Constructor ");
    }

    void ConstructorIntro(){
        System.out.println("This is method same as class name ");
    }

    void test(){
        System.out.println("This is method ");
    }

    public static void main(String[] args) {
        ConstructorIntro obj = new ConstructorIntro();
    }
}

