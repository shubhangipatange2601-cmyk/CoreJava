package Abstraction;

public class AbstractionRule4 {
}

abstract class Rule4Parent{
    abstract void show();
}

abstract class Rule4Child{
    void show() {
        System.out.println("Implemented abstract method of parent class ");
    }
}
