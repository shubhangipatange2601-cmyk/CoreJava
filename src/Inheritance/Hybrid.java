package Inheritance;

class A {
    void displayA(){
        System.out.println("class A method ");
    }
}

class B extends A {
    void displayB(){
        System.out.println("class B method ");
    }
}

interface C {
    void displayC();
}

//class D inherits class B and implements interface C
class D extends B implements C{
    public void displayC() {
        System.out.println("Interface C method implement ");

    }
}

public class Hybrid {
    public static void main(String[] args) {
        D obj = new D();
        obj.displayA();       //From class A
        obj.displayB();       //From class B
        obj.displayC();       //From Interface C
    }
}
