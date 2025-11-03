package Abstraction;
abstract class Rule5Parent{

    void show(){
        System.out.println("non-abstract method ");
    }
    abstract void test();

    abstract int add();
}

public class AbstractionRule5 extends Rule5Parent{

    @Override
    void test() {
        System.out.println("Implement abstract method ");
    }

    @Override
    int add() {
        return 0;
    }
}
